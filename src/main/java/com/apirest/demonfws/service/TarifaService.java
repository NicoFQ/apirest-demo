package com.apirest.demonfws.service;

import java.time.LocalDateTime;

import com.apirest.demonfws.dto.TarifaAplicadaDTO;
import com.apirest.demonfws.dto.TarifaDTO;

import org.springframework.web.server.ResponseStatusException;

public interface TarifaService {

    /**
     * Recupera la tarifa de un producto en una determinada fecha.
     * 
     * @param idProducto
     * @param idCadena
     * @param fechaAplicable
     * @return Tarifa apliacada
     */
    TarifaAplicadaDTO obtenerTarifaAplicable(int idProducto, int idCadena, LocalDateTime fechaAplicable) throws ResponseStatusException;

    TarifaDTO obtenerTarifa(int id) throws ResponseStatusException;
    

}
