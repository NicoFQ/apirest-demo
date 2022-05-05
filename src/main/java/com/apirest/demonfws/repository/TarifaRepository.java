package com.apirest.demonfws.repository;

import java.time.LocalDateTime;
import java.util.Optional;

import com.apirest.demonfws.entity.Tarifa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface TarifaRepository extends JpaRepository<Tarifa, Integer> {


    /**
     * Recupera la tarifa de un producto en una determinada fecha.
     * 
     * @param idProducto
     * @param idCadena
     * @param fecha
     * @return Tarifa apliacada
     */
    @Query(nativeQuery = true)
    Optional<Tarifa> obtenerTarifaAplicable(int idProducto, int idCadena, LocalDateTime fecha);

}
