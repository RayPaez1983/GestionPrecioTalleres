package com.inditex.masterwwsc.usecase;

import com.inditex.masterwwsc.entities.Idioma;
import com.inditex.masterwwsc.repository.IdiomaRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class FindByCodigoIdiomaUseCaseTest {

    @Mock
    IdiomaRepository idiomaRepository;
    @Mock
    Idioma idioma;
    @InjectMocks
    FindByCodigoIdiomaUseCaseImp findByCodigoIdiomaUseCase;

    AutoCloseable closeable;

    @BeforeEach
    void setUp() {
        closeable = MockitoAnnotations.openMocks(this);
    }

    @Test
    void testFindByCodigoIdioma() {
        when(idiomaRepository.findByCodigo("es")).thenReturn(idioma);
        Idioma idiomaResultado = findByCodigoIdiomaUseCase.findByCodigo("es");
        assertEquals(idiomaResultado, idioma);
    }
}
