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

public class FindByNombreUseCaseTest {
    @Mock
    IdiomaRepository idiomaRepository;

    @Mock
    Idioma idioma;

    @InjectMocks
    FindByNombreIdiomaUseCaseImp findByNombreIdiomaUseCaseImp;

    AutoCloseable closeable;

    @BeforeEach
    void setUp() {
        closeable = MockitoAnnotations.openMocks(this);
    }

    @Test
    void testFindByNombreIdioma() {
        when(idiomaRepository.findByNombre("es")).thenReturn(idioma);
        Idioma result = findByNombreIdiomaUseCaseImp.findByNombre("es");
        assertEquals(idioma, result);
    }
}
