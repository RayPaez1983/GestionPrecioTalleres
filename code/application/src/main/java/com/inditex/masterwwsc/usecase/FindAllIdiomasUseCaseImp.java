package com.inditex.masterwwsc.usecase;

import com.inditex.masterwwsc.repository.IdiomaRepository;
import com.inditex.masterwwsc.usecases.FindAllIdiomasUseCase;
import org.springframework.stereotype.Component;
import com.inditex.masterwwsc.entities.Idioma;
import java.util.List;

@Component
public class FindAllIdiomasUseCaseImp implements FindAllIdiomasUseCase {
    private IdiomaRepository idiomaRepository;

    public FindAllIdiomasUseCaseImp(IdiomaRepository idiomaRepository){
        this.idiomaRepository = idiomaRepository;
    }

    @Override
    public List<Idioma> findAll(){
        return idiomaRepository.findAll();
    }
}
