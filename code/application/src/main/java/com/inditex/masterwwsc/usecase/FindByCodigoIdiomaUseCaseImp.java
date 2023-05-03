package com.inditex.masterwwsc.usecase;

import com.inditex.masterwwsc.entities.Idioma;
import com.inditex.masterwwsc.repository.IdiomaRepository;
import com.inditex.masterwwsc.usecases.FindByCodigoIdiomaUseCase;
import org.springframework.stereotype.Component;

@Component
public class FindByCodigoIdiomaUseCaseImp implements FindByCodigoIdiomaUseCase {

    private IdiomaRepository idiomaRepository;

    public FindByCodigoIdiomaUseCaseImp(IdiomaRepository idiomaRepository){
        this.idiomaRepository = idiomaRepository;
    }

    @Override
    public Idioma findByCodigo(String codigo){
        return idiomaRepository.findByCodigo(codigo);
    }

}
