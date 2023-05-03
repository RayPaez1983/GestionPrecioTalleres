package com.inditex.masterwwsc.infrastructure.domain.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;
@Entity
@Table(name = "idioma")
public class InMemoryIdiomaRepositoryEntity {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "ID_IDIOMA")
        private Long idIdioma;

        @Column(name = "CODIGO")
        private String codigo;

        @Column(name = "NOMBRE")
        private String nombre;

        @Column(name = "USUARIO_CREACION")
        private String usuarioCreacion;

        @Column(name = "FECHA_HORA_CREACION")
        private LocalDateTime fechaHoraCreacion;

        @Column(name = "USUARIO_ACTUALIZACION")
        private String usuarioActualizion;

        @Column(name = "FECHA_HORA_ACTUALIZACION")
        private LocalDateTime fechaHoraActualizion;

        public Long getIdIdioma() {
            return idIdioma;
        }

        public void setIdIdioma(Long idIdioma) {
            this.idIdioma = idIdioma;
        }

        public String getCodigo() {
            return codigo;
        }

        public void setCodigo(String codigo) {
            this.codigo = codigo;
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

        public String getUsuarioActualizion() {
            return usuarioActualizion;
        }

        public void setUsuarioActualizion(String usuarioActualizion) {
            this.usuarioActualizion = usuarioActualizion;
        }

        public LocalDateTime getFechaHoraActualizion() {
            return fechaHoraActualizion;
        }

        public void setFechaHoraActualizion(LocalDateTime fechaHoraActualizion) {
            this.fechaHoraActualizion = fechaHoraActualizion;
        }

    }

