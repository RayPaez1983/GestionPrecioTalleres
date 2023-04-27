package com.inditex.masterwwsc.entities;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.sql.Date;
import java.time.LocalDateTime;

@Entity
@Table(name = "actividad_precio")
public class ActividadPrecio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "ID_ACTIVIDAD_PRECIO")
    private Integer IdActividadPrecio;

    @Column(name = "ID_ACTIVIDAD")
    private Integer IdActividad;

    @Column(name = "ID_TIPO_LOCALIZACION")
    private Short IdTipoLocalizacion;

    @Column(name = "COD_LOCALIZACION")
    private Integer CodigoLocalizacion;

    @Column(name = "PRECIO")
    private java.math.BigDecimal Precio;

    @Column(name = "FECHA_DESDE")
    private LocalDateTime Fecha_Desde;

    @Column(name = "FECHA_HASTA")
    private LocalDateTime FechaHasta;
    @Column(name = "USUARIO_CREACION")
    private String UsuarioCreacion;

    @Column(name = "FECHA_HORA_CREACION")
    private LocalDateTime FechaHoraCreacion;
    @Column(name = "USUARIO_ACTUALIZACION")
    private String UsuarioActualizacion;
    @Column(name = "FECHA_HORA_ACTUALIZACION")
    private LocalDateTime FechaHoraActualizacion;

    public Integer getIdActividadPrecio() {
        return IdActividadPrecio;
    }

    public void setIdActividadPrecio(Integer idActividadPrecio) {
        IdActividadPrecio = idActividadPrecio;
    }

    public Integer getIdActividad() {
        return IdActividad;
    }

    public void setIdActividad(Integer idActividad) {
        IdActividad = idActividad;
    }

    public Short getIdTipoLocalizacion() {
        return IdTipoLocalizacion;
    }

    public void setIdTipoLocalizacion(Short idTipoLocalizacion) {
        IdTipoLocalizacion = idTipoLocalizacion;
    }

    public Integer getCodigoLocalizacion() {
        return CodigoLocalizacion;
    }

    public void setCodigoLocalizacion(Integer codigoLocalizacion) {
        CodigoLocalizacion = codigoLocalizacion;
    }

    public BigDecimal getPrecio() {
        return Precio;
    }

    public void setPrecio(BigDecimal precio) {
        Precio = precio;
    }

    public LocalDateTime getFecha_Desde() {
        return Fecha_Desde;
    }

    public void setFecha_Desde(LocalDateTime fecha_Desde) {
        Fecha_Desde = fecha_Desde;
    }

    public LocalDateTime getFechaHasta() {
        return FechaHasta;
    }

    public void setFechaHasta(LocalDateTime fechaHasta) {
        FechaHasta = fechaHasta;
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
}
