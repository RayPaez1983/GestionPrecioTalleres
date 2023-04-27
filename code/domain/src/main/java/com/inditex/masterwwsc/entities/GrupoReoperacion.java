package com.inditex.masterwwsc.entities;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "grupo_reoperacion")
public class GrupoReoperacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_GRUPO_REOPERACION")
    private Long IdGrupoReoperacion;

    @Column(name = "USUARIO_CREACION")
    private String UsuarioCreacion;

    @Column(name = "FECHA_HORA_CREACION")
    private LocalDateTime FechaHoraCreacion;

    @Column(name = "USUARIO_ACTUALIZACION")
    private String UsuarioActualizacion;

    @Column(name = "FECHA_HORA_ACTUALIZACION")
    private LocalDateTime FechaHoraActualizacion;

    public Long getIdGrupoReoperacion() {
        return IdGrupoReoperacion;
    }

    public void setIdGrupoReoperacion(Long idGrupoReoperacion) {
        IdGrupoReoperacion = idGrupoReoperacion;
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
