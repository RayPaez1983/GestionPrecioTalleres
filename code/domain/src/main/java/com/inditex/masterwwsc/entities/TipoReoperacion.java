package com.inditex.masterwwsc.entities;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@AllArgsConstructor
@Data
public class TipoReoperacion {

    private Integer IdTipoReoperacion;
    private String UsuarioCreacion;
    private LocalDateTime FechaHoraCreacion;
    private String UsuarioActualizacion;
    private LocalDateTime FechaHoraActualizacion;
    private Integer CodTipoReoperacionAs400;
    private Integer CodCadena;
    private Integer CodCentroCompra;
    private BigDecimal EsInactivo;
    private Integer CodigoTipoReoperacion;


}
