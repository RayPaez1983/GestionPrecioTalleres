package com.inditex.masterwwsc.usecase;

import com.inditex.masterwwsc.entities.Idioma;
import com.inditex.masterwwsc.repository.IdiomaRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class FindByIdIdiomaUseCaseTest {
    @Mock
    IdiomaRepository idiomaRepository;
    @Mock
    Idioma idioma;
    @InjectMocks
    FindByIdIdiomaUseCaseImp findByIdIdiomaUseCaseImp;

    AutoCloseable closeable;

    @BeforeEach
    void setUp() {
        closeable = MockitoAnnotations.openMocks(this);
    }

    @Test
    void testFindReoperationById() {
        BigInteger id = BigInteger.valueOf(1);
        when(idiomaRepository.findById(id)).thenReturn(idioma);
        Idioma result = findByIdIdiomaUseCaseImp.findById(id);
        assertEquals(idioma, result);
    }
}
