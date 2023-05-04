package com.inditex.masterwwsc.infrastructure.repository.tipoReoperationL10n.jpa;

import com.inditex.masterwwsc.infrastructure.domain.entity.InMemoryTipoReoperacionL10nEntity;
import com.inditex.masterwwsc.infrastructure.domain.entity.TipoReoperacionL10nEmbeddable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;

@Repository
public interface TipoReoperationL10nJpaRepository extends JpaRepository<InMemoryTipoReoperacionL10nEntity, TipoReoperacionL10nEmbeddable> {
}
