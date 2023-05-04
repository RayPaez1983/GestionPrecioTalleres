package com.inditex.masterwwsc.repository;

import com.inditex.masterwwsc.entities.TipoReoperacion;

import java.math.BigInteger;
import java.util.List;

public interface TipoReoperacionRepositoryI10n {
    List<TipoReoperacion> findAll();

    TipoReoperacion findById(BigInteger id);
}
