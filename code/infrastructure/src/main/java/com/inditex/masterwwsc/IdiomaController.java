package com.inditex.masterwwsc;

import com.inditex.masterwwsc.entities.Idioma;
import com.inditex.masterwwsc.repository.IdiomaRepository;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class IdiomaController {

    private IdiomaRepository idiomaRepository;

    public IdiomaController(IdiomaRepository idiomaRepository) {
        this.idiomaRepository = idiomaRepository;
    }

    @GetMapping(value = "/idioma", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Idioma>> getAllIdiomas(){
        return ResponseEntity.ok(idiomaRepository.findAll());
    }
}
