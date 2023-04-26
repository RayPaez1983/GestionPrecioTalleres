package com.inditex.masterwwsc;

import com.inditex.masterwwsc.entities.Actividad;
import com.inditex.masterwwsc.repository.ActividadRepository;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public class ActividadController {

    private ActividadRepository actividadRepository;

    public ActividadController(ActividadRepository actividadRepository) {
        this.actividadRepository = actividadRepository;
    }

    @GetMapping(value = "/actividad", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Actividad>> getAllActivities(){
        return ResponseEntity.ok(actividadRepository.findAll());
    }
}
