package com.apirest.demonfws.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tarifas")
public class Tarifa {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private Integer idCadena;
    private LocalDateTime fechaInicio;
    private LocalDateTime fechaFin;
    private Integer idProducto;
    private Integer prioridad;
    private BigDecimal precio;
    private String moneda;

    public Tarifa(){
        super();
    }

    public Tarifa(Integer id, Integer idCadena, LocalDateTime fechaInicio, LocalDateTime fechaFin, Integer idProducto,
            Integer prioridad, BigDecimal precio, String moneda) {
        this.id = id;
        this.idCadena = idCadena;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.idProducto = idProducto;
        this.prioridad = prioridad;
        this.precio = precio;
        this.moneda = moneda;
    }

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
