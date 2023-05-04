package com.inditex.masterwwsc.infrastructure.domain.entity;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.time.LocalDateTime;

@Entity
@Table(name = "tipo_reoperacion_l10n")
public class InMemoryTipoReoperacionI10nEntity {

    @EmbeddedId
    private InMemoryIdsTipoReoperacion idsTipoReoperacion;

    @Column(name = "NOMBRE")
    private String nombre;

    @Column(name = "USUARIO_CREACION")
    private String usuarioCreacion;

    @Column(name = "FECHA_HORA_CREACION")
    private LocalDateTime fechaHoraCreacion;

    @Column(name = "USUARIO_ACTUALIZACION")
    private String usuarioActualizacion;

    @Column(name = "FECHA_HORA_ACTUALIZACION")
    private LocalDateTime fechaHoraActualizacion;

}


