package com.inditex.masterwwc.infrastructure.spy;

import com.inditex.masterwwsc.entities.TipoReoperacionL10n;
import com.inditex.masterwwsc.infrastructure.controller.TipoReoperacionL10nController;
import com.inditex.masterwwsc.usecases.FindAllReoperationL10nUseCase;
import com.inditex.masterwwsc.usecases.FindByIdReoperationL10nUseCase;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class TipoReoperacionL10nControllerSpyTest {
    @Spy
    FindAllReoperationL10nUseCase findAllReoperationL10nUseCase;
    @Spy
    FindByIdReoperationL10nUseCase findByIdReoperationL10nUseCase;
    List<TipoReoperacionL10n> listaTipoReoperacionL10n;
    TipoReoperacionL10n tipoReoperacionL10n;
    @InjectMocks
    TipoReoperacionL10nController tipoReoperacionL10nController;
    AutoCloseable closeable;

    @BeforeEach
    void setup() {
        closeable = MockitoAnnotations.openMocks(this);
    }

    @Test
    void testFindAll() {
        when(findAllReoperationL10nUseCase.findAllTipoReoperationL10n()).thenReturn(listaTipoReoperacionL10n);
        ResponseEntity<List<TipoReoperacionL10n>> result = tipoReoperacionL10nController.getAllTipoReoperacionL10n();
        assertEquals(listaTipoReoperacionL10n, result.getBody());
        assertEquals(HttpStatusCode.valueOf(200), result.getStatusCode());
        verify(findAllReoperationL10nUseCase).findAllTipoReoperationL10n();
    }

    @Test
    void testFindById() {
        when(findByIdReoperationL10nUseCase.findReoperationL10nById(1, 1)).thenReturn(tipoReoperacionL10n);
        ResponseEntity<TipoReoperacionL10n> result = tipoReoperacionL10nController.getTipoReoperacionL10nById(1, 1);
        assertEquals(tipoReoperacionL10n, result.getBody());
        verify(findByIdReoperationL10nUseCase).findReoperationL10nById(1, 1);
    }

}
