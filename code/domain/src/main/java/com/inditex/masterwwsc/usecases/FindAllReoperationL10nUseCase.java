package com.inditex.masterwwsc.usecases;

import com.inditex.masterwwsc.entities.TipoReoperacionL10n;
import org.springframework.stereotype.Component;

import java.util.List;

public interface FindAllReoperationL10nUseCase {

    List<TipoReoperacionL10n> findAllTipoReoperationL10n();
}
