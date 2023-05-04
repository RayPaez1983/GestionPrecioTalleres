package com.inditex.masterwwsc.infrastructure.controller;

import com.inditex.masterwwsc.entities.TipoReoperacionL10n;
import com.inditex.masterwwsc.infrastructure.repository.tipoReoperationL10n.TipoReoperationL10nEntityRepository;
import com.inditex.masterwwsc.usecases.FindAllReoperationL10nUseCase;
import com.inditex.masterwwsc.usecases.FindByIdReoperationL10nUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigInteger;
import java.util.List;


@RestController
public class TipoReoperacionL10nController {

    private FindAllReoperationL10nUseCase findAllReoperationL10nUseCase;

    private FindByIdReoperationL10nUseCase findByIdReoperationL10nUseCase;

    public TipoReoperacionL10nController(FindAllReoperationL10nUseCase findAllReoperationL10nUseCase, FindByIdReoperationL10nUseCase findByIdReoperationL10nUseCase) {
        this.findAllReoperationL10nUseCase = findAllReoperationL10nUseCase;
        this.findByIdReoperationL10nUseCase = findByIdReoperationL10nUseCase;
    }

    @Autowired
    private TipoReoperationL10nEntityRepository tipoReoperationL10nEntityRepository;

    @GetMapping(value = "/reoperationL10n", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<TipoReoperacionL10n>> getAllTipoReoperacionL10n() {
        return ResponseEntity.ok(findAllReoperationL10nUseCase.findAllTipoReoperationL10n());
    }

    @GetMapping(value = "/reoperationL10n/{idTipoRepoeracion}/{idIdioma}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<TipoReoperacionL10n> getTipoReoperacionL10nById(@PathVariable Integer idTipoRepoeracion, @PathVariable Integer idIdioma) {
        return ResponseEntity.ok(findByIdReoperationL10nUseCase.findReoperationL10nById(idTipoRepoeracion, idIdioma));
    }
}
