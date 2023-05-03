package com.inditex.masterwwsc.usecase;

import com.inditex.masterwwsc.entities.Idioma;
import com.inditex.masterwwsc.repository.IdiomaRepository;
import com.inditex.masterwwsc.usecases.FindByIdIdiomaUseCase;
import org.springframework.stereotype.Component;

import java.math.BigInteger;

@Component
public class FindByIdIdiomaUseCaseImp implements FindByIdIdiomaUseCase {

    private IdiomaRepository idiomaRepository;

    public FindByIdIdiomaUseCaseImp(IdiomaRepository idiomaRepository){
        this.idiomaRepository = idiomaRepository;
    }

    @Override
    public Idioma findById(BigInteger id){
        return idiomaRepository.findById(id);
    };
}
