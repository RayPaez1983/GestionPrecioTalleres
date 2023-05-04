package com.inditex.masterwwsc.infrastructure.repository.tipoReoperationL10n;

import com.inditex.masterwwsc.entities.TipoReoperacionL10n;
import com.inditex.masterwwsc.infrastructure.domain.entity.InMemoryTipoReoperacionL10nEntity;
import com.inditex.masterwwsc.infrastructure.domain.entity.TipoReoperacionL10nEmbeddable;
import com.inditex.masterwwsc.infrastructure.mapper.inmemory.InMemoryTipoReoperacionL10nEntityMapper;
import com.inditex.masterwwsc.infrastructure.repository.tipoReoperationL10n.jpa.TipoReoperationL10nJpaRepository;
import com.inditex.masterwwsc.repository.TipoReoperacionL10nRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

public class TipoReoperationL10nEntityRepository implements TipoReoperacionL10nJpaRepository {

    private TipoReoperationL10nJpaRepository tipoReoperationL10nJpaRepository;

    public TipoReoperationL10nEntityRepository(TipoReoperationL10nJpaRepository tipoReoperationL10nJpaRepository) {
        this.tipoReoperationL10nJpaRepository = tipoReoperationL10nJpaRepository;
    }

    @Override
    public List<TipoReoperacionL10n> findAll() {
        List<InMemoryTipoReoperacionL10nEntity> result = tipoReoperationL10nJpaRepository.findAll();
        return InMemoryTipoReoperacionL10nEntityMapper.INSTANCE.toDomainEntityList(result);
    }

    @Override
    public TipoReoperacionL10n findById(Integer idTipoReoperacion, Integer idIdioma) {
        TipoReoperacionL10nEmbeddable id = new TipoReoperacionL10nEmbeddable(idTipoReoperacion, idIdioma);
        Optional<InMemoryTipoReoperacionL10nEntity> result = tipoReoperationL10nJpaRepository.findById(id);
        return result.map(InMemoryTipoReoperacionL10nEntityMapper.INSTANCE::toDomainEntity).orElse(null);
    }
}
