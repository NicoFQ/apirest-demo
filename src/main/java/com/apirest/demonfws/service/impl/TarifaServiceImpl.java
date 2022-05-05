package com.apirest.demonfws.service.impl;

import java.time.LocalDateTime;
import java.util.Optional;

import com.apirest.demonfws.dto.TarifaAplicadaDTO;
import com.apirest.demonfws.dto.TarifaDTO;
import com.apirest.demonfws.entity.Tarifa;
import com.apirest.demonfws.repository.TarifaRepository;
import com.apirest.demonfws.service.TarifaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class TarifaServiceImpl implements TarifaService{

    @Autowired
    TarifaRepository tarifasRepository;

    @Override
    public TarifaAplicadaDTO obtenerTarifaAplicable(int idProducto, int idCadena, LocalDateTime fechaAplicable) throws ResponseStatusException{
        Optional<Tarifa> optionalTarifa = tarifasRepository.obtenerTarifaAplicable(idProducto, idCadena, fechaAplicable);

		if(!optionalTarifa.isPresent()) throw new ResponseStatusException(HttpStatus.NOT_FOUND);

        return new TarifaAplicadaDTO(optionalTarifa.get());
    }

    /**
     * Metodo auxiliar que complementa a obtenerTarifaAplicable.
     */
    @Override
    public TarifaDTO obtenerTarifa(int id) throws ResponseStatusException {
        Optional<Tarifa> optionalTarifa = tarifasRepository.findById(id);

        if(!optionalTarifa.isPresent()) throw new ResponseStatusException(HttpStatus.NOT_FOUND);

        return new TarifaDTO(optionalTarifa.get());
    }
}
