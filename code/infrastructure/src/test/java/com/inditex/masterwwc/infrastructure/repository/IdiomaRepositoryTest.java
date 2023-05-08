package com.inditex.masterwwc.infrastructure.repository;

import com.inditex.masterwwsc.entities.Idioma;
import com.inditex.masterwwsc.infrastructure.mapper.inmemory.InMemoryIdiomaEntityMapper;
import com.inditex.masterwwsc.infrastructure.repository.idioma.IdiomaEntityRepository;
import com.inditex.masterwwsc.infrastructure.repository.idioma.jpa.IdiomaJpaRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class IdiomaRepositoryTest {

    @Mock
    IdiomaJpaRepository idiomaJpaRepository;

    //List<InMemoryIdiomaRepositoryEntity> inMemoryIdiomaRepositoryEntities;
    List<Idioma> idiomas;

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
    }


}
