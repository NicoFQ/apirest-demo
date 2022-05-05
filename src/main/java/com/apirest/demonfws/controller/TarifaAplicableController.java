package com.apirest.demonfws.controller;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

import java.time.LocalDateTime;

import com.apirest.demonfws.Constantes;
import com.apirest.demonfws.dto.TarifaAplicadaDTO;
import com.apirest.demonfws.dto.TarifaDTO;
import com.apirest.demonfws.service.TarifaService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TarifaAplicableController {

	private final Logger LOGGER = LoggerFactory.getLogger(TarifaAplicableController.class);
    
	@Autowired
	private TarifaService tarifaService;

	/**
	 * Recupera la tarifa de un producto en una determinada fecha.
	 * 
	 * @param idProducto
	 * @param idCadena
	 * @param fechaAplicable
	 * @return HttpEntity<TarifaAplicadaDTO>
	 */
    @GetMapping("/tarifas")
	public HttpEntity<TarifaAplicadaDTO> obtenerTarifaAplicable(@RequestParam int idProducto, @RequestParam int idCadena, @DateTimeFormat(pattern=Constantes.FORMATO_FECHA) @RequestParam LocalDateTime fechaAplicable) {
		
		LOGGER.info("GET: {}", linkTo(methodOn(TarifaAplicableController.class).obtenerTarifaAplicable(idProducto, idCadena, fechaAplicable)).toUri());

		TarifaAplicadaDTO tarifaAplicada = tarifaService.obtenerTarifaAplicable(idProducto, idCadena, fechaAplicable);
		tarifaAplicada.add(linkTo(methodOn(TarifaAplicableController.class).obtenerTarifa(tarifaAplicada.getId())).withSelfRel());
		
		return new ResponseEntity<>(tarifaAplicada, HttpStatus.OK);
	}

	/**
     * Controlador auxiliar que complementa a obtenerTarifaAplicable.
     */
	@GetMapping("/tarifas/{id}")
	public HttpEntity<TarifaDTO> obtenerTarifa(@PathVariable (value = "id") int id) {
		
		TarifaDTO tarifaDto = tarifaService.obtenerTarifa(id);
		tarifaDto.add(linkTo(methodOn(TarifaAplicableController.class).obtenerTarifa(id)).withSelfRel());
		
		return new ResponseEntity<>(tarifaDto, HttpStatus.OK);
	}

}
