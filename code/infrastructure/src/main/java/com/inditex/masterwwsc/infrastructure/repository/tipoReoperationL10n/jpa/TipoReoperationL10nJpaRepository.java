package com.inditex.masterwwsc.infrastructure.repository.tipoReoperationL10n.jpa;

import com.inditex.masterwwsc.infrastructure.domain.entity.InMemoryTipoReoperacionI10nEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;

@Repository
public interface TipoReoperationL10nJpaRepository extends JpaRepository<InMemoryTipoReoperacionI10nEntity, BigInteger> {
}
