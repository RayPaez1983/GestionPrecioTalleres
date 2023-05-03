package com.inditex.masterwwsc.usecases;

import com.inditex.masterwwsc.entities.Idioma;

public interface FindByCodigoIdiomaUseCase {
    Idioma findByCodigo(String codigo);
}
