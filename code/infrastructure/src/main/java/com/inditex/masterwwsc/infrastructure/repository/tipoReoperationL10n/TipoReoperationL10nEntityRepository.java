package com.inditex.masterwwsc.infrastructure.repository.tipoReoperationL10n;

import com.inditex.masterwwsc.entities.TipoReoperacionL10n;
import com.inditex.masterwwsc.infrastructure.domain.entity.InMemoryTipoReoperacionEntity;
import com.inditex.masterwwsc.infrastructure.mapper.inmemory.InMemoryReoperationEntityMapper;
import com.inditex.masterwwsc.infrastructure.repository.tipoReoperationL10n.jpa.TipoReoperationL10nJpaRepository;

import java.math.BigInteger;
import java.util.List;
import java.util.Optional;

public class TipoReoperationL10nEntityRepository implements TipoReoperacionL10nJpaRepository {

    private TipoReoperationL10nJpaRepository tipoReoperationL10nJpaRepository;

    public TipoReoperationL10nEntityRepository(TipoReoperationL10nJpaRepository tipoReoperationL10nJpaRepository) {
        this.tipoReoperationL10nJpaRepository = tipoReoperationL10nJpaRepository;
    }

    @Override
    public List<TipoReoperacionL10n> findAll() {
        List<InMemoryTipoReoperacionEntity> result = tipoReoperationL10nJpaRepository.findAll();
        return InMemoryReoperationEntityMapper.INSTANCE.toDomainEntityList(result);
    }

    @Override
    public TipoReoperacionL10n findById(BigInteger id) {
        Optional<InMemoryTipoReoperacionEntity> result = tipoReoperationL10nJpaRepository.findById(id);
        return result.map(InMemoryReoperationEntityMapper.INSTANCE::toDomainEntity).orElse(null);
    }
}
