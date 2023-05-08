package com.inditex.masterwwc.infrastructure.repository;

import com.inditex.masterwwsc.entities.TipoReoperacionL10n;
import com.inditex.masterwwsc.infrastructure.domain.entity.InMemoryTipoReoperacionL10nEntity;
import com.inditex.masterwwsc.infrastructure.domain.entity.TipoReoperacionL10nEmbeddable;
import com.inditex.masterwwsc.infrastructure.mapper.inmemory.InMemoryTipoReoperacionL10nEntityMapper;
import com.inditex.masterwwsc.infrastructure.repository.tipoReoperationL10n.TipoReoperationL10nEntityRepository;
import com.inditex.masterwwsc.infrastructure.repository.tipoReoperationL10n.jpa.TipoReoperationL10nJpaRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class TipoReoperacionL10nRepositoryTest {

    @Mock
    TipoReoperationL10nJpaRepository tipoReoperationL10nJpaRepository;

    @Mock
    Optional<InMemoryTipoReoperacionL10nEntity> tipoReoperacionL10nOptional;

    @Mock
    TipoReoperacionL10nEmbeddable tipoReoperacionL10nEmbeddable;

    List<TipoReoperacionL10n> tipoReoperacionL10nList;
    TipoReoperacionL10n tipoReoperacionL10n;

    @InjectMocks
    TipoReoperationL10nEntityRepository tipoReoperationL10nEntityRepository;

    AutoCloseable closeable;

    @BeforeEach
    void setup() {
        closeable = MockitoAnnotations.openMocks(this);
    }

    @Test
    void testFindById() {
        when(tipoReoperationL10nJpaRepository.findById(tipoReoperacionL10nEmbeddable)).thenReturn(tipoReoperacionL10nOptional);
        when(InMemoryTipoReoperacionL10nEntityMapper.INSTANCE.toDomainEntity(tipoReoperationL10nJpaRepository.findById(tipoReoperacionL10nEmbeddable).get())).thenReturn(tipoReoperacionL10n);
        TipoReoperacionL10n result = tipoReoperationL10nEntityRepository.findById(1, 1);
        assertEquals(tipoReoperacionL10n, result);
    }

    @Test
    void testFindAll() {
        when(InMemoryTipoReoperacionL10nEntityMapper.INSTANCE.toDomainEntityList(tipoReoperationL10nJpaRepository.findAll())).thenReturn(tipoReoperacionL10nList);
        List<TipoReoperacionL10n> result = tipoReoperationL10nEntityRepository.findAll();
        assertEquals(tipoReoperacionL10nList, result);
    }


}
