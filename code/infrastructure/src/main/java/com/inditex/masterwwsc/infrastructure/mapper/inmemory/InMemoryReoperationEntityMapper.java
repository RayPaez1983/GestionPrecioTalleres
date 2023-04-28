package com.inditex.masterwwsc.infrastructure.mapper.inmemory;

import com.inditex.masterwwsc.entities.TipoReoperacion;
import com.inditex.masterwwsc.infrastructure.domain.entity.InMemoryTipoReoperacionEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface InMemoryReoperationEntityMapper extends InMemoryEntityMapper<TipoReoperacion, InMemoryTipoReoperacionEntity> {
    InMemoryReoperationEntityMapper INSTANCE = Mappers.getMapper(InMemoryReoperationEntityMapper.class);

    @Override
    @Mapping(source = "idTipoReoperacion", target = "IdTipoReoperacion")
    TipoReoperacion toDomainEntity(InMemoryTipoReoperacionEntity inMemoryTipoReoperacionEntity);

}
