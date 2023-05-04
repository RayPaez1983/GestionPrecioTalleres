package com.inditex.masterwwsc.usecase;

import com.inditex.masterwwsc.entities.TipoReoperacionL10n;
import com.inditex.masterwwsc.repository.TipoReoperacionL10nRepository;
import com.inditex.masterwwsc.usecases.FindAllReoperationL10nUseCase;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class FindAllReoperationL10nUseCaseImp implements FindAllReoperationL10nUseCase {

    private TipoReoperacionL10nRepository tipoReoperacionL10nRepository;

    public FindAllReoperationL10nUseCaseImp(TipoReoperacionL10nRepository tipoReoperacionL10nRepository) {
        this.tipoReoperacionL10nRepository = tipoReoperacionL10nRepository;
    }

    @Override
    public List<TipoReoperacionL10n> findAllTipoReoperationL10n() {
        return tipoReoperacionL10nRepository.findAll();
    }
}
