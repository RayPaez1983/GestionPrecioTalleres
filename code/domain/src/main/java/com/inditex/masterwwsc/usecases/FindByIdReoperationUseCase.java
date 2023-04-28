package com.inditex.masterwwsc.usecases;

import com.inditex.masterwwsc.entities.TipoReoperacion;

import java.math.BigInteger;

public interface FindByIdReoperationUseCase {
    TipoReoperacion findReoperationById(BigInteger id);
}
