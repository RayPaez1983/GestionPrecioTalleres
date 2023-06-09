package com.inditex.masterwwsc.infrastructure.domain.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "actividad")
public class Actividad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_ACTIVIDAD")
    private Long IdActividad;

    @Column(name = "ID_TIPO_UNIDAD")
    private Short IdTipoUnidad;

    @Column(name = "ID_TIPO_COSTE")
    private Short IdTipoCoste;

    @Column(name = "COD_CADENA")
    private Short CodCadena;

    @Column(name = "COD_CENTRO_COMPRA")
    private Short CodCentroCompra;

    @Column(name = "ES_NEGOCIABLE")
    private java.math.BigDecimal EsNegociable;

    @Column(name = "ES_INACTIVO")
    private java.math.BigDecimal EsInactivo;

    @Column(name = "ES_FACTOR_LOTE")
    private java.math.BigDecimal EsFactorLote;

    @Column(name = "USUARIO_CREACION")
    private String UsuarioCreacion;

    @Column(name = "FECHA_HORA_CREACION")
    private LocalDateTime FechaHoraCreacion;

    @Column(name = "USUARIO_ACTUALIZACION")
    private String UsuarioActualizacion;

    @Column(name = "FECHA_HORA_ACTUALIZACION")
    private LocalDateTime FechaHoraActualizacion;

    @Column(name = "CODIGO_ACTIVIDAD")
    private Integer CodigoActividad;

    @Column(name = "ES_REPETIBLE")
    private java.math.BigDecimal EsRepetible;

    public Long getIdActividad() {
        return IdActividad;
    }

    public void setIdActividad(Long idActividad) {
        IdActividad = idActividad;
    }

    public Short getIdTipoUnidad() {
        return IdTipoUnidad;
    }

    public void setIdTipoUnidad(Short idTipoUnidad) {
        IdTipoUnidad = idTipoUnidad;
    }

    public Short getIdTipoCoste() {
        return IdTipoCoste;
    }

    public void setIdTipoCoste(Short idTipoCoste) {
        IdTipoCoste = idTipoCoste;
    }

    public Short getCodCadena() {
        return CodCadena;
    }

    public void setCodCadena(Short codCadena) {
        CodCadena = codCadena;
    }

    public Short getCodCentroCompra() {
        return CodCentroCompra;
    }

    public void setCodCentroCompra(Short codCentroCompra) {
        CodCentroCompra = codCentroCompra;
    }

    public BigDecimal getEsNegociable() {
        return EsNegociable;
    }

    public void setEsNegociable(BigDecimal esNegociable) {
        EsNegociable = esNegociable;
    }

    public BigDecimal getEsInactivo() {
        return EsInactivo;
    }

    public void setEsInactivo(BigDecimal esInactivo) {
        EsInactivo = esInactivo;
    }

    public BigDecimal getEsFactorLote() {
        return EsFactorLote;
    }

    public void setEsFactorLote(BigDecimal esFactorLote) {
        EsFactorLote = esFactorLote;
    }

    public String getUsuarioCreacion() {
        return UsuarioCreacion;
    }

    public void setUsuarioCreacion(String usuarioCreacion) {
        UsuarioCreacion = usuarioCreacion;
    }

    public LocalDateTime getFechaHoraCreacion() {
        return FechaHoraCreacion;
    }

    public void setFechaHoraCreacion(LocalDateTime fechaHoraCreacion) {
        FechaHoraCreacion = fechaHoraCreacion;
    }

    public String getUsuarioActualizacion() {
        return UsuarioActualizacion;
    }

    public void setUsuarioActualizacion(String usuarioActualizacion) {
        UsuarioActualizacion = usuarioActualizacion;
    }

    public LocalDateTime getFechaHoraActualizacion() {
        return FechaHoraActualizacion;
    }

    public void setFechaHoraActualizacion(LocalDateTime fechaHoraActualizacion) {
        FechaHoraActualizacion = fechaHoraActualizacion;
    }

    public Integer getCodigoActividad() {
        return CodigoActividad;
    }

    public void setCodigoActividad(Integer codigoActividad) {
        CodigoActividad = codigoActividad;
    }

    public BigDecimal getEsRepetible() {
        return EsRepetible;
    }

    public void setEsRepetible(BigDecimal esRepetible) {
        EsRepetible = esRepetible;
    }
}
