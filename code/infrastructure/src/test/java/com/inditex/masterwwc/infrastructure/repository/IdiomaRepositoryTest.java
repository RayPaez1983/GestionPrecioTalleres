package com.inditex.masterwwc.infrastructure.repository;

import com.inditex.masterwwsc.entities.Idioma;
import com.inditex.masterwwsc.infrastructure.domain.entity.InMemoryIdiomaRepositoryEntity;
import com.inditex.masterwwsc.infrastructure.mapper.inmemory.InMemoryIdiomaEntityMapper;
import com.inditex.masterwwsc.infrastructure.repository.idioma.IdiomaEntityRepository;
import com.inditex.masterwwsc.infrastructure.repository.idioma.jpa.IdiomaJpaRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.math.BigInteger;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class IdiomaRepositoryTest {

    @Mock
    IdiomaJpaRepository idiomaJpaRepository;

    List<Idioma> idiomas;

    Idioma idioma;

    @Mock
    Optional<InMemoryIdiomaRepositoryEntity> idiomaOptional;

    @InjectMocks
    IdiomaEntityRepository idiomaEntityRepository;

    AutoCloseable closeable;

    @BeforeEach
    void setup() {
        closeable = MockitoAnnotations.openMocks(this);
    }

    @Test
    void testFindAll() {
        when(InMemoryIdiomaEntityMapper.INSTANCE.toDomainEntityList(idiomaJpaRepository.findAll())).thenReturn(idiomas);
        List<Idioma> result = idiomaEntityRepository.findAll();
        assertEquals(idiomas, result);
        verify(idiomaJpaRepository).findAll();
    }

    @Test
    void testFindById() {
        BigInteger id = BigInteger.valueOf(3);
        when(idiomaJpaRepository.findById(id)).thenReturn(idiomaOptional);
        when(InMemoryIdiomaEntityMapper.INSTANCE.toDomainEntity(idiomaJpaRepository.findById(id).get())).thenReturn(idioma);
        Idioma result = idiomaEntityRepository.findById(id);
        assertEquals(idioma, result);
    }

    @Test
    void testFindByCodigo() {
        when(idiomaJpaRepository.findByCodigo("es")).thenReturn(idiomaOptional);
        when(InMemoryIdiomaEntityMapper.INSTANCE.toDomainEntity(idiomaJpaRepository.findByCodigo("es").get())).thenReturn(idioma);
        Idioma result = idiomaEntityRepository.findByCodigo("es");
        assertEquals(idioma, result);
    }

    @Test
    void testFindByNombre() {
        when(idiomaJpaRepository.findByNombre("Ingles")).thenReturn(idiomaOptional);
        when(InMemoryIdiomaEntityMapper.INSTANCE.toDomainEntity(idiomaJpaRepository.findByNombre("Ingles").get())).thenReturn(idioma);
        Idioma result = idiomaEntityRepository.findByNombre("Ingles");
        assertEquals(idioma, result);
    }

}
