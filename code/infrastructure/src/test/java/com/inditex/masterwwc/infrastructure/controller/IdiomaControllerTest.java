package com.inditex.masterwwc.infrastructure.controller;

import com.inditex.masterwwsc.entities.Idioma;
import com.inditex.masterwwsc.infrastructure.controller.IdiomaController;
import com.inditex.masterwwsc.usecases.FindAllIdiomasUseCase;
import com.inditex.masterwwsc.usecases.FindByCodigoIdiomaUseCase;
import com.inditex.masterwwsc.usecases.FindByIdIdiomaUseCase;
import com.inditex.masterwwsc.usecases.FindByNombreIdiomaUseCase;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.ResponseEntity;

import java.math.BigInteger;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class IdiomaControllerTest {
    @Mock
    FindAllIdiomasUseCase findAllIdiomasUseCase;
    @Mock
    FindByIdIdiomaUseCase findByIdIdiomaUseCase;
    @Mock
    FindByCodigoIdiomaUseCase findByCodigoIdiomaUseCase;
    @Mock
    FindByNombreIdiomaUseCase findByNombreIdiomaUseCase;
    List<Idioma> idiomas;
    Idioma idioma;
    @InjectMocks
    IdiomaController idiomaController;
    AutoCloseable closeable;

    @BeforeEach
    void setup() {
        closeable = MockitoAnnotations.openMocks(this);
    }

    @Test
    void FindAll() {
        when(findAllIdiomasUseCase.findAll()).thenReturn(idiomas);
        ResponseEntity<List<Idioma>> result = idiomaController.getAllIdiomas();
        assertEquals(idiomas, result.getBody());
    }

    @Test
    void FindById() {
        when(findByIdIdiomaUseCase.findById(BigInteger.valueOf(1))).thenReturn(idioma);
        ResponseEntity<Idioma> result = idiomaController.getIdiomaById(BigInteger.valueOf(1));
        assertEquals(idioma, result.getBody());
    }

    @Test
    void testGetIdiomaByCodigo() {
        when(findByCodigoIdiomaUseCase.findByCodigo("es")).thenReturn(idioma);
        ResponseEntity<Idioma> result = idiomaController.getIdiomaByCodigo("es");
        assertEquals(idioma, result.getBody());
    }

    @Test
    void testGetIdiomaByNombre() {
        when(findByNombreIdiomaUseCase.findByNombre("Ingles")).thenReturn(idioma);
        ResponseEntity<Idioma> result = idiomaController.getIdiomaByNombre("Ingles");
        assertEquals(idioma, result.getBody());
    }
}