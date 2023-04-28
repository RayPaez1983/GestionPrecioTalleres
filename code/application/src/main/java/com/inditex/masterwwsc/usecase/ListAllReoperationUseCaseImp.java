package com.inditex.masterwwsc.usecase;

import com.inditex.masterwwsc.entities.TipoReoperacion;
import com.inditex.masterwwsc.repository.TipoReoperacionRepository;
import com.inditex.masterwwsc.usecases.ListAllReoperationsUseCase;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ListAllReoperationUseCaseImp implements ListAllReoperationsUseCase {
    private TipoReoperacionRepository tipoReoperacionRepository;
    public ListAllReoperationUseCaseImp(TipoReoperacionRepository tipoReoperacionRepository) {
        this.tipoReoperacionRepository = tipoReoperacionRepository;
    }

    @Override
    public List<TipoReoperacion> findAllTipoReoperacion() {
        return tipoReoperacionRepository.findAll();
    }
}
