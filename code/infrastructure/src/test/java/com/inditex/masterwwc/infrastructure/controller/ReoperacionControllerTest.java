package com.inditex.masterwwc.infrastructure.controller;

import com.inditex.masterwwsc.entities.TipoReoperacion;
import com.inditex.masterwwsc.infrastructure.controller.TipoReoperacionController;
import com.inditex.masterwwsc.usecases.FindByIdReoperationUseCase;
import com.inditex.masterwwsc.usecases.ListAllReoperationsUseCase;
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

public class ReoperacionControllerTest {
    @Mock
    ListAllReoperationsUseCase listAllReoperationsUseCase;
    @Mock
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
    }

    @Test
    void findById(){
        when(findByIdReoperationUseCase.findReoperationById(BigInteger.valueOf(1))).thenReturn(tipoReoperacion);
        ResponseEntity<TipoReoperacion> result = tipoReoperacionController.getTipoReoperacionById(BigInteger.valueOf(1));
        assertEquals(tipoReoperacion, result.getBody());
    }
}
