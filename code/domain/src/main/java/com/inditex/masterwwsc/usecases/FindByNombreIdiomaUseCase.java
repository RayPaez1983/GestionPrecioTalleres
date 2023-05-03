package com.inditex.masterwwsc.usecases;

import com.inditex.masterwwsc.entities.Idioma;

public interface FindByNombreIdiomaUseCase {
    Idioma findByNombre(String nombre);
}
