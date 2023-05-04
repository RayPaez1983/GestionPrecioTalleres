package com.inditex.masterwwsc.entities;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

@AllArgsConstructor
@Data
public class TipoReoperacionL10n {
    private Integer IdTipoReoperacion;
    private Integer IdIdioma;
    //private TipoReoperacion IdTipoReoperacion;
    //private Idioma IdIdioma;
    private String Nombre;
    private String UsuarioCreacion;
    private LocalDateTime FechaHoraCreacion;
    private String UsuarioActualizacion;
    private LocalDateTime FechaHoraActualizacion;

}
