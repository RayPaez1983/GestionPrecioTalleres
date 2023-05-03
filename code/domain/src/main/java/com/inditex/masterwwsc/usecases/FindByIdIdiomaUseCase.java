package com.inditex.masterwwsc.usecases;

import com.inditex.masterwwsc.entities.Idioma;

import java.math.BigInteger;

public interface FindByIdIdiomaUseCase {
    Idioma findById(BigInteger id);
}
