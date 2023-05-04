package com.inditex.masterwwsc.usecase;

import com.inditex.masterwwsc.entities.TipoReoperacionL10n;
import com.inditex.masterwwsc.repository.TipoReoperacionL10nRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class FindByIdReoperationL10nUseCaseTest {

    @Mock
    TipoReoperacionL10nRepository tipoReoperacionL10nRepository;
    @Mock
    TipoReoperacionL10n tipoReoperacionL10n;
    @InjectMocks
    FindByIdReoperationL10nUseCaseImp findByIdReoperationL10nUseCaseImp;

    AutoCloseable closeable;

    @BeforeEach
    void setUp() {
        closeable = MockitoAnnotations.openMocks(this);
    }

    @Test
    void testFindReoperationL10nById() {
        Integer idTipoReoperation = 1;
        Integer idIdioma = 1;
        when(tipoReoperacionL10nRepository.findById(idTipoReoperation, idIdioma)).thenReturn(tipoReoperacionL10n);
        TipoReoperacionL10n result = findByIdReoperationL10nUseCaseImp.findReoperationL10nById(idTipoReoperation, idIdioma);
        assertEquals(tipoReoperacionL10n, result);
    }
}
