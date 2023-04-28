package com.inditex.masterwwsc.usecase;

import com.inditex.masterwwsc.entities.TipoReoperacion;
import com.inditex.masterwwsc.repository.TipoReoperacionRepository;
import com.inditex.masterwwsc.usecases.FindByIdReoperationUseCase;
import org.springframework.stereotype.Component;

import java.math.BigInteger;

@Component
public class FindByIdReoperationUseCaseImpl implements FindByIdReoperationUseCase {
    private TipoReoperacionRepository tipoReoperacionRepository;

    public FindByIdReoperationUseCaseImpl(TipoReoperacionRepository tipoReoperacionRepository) {
        this.tipoReoperacionRepository = tipoReoperacionRepository;
    }

    @Override
    public TipoReoperacion findReoperationById(BigInteger id) {
        return tipoReoperacionRepository.findById(id);
    }
}
