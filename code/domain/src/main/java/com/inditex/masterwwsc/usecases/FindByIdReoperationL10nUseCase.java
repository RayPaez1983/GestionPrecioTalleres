package com.inditex.masterwwsc.usecases;


import com.inditex.masterwwsc.entities.TipoReoperacionL10n;
import org.springframework.stereotype.Component;

import java.math.BigInteger;

public interface FindByIdReoperationL10nUseCase {

    TipoReoperacionL10n findReoperationL10nById(Integer idTipoReoperacion, Integer idIdioma);

}
