package com.inditex.masterwwsc.repository;

import com.inditex.masterwwsc.entities.TipoReoperacionL10n;

import java.util.List;

public interface TipoReoperacionL10nRepository {
    List<TipoReoperacionL10n> findAll();

    TipoReoperacionL10n findById(Integer idTipoReoperacion, Integer idIdioma);
}
