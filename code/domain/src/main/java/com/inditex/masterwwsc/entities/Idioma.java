package com.inditex.masterwwsc.entities;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

@AllArgsConstructor
@Data
public class Idioma {

    private Long idIdioma;
    private String codigo;
    private String nombre;
    private String usuarioCreacion;
    private LocalDateTime fechaHoraCreacion;
    private String usuarioActualizion;
    private LocalDateTime fechaHoraActualizion;

}
