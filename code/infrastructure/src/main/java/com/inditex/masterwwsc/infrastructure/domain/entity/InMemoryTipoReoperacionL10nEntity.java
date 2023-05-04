package com.inditex.masterwwsc.infrastructure.domain.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "tipo_reoperacion_l10n")
public class InMemoryTipoReoperacionL10nEntity {
    @JsonIgnore
    @EmbeddedId
    private TipoReoperacionL10nEmbeddable id;
    @ManyToOne
    @MapsId("idTipoReoperacion")
    @JoinColumn(name = "ID_TIPO_REOPERACION")
    private InMemoryTipoReoperacionEntity tipoReoperacion;
    @ManyToOne
    @MapsId("idIdioma")
    @JoinColumn(name = "ID_IDIOMA")
    private InMemoryIdiomaRepositoryEntity inMemoryIdiomaRepositoryEntity;
    @Column(name = "NOMBRE")
    private String nombre;
    @Column(name = "USUARIO_CREACION")
    private String UsuarioCreacion;
    @Column(name = "FECHA_HORA_CREACION")
    private LocalDateTime FechaHoraCreacion;
    @Column(name = "USUARIO_ACTUALIZACION")
    private String UsuarioActualizacion;
    @Column(name = "FECHA_HORA_ACTUALIZACION")
    private LocalDateTime FechaHoraActualizacion;

    public TipoReoperacionL10nEmbeddable getId() {
        return id;
    }

    public void setId(TipoReoperacionL10nEmbeddable id) {
        this.id = id;
    }

    public InMemoryTipoReoperacionEntity getTipoReoperacion() {
        return tipoReoperacion;
    }

    public void setTipoReoperacion(InMemoryTipoReoperacionEntity tipoReoperacion) {
        this.tipoReoperacion = tipoReoperacion;
    }

    public InMemoryIdiomaRepositoryEntity getInMemoryIdiomaRepositoryEntity() {
        return inMemoryIdiomaRepositoryEntity;
    }

    public void setInMemoryIdiomaRepositoryEntity(InMemoryIdiomaRepositoryEntity inMemoryIdiomaRepositoryEntity) {
        this.inMemoryIdiomaRepositoryEntity = inMemoryIdiomaRepositoryEntity;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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
