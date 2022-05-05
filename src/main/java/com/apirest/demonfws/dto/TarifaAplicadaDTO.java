package com.apirest.demonfws.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.apirest.demonfws.entity.Tarifa;

import org.springframework.hateoas.RepresentationModel;

public class TarifaAplicadaDTO extends RepresentationModel<TarifaAplicadaDTO>{
    private Integer id;
    private Integer idCadena;
    private LocalDateTime fechaInicio;
    private LocalDateTime fechaFin;
    private Integer idProducto;
    private BigDecimal precio;

    public TarifaAplicadaDTO(){
        super();
    }

    @JsonCreator
    public TarifaAplicadaDTO(@JsonProperty("tarifa")Tarifa tarifa){
        this.id = tarifa.getId();
        this.idCadena = tarifa.getIdCadena();
        this.fechaInicio = tarifa.getFechaInicio();
        this.fechaFin = tarifa.getFechaFin();
        this.idProducto = tarifa.getIdProducto();
        this.precio = tarifa.getPrecio();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdCadena() {
        return idCadena;
    }

    public void setIdCadena(Integer idCadena) {
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

    public Integer getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }

    public BigDecimal getPrecio() {
        return precio;
    }

    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }

    
}
