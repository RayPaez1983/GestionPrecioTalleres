package com.inditex.masterwwsc;

import com.inditex.masterwwsc.entities.ActividadL10n;
import com.inditex.masterwwsc.repository.ActividadL10nRepository;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ActividadL10nController {

    private ActividadL10nRepository actividadL10nRepository;

    public ActividadL10nController(ActividadL10nRepository actividadL10nRepository) {
        this.actividadL10nRepository = actividadL10nRepository;
    }

    @GetMapping(value = "/actividad_l10n", produces =MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List <ActividadL10n>> getAllL10nActivity(){
          return ResponseEntity.ok(actividadL10nRepository.findAll());
   }
}
