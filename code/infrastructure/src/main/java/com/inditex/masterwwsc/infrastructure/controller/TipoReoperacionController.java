package com.inditex.masterwwsc.infrastructure.controller;

import com.inditex.masterwwsc.entities.TipoReoperacion;
import com.inditex.masterwwsc.infrastructure.repository.reoperation.ReoperationEntityRepository;
import com.inditex.masterwwsc.usecase.FindByIdReoperationUseCaseImpl;
import com.inditex.masterwwsc.usecase.ListAllReoperationUseCaseImp;
import com.inditex.masterwwsc.usecases.FindByIdReoperationUseCase;
import com.inditex.masterwwsc.usecases.ListAllReoperationsUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigInteger;
import java.util.List;


@RestController
public class TipoReoperacionController {

    private ListAllReoperationsUseCase listAllReoperationsUseCase;

    private FindByIdReoperationUseCase findByIdReoperationUseCase;


    public TipoReoperacionController(ListAllReoperationsUseCase listAllReoperationUseCaseImp,FindByIdReoperationUseCase findByIdReoperationUseCaseImpl) {
        this.listAllReoperationsUseCase = listAllReoperationUseCaseImp;
        this.findByIdReoperationUseCase = findByIdReoperationUseCaseImpl;
    }

    @Autowired
    private ReoperationEntityRepository reoperationEntityRepository;

    @GetMapping(value = "/reoperation", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<TipoReoperacion>> getAllTipoReoperacion() {
        return ResponseEntity.ok(listAllReoperationsUseCase.findAllTipoReoperacion());
    }

    @GetMapping(value = "/reoperation/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<TipoReoperacion> getTipoReoperacionById(@PathVariable BigInteger id) {
        return ResponseEntity.ok(findByIdReoperationUseCase.findReoperationById(id));
    }


}
