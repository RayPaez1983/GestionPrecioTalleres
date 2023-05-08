package com.inditex.masterwwsc.infrastructure.controller;

import com.inditex.masterwwsc.entities.Idioma;
import com.inditex.masterwwsc.infrastructure.repository.reoperation.ReoperationEntityRepository;
import com.inditex.masterwwsc.usecase.FindAllIdiomasUseCaseImp;
import com.inditex.masterwwsc.usecase.FindByCodigoIdiomaUseCaseImp;
import com.inditex.masterwwsc.usecase.FindByIdIdiomaUseCaseImp;
import com.inditex.masterwwsc.usecase.FindByNombreIdiomaUseCaseImp;
import com.inditex.masterwwsc.usecases.FindAllIdiomasUseCase;
import com.inditex.masterwwsc.usecases.FindByCodigoIdiomaUseCase;
import com.inditex.masterwwsc.usecases.FindByIdIdiomaUseCase;
import com.inditex.masterwwsc.usecases.FindByNombreIdiomaUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigInteger;
import java.util.List;


@RestController
public class IdiomaController {

    private FindAllIdiomasUseCase findAllIdiomasUseCase;

    private FindByIdIdiomaUseCase findByIdIdiomaUseCase;

    private FindByCodigoIdiomaUseCase findByCodigoIdiomaUseCase;

    private FindByNombreIdiomaUseCase findByNombreIdiomaUseCase;

    public IdiomaController(FindAllIdiomasUseCase findAllIdiomasUseCaseImp, FindByIdIdiomaUseCase findByIdIdiomaUseCaseImp, FindByCodigoIdiomaUseCase findByCodigoIdiomaUseCaseImp, FindByNombreIdiomaUseCase findByNombreIdiomaUseCaseImp) {
        this.findAllIdiomasUseCase = findAllIdiomasUseCaseImp;
        this.findByIdIdiomaUseCase = findByIdIdiomaUseCaseImp;
        this.findByCodigoIdiomaUseCase = findByCodigoIdiomaUseCaseImp;
        this.findByNombreIdiomaUseCase = findByNombreIdiomaUseCaseImp;
    }

    @Autowired
    private ReoperationEntityRepository reoperationEntityRepository;

    @GetMapping(value = "/idiomas", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Idioma>> getAllIdiomas() {
        return ResponseEntity.ok(findAllIdiomasUseCase.findAll());
    }

    @GetMapping(value = "/idiomas/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Idioma> getIdiomaById(@PathVariable BigInteger id) {
        return ResponseEntity.ok(findByIdIdiomaUseCase.findById(id));
    }

    @GetMapping(value = "/idiomas/codigo/{codigo}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Idioma> getIdiomaByCodigo(@PathVariable String codigo) {
        return ResponseEntity.ok(findByCodigoIdiomaUseCase.findByCodigo(codigo));
    }

    @GetMapping(value = "/idiomas/nombre/{nombre}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Idioma> getIdiomaByNombre(@PathVariable String nombre) {
        return ResponseEntity.ok(findByNombreIdiomaUseCase.findByNombre(nombre));
    }
}
