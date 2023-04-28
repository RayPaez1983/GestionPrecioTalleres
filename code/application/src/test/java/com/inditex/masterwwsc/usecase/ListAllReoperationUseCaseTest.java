package com.inditex.masterwwsc.usecase;

import com.inditex.masterwwsc.entities.TipoReoperacion;
import com.inditex.masterwwsc.repository.TipoReoperacionRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class ListAllReoperationUseCaseTest {

    @Mock
    TipoReoperacionRepository tipoReoperacionRepository;
    @Mock
    List<TipoReoperacion> tipoReoperacionList;
    @InjectMocks
    ListAllReoperationUseCaseImp listAllReoperationUseCaseImp;

    AutoCloseable closeable;

    @BeforeEach
    void setUp() {
        closeable = MockitoAnnotations.openMocks(this);
    }

    @Test
    void testFindReoperationList() {
        when(tipoReoperacionRepository.findAll()).thenReturn(tipoReoperacionList);
        List<TipoReoperacion> result = listAllReoperationUseCaseImp.findAllTipoReoperacion();
        assertEquals(tipoReoperacionList, result);
    }
}
