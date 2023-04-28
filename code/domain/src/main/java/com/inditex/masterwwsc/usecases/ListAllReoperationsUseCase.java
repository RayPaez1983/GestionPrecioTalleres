package com.inditex.masterwwsc.usecases;

import com.inditex.masterwwsc.entities.TipoReoperacion;

import java.util.List;
import java.util.Optional;

public interface ListAllReoperationsUseCase {

    List<TipoReoperacion> findAllTipoReoperacion();
}
