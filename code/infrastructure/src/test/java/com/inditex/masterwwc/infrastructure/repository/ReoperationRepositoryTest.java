package com.inditex.masterwwc.infrastructure.repository;

import com.inditex.masterwwsc.entities.TipoReoperacion;
import com.inditex.masterwwsc.infrastructure.domain.entity.InMemoryTipoReoperacionEntity;
import com.inditex.masterwwsc.infrastructure.mapper.inmemory.InMemoryReoperationEntityMapper;
import com.inditex.masterwwsc.infrastructure.repository.reoperation.ReoperationEntityRepository;
import com.inditex.masterwwsc.infrastructure.repository.reoperation.jpa.ReoperationJpaRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.math.BigInteger;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class ReoperationRepositoryTest {

    @Mock
    ReoperationJpaRepository reoperationJpaRepository;

    List<TipoReoperacion> tipoReoperaciones;
    TipoReoperacion tipoReoperacion;
    @Mock
    Optional<InMemoryTipoReoperacionEntity> tipoReoperacionOptional;

    @InjectMocks
    ReoperationEntityRepository reoperationEntityRepository;

    AutoCloseable closeable;

    @BeforeEach
    void setup() {
        closeable = MockitoAnnotations.openMocks(this);
    }

    @Test
    void testFindAll(){
        when(InMemoryReoperationEntityMapper.INSTANCE.toDomainEntityList(reoperationJpaRepository.findAll())).thenReturn(tipoReoperaciones);
        List<TipoReoperacion> result = reoperationEntityRepository.findAll();
        assertEquals(tipoReoperaciones, result);
    }

    @Test
    void testFindById(){
        BigInteger id = BigInteger.valueOf(1);
        when(reoperationJpaRepository.findById(id)).thenReturn(tipoReoperacionOptional);
        when(InMemoryReoperationEntityMapper.INSTANCE.toDomainEntity(reoperationJpaRepository.findById(id).get())).thenReturn(tipoReoperacion);
        TipoReoperacion result = reoperationEntityRepository.findById(id);
        assertEquals(tipoReoperacion, result);
    }
}
