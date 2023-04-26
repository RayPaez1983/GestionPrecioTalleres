package com.inditex.masterwwsc.entities;

import jakarta.persistence.*;

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

    @Column(name = "ES_NEGOCIABE")
    private Boolean EsNegociable;

    @Column(name = "ES_INACTIVO")
    private Boolean EsInactivo;

    @Column(name = "ES_FACTOR_LOTE")
    private Boolean EsFactorLote;

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
    private Boolean EsRepetible;

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

    public Boolean getEsNegociable() {
        return EsNegociable;
    }

    public void setEsNegociable(Boolean esNegociable) {
        EsNegociable = esNegociable;
    }

    public Boolean getEsInactivo() {
        return EsInactivo;
    }

    public void setEsInactivo(Boolean esInactivo) {
        EsInactivo = esInactivo;
    }

    public Boolean getEsFactorLote() {
        return EsFactorLote;
    }

    public void setEsFactorLote(Boolean esFactorLote) {
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

    public Boolean getEsRepetible() {
        return EsRepetible;
    }

    public void setEsRepetible(Boolean esRepetible) {
        EsRepetible = esRepetible;
    }
}
