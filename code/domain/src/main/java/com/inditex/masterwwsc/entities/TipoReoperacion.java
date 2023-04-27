package com.inditex.masterwwsc.entities;

import lombok.Data;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDateTime;

@Data
public class TipoReoperacion {

    private BigInteger IdTipoReoperacion;
    private String UsuarioCreacion;
    private LocalDateTime FechaHoraCreacion;
    private String UusarioActualizacion;
    private LocalDateTime FechaHoraActualizacion;
    private Integer CodTipoReoperacionAs400;
    private Integer CodCadena;
    private Integer CodCentroCompra;
    private BigDecimal EsInactivo;
    private Integer CodigoTipoReoperacion;

}
