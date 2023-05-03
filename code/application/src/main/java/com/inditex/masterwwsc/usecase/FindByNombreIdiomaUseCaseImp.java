package com.inditex.masterwwsc.usecase;

import com.inditex.masterwwsc.entities.Idioma;
import com.inditex.masterwwsc.repository.IdiomaRepository;
import com.inditex.masterwwsc.usecases.FindByNombreIdiomaUseCase;
import org.springframework.stereotype.Component;

@Component
public class FindByNombreIdiomaUseCaseImp implements FindByNombreIdiomaUseCase {

    private IdiomaRepository idiomaRepository;

    public FindByNombreIdiomaUseCaseImp(IdiomaRepository idiomaRepository){
        this.idiomaRepository = idiomaRepository;
    }

    @Override
    public Idioma findByNombre(String nombre){
        return idiomaRepository.findByNombre(nombre);
    }
}
