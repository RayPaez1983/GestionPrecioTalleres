package com.inditex.masterwwsc.infrastructure.domain.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class TipoReoperacionL10nEmbeddable implements Serializable {
    @Column(name = "ID_TIPO_REOPERACION")
    private Integer idTipoReoperacion;
    @Column(name = "ID_IDIOMA")
    private Integer idIdioma;

    public TipoReoperacionL10nEmbeddable() {

    }

    public TipoReoperacionL10nEmbeddable(Integer idTipoReoperacion, Integer idIdioma) {
        this.idTipoReoperacion = idTipoReoperacion;
        this.idIdioma = idIdioma;
    }

    public Integer getIdTipoReoperacion() {
        return idTipoReoperacion;
    }

    public void setIdTipoReoperacion(Integer idTipoReoperacion) {
        this.idTipoReoperacion = idTipoReoperacion;
    }

    public Integer getIdIdioma() {
        return idIdioma;
    }

    public void setIdIdioma(Integer idIdioma) {
        this.idIdioma = idIdioma;
    }
}
