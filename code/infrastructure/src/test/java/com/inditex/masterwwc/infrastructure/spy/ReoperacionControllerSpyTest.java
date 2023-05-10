package com.inditex.masterwwc.infrastructure.spy;

import com.inditex.masterwwsc.entities.TipoReoperacion;
import com.inditex.masterwwsc.infrastructure.controller.TipoReoperacionController;
import com.inditex.masterwwsc.usecases.FindByIdReoperationUseCase;
import com.inditex.masterwwsc.usecases.ListAllReoperationsUseCase;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;
import org.springframework.http.ResponseEntity;

import java.math.BigInteger;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class ReoperacionControllerSpyTest {
    @Spy
    ListAllReoperationsUseCase listAllReoperationsUseCase;
    @Spy
    FindByIdReoperationUseCase findByIdReoperationUseCase;
    List<TipoReoperacion> tipoReoperacionList;
    TipoReoperacion tipoReoperacion;
    @InjectMocks
    TipoReoperacionController tipoReoperacionController;
    AutoCloseable closeable;

    @BeforeEach
    void setup() {
        closeable = MockitoAnnotations.openMocks(this);
    }

    @Test
    void findAll(){
        when(listAllReoperationsUseCase.findAllTipoReoperacion()).thenReturn(tipoReoperacionList);
        ResponseEntity<List<TipoReoperacion>> result = tipoReoperacionController.getAllTipoReoperacion();
        assertEquals(tipoReoperacionList, result.getBody());
        verify(listAllReoperationsUseCase).findAllTipoReoperacion();
    }

    @Test
    void findById(){
        when(findByIdReoperationUseCase.findReoperationById(BigInteger.valueOf(1))).thenReturn(tipoReoperacion);
        ResponseEntity<TipoReoperacion> result = tipoReoperacionController.getTipoReoperacionById(BigInteger.valueOf(1));
        assertEquals(tipoReoperacion, result.getBody());
        verify(findByIdReoperationUseCase).findReoperationById(BigInteger.valueOf(1));
    }
}
