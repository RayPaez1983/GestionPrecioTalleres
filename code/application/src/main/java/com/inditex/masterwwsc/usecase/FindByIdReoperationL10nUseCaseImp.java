package com.inditex.masterwwsc.usecase;

import com.inditex.masterwwsc.entities.TipoReoperacionL10n;
import com.inditex.masterwwsc.repository.TipoReoperacionL10nRepository;
import com.inditex.masterwwsc.usecases.FindByIdReoperationL10nUseCase;
import org.springframework.stereotype.Component;

@Component
public class FindByIdReoperationL10nUseCaseImp implements FindByIdReoperationL10nUseCase {
    private TipoReoperacionL10nRepository tipoReoperacionL10NRepository;

    public FindByIdReoperationL10nUseCaseImp(TipoReoperacionL10nRepository tipoReoperacionL10NRepository) {
        this.tipoReoperacionL10NRepository = tipoReoperacionL10NRepository;
    }

    @Override
    public TipoReoperacionL10n findReoperationL10nById(Integer idTipoReoperacion, Integer idIdioma) {
        return tipoReoperacionL10NRepository.findById(idTipoReoperacion, idIdioma);
    }
}
