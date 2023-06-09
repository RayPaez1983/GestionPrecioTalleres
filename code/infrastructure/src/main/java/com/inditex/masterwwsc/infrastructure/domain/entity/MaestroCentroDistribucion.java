package com.inditex.masterwwsc.infrastructure.domain.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "maestro_centro_distribucion")
public class MaestroCentroDistribucion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "ID_CENTRO_DISTRIBUCION")
    private Integer idCentroDistribucion;

    @Column(name = "NOMBRE")
    private String Nombre;
    @Column(name = "USUARIO_CREACION")
    private String usuarioCreacion;
    @Column(name = "FECHA_HORA_CREACION")
    private LocalDateTime fechaHoraCreacion;
    @Column(name = "FECHA_HORA_ACTUALIZACION")
    private LocalDateTime fechaHoraActualizacion;
    @Column(name = "USUARIO_BAJA")
    private String usuarioBaja;
    @Column(name = "FECHA_HORA_BAJA")
    private LocalDateTime fechaHoraBaja;

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public Integer getIdCentroDistribucion() {
        return idCentroDistribucion;
    }

    public void setIdCentroDistribucion(Integer idCentroDistribucion) {
        this.idCentroDistribucion = idCentroDistribucion;
    }

    public String getUsuarioCreacion() {
        return usuarioCreacion;
    }

    public void setUsuarioCreacion(String usuarioCreacion) {
        this.usuarioCreacion = usuarioCreacion;
    }

    public LocalDateTime getFechaHoraCreacion() {
        return fechaHoraCreacion;
    }

    public void setFechaHoraCreacion(LocalDateTime fechaHoraCreacion) {
        this.fechaHoraCreacion = fechaHoraCreacion;
    }

    public LocalDateTime getFechaHoraActualizacion() {
        return fechaHoraActualizacion;
    }

    public void setFechaHoraActualizacion(LocalDateTime fechaHoraActualizacion) {
        this.fechaHoraActualizacion = fechaHoraActualizacion;
    }

    public String getUsuarioBaja() {
        return usuarioBaja;
    }

    public void setUsuarioBaja(String usuarioBaja) {
        this.usuarioBaja = usuarioBaja;
    }

    public LocalDateTime getFechaHoraBaja() {
        return fechaHoraBaja;
    }

    public void setFechaHoraBaja(LocalDateTime fechaHoraBaja) {
        this.fechaHoraBaja = fechaHoraBaja;
    }
}
