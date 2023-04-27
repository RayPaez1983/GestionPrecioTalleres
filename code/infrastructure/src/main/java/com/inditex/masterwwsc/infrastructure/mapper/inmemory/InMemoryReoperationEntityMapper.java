package com.inditex.masterwwsc.infrastructure.mapper.inmemory;

import com.inditex.masterwwsc.entities.TipoReoperacion;
import com.inditex.masterwwsc.infrastructure.domain.entity.InMemoryTipoReoperacionEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface InMemoryReoperationEntityMapper extends InMemoryEntityMapper<TipoReoperacion, InMemoryTipoReoperacionEntity>{



}
