package com.inditex.masterwwsc.usecase;

import com.inditex.masterwwsc.entities.TipoReoperacionL10n;
import com.inditex.masterwwsc.repository.TipoReoperacionL10nRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class FindAllReoperationL10nUseCaseTest {

    @Mock
    TipoReoperacionL10nRepository tipoReoperacionL10nRepository;

    @Mock
    List<TipoReoperacionL10n> tipoReoperacionL10nList;

    AutoCloseable closeable;

    @InjectMocks
    FindAllReoperationL10nUseCaseImp findAllReoperationL10nUseCaseImp;

    @BeforeEach
    void setup() {
        closeable = MockitoAnnotations.openMocks(this);
    }

    @Test
    void testFindAllTipoReoperacionL10n() {
        when(tipoReoperacionL10nRepository.findAll()).thenReturn(tipoReoperacionL10nList);
        List<TipoReoperacionL10n> result = findAllReoperationL10nUseCaseImp.findAllTipoReoperationL10n();
        assertEquals(tipoReoperacionL10nList, result);

    }

}
