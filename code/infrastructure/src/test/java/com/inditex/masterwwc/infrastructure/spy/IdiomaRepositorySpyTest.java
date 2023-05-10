package com.inditex.masterwwc.infrastructure.spy;

import com.inditex.masterwwsc.entities.Idioma;
import com.inditex.masterwwsc.infrastructure.controller.IdiomaController;
import com.inditex.masterwwsc.infrastructure.mapper.inmemory.InMemoryIdiomaEntityMapper;
import com.inditex.masterwwsc.infrastructure.repository.idioma.IdiomaEntityRepository;
import com.inditex.masterwwsc.infrastructure.repository.idioma.jpa.IdiomaJpaRepository;
import com.inditex.masterwwsc.repository.IdiomaRepository;
import com.inditex.masterwwsc.usecase.FindByIdIdiomaUseCaseImp;
import com.inditex.masterwwsc.usecases.FindAllIdiomasUseCase;
import com.inditex.masterwwsc.usecases.FindByCodigoIdiomaUseCase;
import com.inditex.masterwwsc.usecases.FindByIdIdiomaUseCase;
import com.inditex.masterwwsc.usecases.FindByNombreIdiomaUseCase;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ContextConfiguration;

import java.math.BigInteger;
import java.time.LocalDateTime;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class IdiomaRepositorySpyTest {
    @Spy
    FindAllIdiomasUseCase findAllIdiomasUseCase;
    @Spy
    FindByIdIdiomaUseCase findByIdIdiomaUseCase;
    @Spy
    FindByCodigoIdiomaUseCase findByCodigoIdiomaUseCase;
    @Spy
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
        verify(findAllIdiomasUseCase).findAll();
    }

    @Test
    void FindById() {
        when(findByIdIdiomaUseCase.findById(BigInteger.valueOf(1))).thenReturn(idioma);
        ResponseEntity<Idioma> result = idiomaController.getIdiomaById(BigInteger.valueOf(1));
        assertEquals(idioma, result.getBody());
        verify(findByIdIdiomaUseCase).findById(BigInteger.valueOf(1));
    }

    @Test
    void testGetIdiomaByCodigo() {
        when(findByCodigoIdiomaUseCase.findByCodigo("es")).thenReturn(idioma);
        ResponseEntity<Idioma> result = idiomaController.getIdiomaByCodigo("es");
        assertEquals(idioma, result.getBody());
        verify(findByCodigoIdiomaUseCase).findByCodigo("es");
    }

    @Test
    void testGetIdiomaByNombre() {
        when(findByNombreIdiomaUseCase.findByNombre("Ingles")).thenReturn(idioma);
        ResponseEntity<Idioma> result = idiomaController.getIdiomaByNombre("Ingles");
        assertEquals(idioma, result.getBody());
        verify(findByNombreIdiomaUseCase).findByNombre("Ingles");
    }
}