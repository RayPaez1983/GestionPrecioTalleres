package com.inditex.masterwwsc.infrastructure.repository.reoperation;

import com.inditex.masterwwsc.entities.TipoReoperacion;
import com.inditex.masterwwsc.infrastructure.domain.entity.InMemoryTipoReoperacionEntity;
import com.inditex.masterwwsc.infrastructure.mapper.inmemory.InMemoryReoperationEntityMapper;
import com.inditex.masterwwsc.infrastructure.repository.reoperation.jpa.ReoperationJpaRepository;
import com.inditex.masterwwsc.repository.TipoReoperacionRepository;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;
import java.util.List;
import java.util.Optional;

@Repository
public class ReoperationEntityRepository implements TipoReoperacionRepository {

    private ReoperationJpaRepository reoperationJpaRepository;

    public ReoperationEntityRepository(ReoperationJpaRepository reoperationJpaRepository) {
        this.reoperationJpaRepository = reoperationJpaRepository;
    }

    @Override
    public List<TipoReoperacion> findAll() {
        List<InMemoryTipoReoperacionEntity> result = reoperationJpaRepository.findAll();
        return InMemoryReoperationEntityMapper.INSTANCE.toDomainEntityList(result);
    }

    @Override
    public TipoReoperacion findById(BigInteger id) {
        Optional<InMemoryTipoReoperacionEntity> result = reoperationJpaRepository.findById(id);
        return result.map(InMemoryReoperationEntityMapper.INSTANCE::toDomainEntity).orElse(null);
    }
}
