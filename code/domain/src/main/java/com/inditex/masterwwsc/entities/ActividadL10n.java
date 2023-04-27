package com.inditex.masterwwsc.entities;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "actividad_l10n")
public class ActividadL10n {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_ACTIVIDAD")
    private Long IdActividad;

    @Column(name = "ID_IDIOMA")
    private Long IdIdioma;

    @Column(name = "NOMBRE")
    private String Nombre;

    @Column(name = "DESCRIPCION")
    private String Descripcion;

    @Column(name = "USUARIO_CREACION")
    private String UsuarioCreacion;

    @Column(name = "FECHA_HORA_CREACION")
    private LocalDateTime FechaHoraCreacion;

    @Column(name = "USUARIO_ACTUALIZACION")
    private String UsuarioActualizacion;

    @Column(name = "FECHA_HORA_ACTUALIZACION")
    private LocalDateTime FechaHoraActualizacion;

    public Long getIdActividad() {
        return IdActividad;
    }

    public void setIdActividad(Long idActividad) {
        IdActividad = idActividad;
    }

    public Long getIdIdioma() {
        return IdIdioma;
    }

    public void setIdIdioma(Long idIdioma) {
        IdIdioma = idIdioma;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
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
