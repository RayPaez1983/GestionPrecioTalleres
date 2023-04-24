package com.inditex.masterwwsc;
import com.inditex.masterwwsc.SaludoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DemoController {
     private SaludoRepository saludoRepository;
    @GetMapping(value = "/hello", produces =MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Saludo> sayHello(){
        return ResponseEntity.ok(new Saludo());
    }

    @GetMapping(value = "/user", produces =MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Saludo> getUser(){
        return ResponseEntity.ok(new Saludo());
    }
    @GetMapping(value = "/users", produces =MediaType.APPLICATION_JSON_VALUE)
    List<Saludo> getAllUsers(){
        return saludoRepository.findAll();
    }
}
