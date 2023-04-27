package com.inditex.masterwwsc.usecases;

import com.inditex.masterwwsc.entities.TipoReoperacion;

import java.util.List;

public interface ListAllReoperationsUseCase {

    List<TipoReoperacion> findAllTipoReoperacion();
}
