package com.inditex.masterwwsc;

import com.inditex.masterwwsc.repository.MaestroCentroOperacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class MaestroGrupoRedistribucionController {
    @Autowired
    private MaestroCentroOperacionRepository maestroCentroOperacionRepository;

    @GetMapping("/maestro_centro_redistribucion", produces = MediaType.APPLICATION_JSON_VALUE)

}
