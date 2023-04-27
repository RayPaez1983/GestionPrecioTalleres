package com.inditex.masterwwsc.infrastructure.repository.reoperation.jpa;

import com.inditex.masterwwsc.infrastructure.domain.entity.InMemoryTipoReoperacionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;

@Repository
public interface ReoperationJpaRepository extends JpaRepository<InMemoryTipoReoperacionEntity, BigInteger> {

}
