package com.inditex.masterwwsc.usecase;

import com.inditex.masterwwsc.entities.TipoReoperacion;
import com.inditex.masterwwsc.repository.TipoReoperacionRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class FindByIdReoperationUseCaseTest {


    @Mock
    TipoReoperacionRepository tipoReoperacionRepository;
    @Mock
    TipoReoperacion tipoReoperacion;
    @InjectMocks
    FindByIdReoperationUseCaseImpl findByIdReoperationUseCase;

    AutoCloseable closeable;

    @BeforeEach
    void setUp() {
        closeable = MockitoAnnotations.openMocks(this);
    }

    @Test
    void testFindReoperationById() {
        BigInteger id = BigInteger.valueOf(1);
        when(tipoReoperacionRepository.findById(id)).thenReturn(tipoReoperacion);
        TipoReoperacion result = findByIdReoperationUseCase.findReoperationById(id);
        assertEquals(tipoReoperacion, result);
    }
}
