package com.inditex.masterwwsc.infrastructure.domain.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name ="tipo_reoperacion")
public class InMemoryTipoReoperacionEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_TIPO_REOPERACION")
    private BigInteger IdTipoReoperacion;
    @Column(name = "USUARIO_CREACION")
    private String UsuarioCreacion;
    @Column(name = "FECHA_HORA_CREACION")
    private LocalDateTime FechaHoraCreacion;
    @Column(name = "USUARIO_ACTUALIZACION")
    private String UusarioActualizacion;
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

}
