package com.inditex.masterwwsc.infrastructure.controller;

import com.inditex.masterwwsc.entities.TipoReoperacion;
import com.inditex.masterwwsc.infrastructure.repository.reoperation.ReoperationEntityRepository;
import com.inditex.masterwwsc.repository.GrupoReoperacionRepository;
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

    @Autowired
    private ReoperationEntityRepository reoperationEntityRepository;
    @Autowired
    private GrupoReoperacionRepository grupoReoperacionRepository;

    @GetMapping(value = "/reoperation", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<TipoReoperacion>> getAllTipoReoperacion() {
        return ResponseEntity.ok(reoperationEntityRepository.findAll());
    }

    @GetMapping(value = "/reoperation/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<TipoReoperacion> getTipoReoperacionById(@PathVariable BigInteger id) {
        return ResponseEntity.ok(reoperationEntityRepository.findById(id));
    }


}
