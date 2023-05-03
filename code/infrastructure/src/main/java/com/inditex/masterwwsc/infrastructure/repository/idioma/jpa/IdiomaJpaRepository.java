package com.inditex.masterwwsc.infrastructure.repository.idioma.jpa;

import com.inditex.masterwwsc.infrastructure.domain.entity.InMemoryIdiomaRepositoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;
import java.util.Optional;

@Repository
public interface IdiomaJpaRepository extends JpaRepository<InMemoryIdiomaRepositoryEntity, BigInteger> {
    Optional<InMemoryIdiomaRepositoryEntity> findByCodigo(String codigo);

    Optional<InMemoryIdiomaRepositoryEntity> findByNombre(String nombre);

}
