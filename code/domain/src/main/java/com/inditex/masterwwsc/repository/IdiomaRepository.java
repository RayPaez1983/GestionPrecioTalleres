package com.inditex.masterwwsc.repository;

import com.inditex.masterwwsc.entities.Idioma;

import java.math.BigInteger;
import java.util.List;

public interface IdiomaRepository  {

    List<Idioma> findAll();

    Idioma findById(BigInteger id);

    Idioma findByCodigo(String codigo);

    Idioma findByNombre(String nombre);
}
