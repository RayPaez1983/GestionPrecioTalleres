package com.inditex.masterwwsc;

import com.inditex.masterwwsc.entities.MaestroCentroDistribucion;
import com.inditex.masterwwsc.repository.MaestroCentroOperacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MaestroGrupoRedistribucionController {
    @Autowired
    private MaestroCentroOperacionRepository maestroCentroOperacionRepository;

    public MaestroGrupoRedistribucionController(MaestroCentroOperacionRepository maestroCentroOperacionRepository) {
        this.maestroCentroOperacionRepository = maestroCentroOperacionRepository;
    }

    @GetMapping(value = "/maestro_centro_redistribucion", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List <MaestroCentroDistribucion>> getAllMaestroRedistribucion(){
        return ResponseEntity.ok(maestroCentroOperacionRepository .findAll());
    }

}
