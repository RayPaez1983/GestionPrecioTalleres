package com.inditex.masterwwsc;
import com.inditex.masterwwsc.entities.GrupoReoperacion;
import com.inditex.masterwwsc.repository.GrupoReoperacionRepository;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class GrupoReoperacionController {

    private GrupoReoperacionRepository grupoReoperacionRepository;

    public GrupoReoperacionController(GrupoReoperacionRepository grupoReoperacionRepository) {
        this.grupoReoperacionRepository = grupoReoperacionRepository;
    }

    @GetMapping(value = "/grupo_reoperacion", produces =MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List <GrupoReoperacion>> getAllReoperationGroups(){
          return ResponseEntity.ok(grupoReoperacionRepository.findAll());
   }
}
