package com.inditex.masterwwsc.infrastructure.domain.entity;


import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;


@Entity
@Table(name = "tipo_reoperacion")
public class InMemoryTipoReoperacionEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_TIPO_REOPERACION")
    private Integer IdTipoReoperacion;
    @Column(name = "USUARIO_CREACION")
    private String UsuarioCreacion;
    @Column(name = "FECHA_HORA_CREACION")
    private LocalDateTime FechaHoraCreacion;
    @Column(name = "USUARIO_ACTUALIZACION")
    private String UsuarioActualizacion;
    @Column(name = "FECHA_HORA_ACTUALIZACION")
    private LocalDateTime FechaHoraActualizacion;
    @Column(name = "COD_TIPO_REOPERACION_AS400")
    private Integer CodTipoReoperacionAs400;
    @Column(name = "COD_CADENA")
    private Integer CodCadena;
    @Column(name = "COD_CENTRO_COMPRA")
    private Integer CodCentroCompra;
    @Column(name = "ES_INACTIVO")
    private BigDecimal EsInactivo;
    @Column(name = "CODIGO_TIPO_REOPERACION")
    private Integer CodigoTipoReoperacion;

    public Integer getIdTipoReoperacion() {
        return IdTipoReoperacion;
    }

    public void setIdTipoReoperacion(Integer idTipoReoperacion) {
        IdTipoReoperacion = idTipoReoperacion;
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

    public Integer getCodTipoReoperacionAs400() {
        return CodTipoReoperacionAs400;
    }

    public void setCodTipoReoperacionAs400(Integer codTipoReoperacionAs400) {
        CodTipoReoperacionAs400 = codTipoReoperacionAs400;
    }

    public Integer getCodCadena() {
        return CodCadena;
    }

    public void setCodCadena(Integer codCadena) {
        CodCadena = codCadena;
    }

    public Integer getCodCentroCompra() {
        return CodCentroCompra;
    }

    public void setCodCentroCompra(Integer codCentroCompra) {
        CodCentroCompra = codCentroCompra;
    }

    public BigDecimal getEsInactivo() {
        return EsInactivo;
    }

    public void setEsInactivo(BigDecimal esInactivo) {
        EsInactivo = esInactivo;
    }

    public Integer getCodigoTipoReoperacion() {
        return CodigoTipoReoperacion;
    }

    public void setCodigoTipoReoperacion(Integer codigoTipoReoperacion) {
        CodigoTipoReoperacion = codigoTipoReoperacion;
    }
}
