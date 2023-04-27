package com.inditex.masterwwsc.entities;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "maestro_centro_distribucion")
public class MaestroCentroDistribucion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_CENTRO_REOPERACION")
    private Integer idCentroDistribucion;

    private String nombre;
    @Column(name = "USUARIO_CREACION")
    private String usuarioCreacion;
    @Column(name = "FECHA_HORA_CREACION")
    private LocalDateTime fechaHoraCreacion;
    @Column(name = "FECHA_HORA_ACTUALIZACION")
    private LocalDateTime fechaHoraActualizacion;
    @Column(name = "USUARIO_BAJA")
    private String usuarioBaja;
    @Column(name = "HORA_BAJA")
    private LocalDateTime hora_baja;

    public Integer getIdCentroDistribucion() {
        return idCentroDistribucion;
    }

    public void setIdCentroDistribucion(Integer idCentroDistribucion) {
        this.idCentroDistribucion = idCentroDistribucion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public LocalDateTime getHora_baja() {
        return hora_baja;
    }

    public void setHora_baja(LocalDateTime hora_baja) {
        this.hora_baja = hora_baja;
    }
}
