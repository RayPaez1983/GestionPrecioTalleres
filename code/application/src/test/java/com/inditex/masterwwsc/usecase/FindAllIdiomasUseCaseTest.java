package com.inditex.masterwwsc.usecase;

import com.inditex.masterwwsc.entities.Idioma;
import com.inditex.masterwwsc.repository.IdiomaRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class FindAllIdiomasUseCaseTest {

    @Mock
    IdiomaRepository idiomaRepository;

    @Mock
    List<Idioma> idiomaList;

    @InjectMocks
    FindAllIdiomasUseCaseImp findAllIdiomasUseCaseImp;

    AutoCloseable closeable;

    @BeforeEach
    void setup() {
        closeable = MockitoAnnotations.openMocks(this);
    }

    @Test
    void testFindAllIdiomas() {
        when(idiomaRepository.findAll()).thenReturn(idiomaList);
        List<Idioma> result = findAllIdiomasUseCaseImp.findAll();
        assertEquals(idiomaList, result);

    }
}
