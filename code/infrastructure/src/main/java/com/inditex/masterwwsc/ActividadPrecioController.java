package com.inditex.masterwwsc;
import com.inditex.masterwwsc.entities.ActividadPrecio;
import com.inditex.masterwwsc.entities.GrupoReoperacion;
import com.inditex.masterwwsc.repository.ActividaPrecioRepository;
import com.inditex.masterwwsc.repository.GrupoReoperacionRepository;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ActividadPrecioController {

    private ActividaPrecioRepository actividaPrecioRepository;

    public ActividadPrecioController(ActividaPrecioRepository actividaPrecioRepository) {
        this.actividaPrecioRepository = actividaPrecioRepository;
    }

    @GetMapping(value = "/actividad_precio", produces =MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List <ActividadPrecio>> getAllPriceActivity(){
        return ResponseEntity.ok(actividaPrecioRepository.findAll());
    }
}