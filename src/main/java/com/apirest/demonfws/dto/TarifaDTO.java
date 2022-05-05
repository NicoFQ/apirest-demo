package com.apirest.demonfws.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.apirest.demonfws.entity.Tarifa;

import org.springframework.hateoas.RepresentationModel;

public class TarifaDTO extends RepresentationModel<TarifaDTO>{
    
    private int id;
    private int idCadena;
    private LocalDateTime fechaInicio;
    private LocalDateTime fechaFin;
    private int idProducto;
    private int prioridad;
    private BigDecimal precio;
    private String moneda;
    
    public TarifaDTO(@JsonProperty("tarifa") Tarifa tarifa) {
        this.id = tarifa.getId();
        this.idCadena = tarifa.getIdCadena();
        this.fechaInicio = tarifa.getFechaInicio();
        this.fechaFin = tarifa.getFechaFin();
        this.idProducto = tarifa.getIdProducto();
        this.prioridad = tarifa.getPrioridad();
        this.precio = tarifa.getPrecio();
        this.moneda = tarifa.getMoneda();
    }

    public TarifaDTO() { }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdCadena() {
        return idCadena;
    }

    public void setIdCadena(int idCadena) {
        this.idCadena = idCadena;
    }

    public LocalDateTime getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDateTime fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDateTime getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDateTime fechaFin) {
        this.fechaFin = fechaFin;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    public BigDecimal getPrecio() {
        return precio;
    }

    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    

}
