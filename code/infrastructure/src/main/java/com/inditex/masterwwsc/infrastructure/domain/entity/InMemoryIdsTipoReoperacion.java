package com.inditex.masterwwsc.infrastructure.domain.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class InMemoryIdsTipoReoperacion implements Serializable {

    @Column(name = "ID_TIPO_REOPERACION")
    private Long idTipoReoperacion;

    @Column(name = "ID_IDIOMA")
    private Long idIdioma;


}
