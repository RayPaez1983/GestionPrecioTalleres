package com.inditex.masterwwsc.infrastructure.repository.idioma;

import com.inditex.masterwwsc.entities.Idioma;
import com.inditex.masterwwsc.infrastructure.domain.entity.InMemoryIdiomaRepositoryEntity;
import com.inditex.masterwwsc.infrastructure.mapper.inmemory.InMemoryIdiomaEntityMapper;
import com.inditex.masterwwsc.infrastructure.repository.idioma.jpa.IdiomaJpaRepository;
import com.inditex.masterwwsc.repository.IdiomaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;
import java.util.List;
import java.util.Optional;

@Repository
public class IdiomaEntityRepository implements IdiomaRepository {

    private IdiomaJpaRepository idiomaJpaRepository;

    public IdiomaEntityRepository(IdiomaJpaRepository idiomaJpaRepository) {
        this.idiomaJpaRepository = idiomaJpaRepository;
    }

    @Override
    public List<Idioma> findAll() {
        List<InMemoryIdiomaRepositoryEntity> result = idiomaJpaRepository.findAll();
        return InMemoryIdiomaEntityMapper.INSTANCE.toDomainEntityList(result);
    }

    @Override
    public Idioma findById(BigInteger id) {
        Optional<InMemoryIdiomaRepositoryEntity> result = idiomaJpaRepository.findById(id);
        return result.map(InMemoryIdiomaEntityMapper.INSTANCE::toDomainEntity).orElse(null);
    }

    @Override
    public Idioma findByCodigo(String codigo) {
        Optional<InMemoryIdiomaRepositoryEntity> result = idiomaJpaRepository.findByCodigo(codigo);
        return result.map(InMemoryIdiomaEntityMapper.INSTANCE::toDomainEntity).orElse(null);
    }

    @Override
    public Idioma findByNombre(String nombre) {
        Optional<InMemoryIdiomaRepositoryEntity> result = idiomaJpaRepository.findByNombre(nombre);
        return result.map(InMemoryIdiomaEntityMapper.INSTANCE::toDomainEntity).orElse(null);
    }
}
