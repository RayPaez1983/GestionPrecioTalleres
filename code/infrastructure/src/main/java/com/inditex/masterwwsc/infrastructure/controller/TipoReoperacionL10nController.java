package com.inditex.masterwwsc.infrastructure.controller;

import org.springframework.web.bind.annotation.RestController;


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
