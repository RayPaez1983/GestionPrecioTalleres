package com.inditex.masterwwsc.repository;

import com.inditex.masterwwsc.entities.TipoReoperacion;

import java.util.List;

public interface TipoReoperacionRepository {

    List<TipoReoperacion> findAll();
}
