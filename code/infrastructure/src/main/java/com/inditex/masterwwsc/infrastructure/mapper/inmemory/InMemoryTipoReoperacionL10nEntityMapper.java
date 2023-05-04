package com.inditex.masterwwsc.infrastructure.mapper.inmemory;

import com.inditex.masterwwsc.entities.TipoReoperacionL10n;
import com.inditex.masterwwsc.infrastructure.domain.entity.InMemoryTipoReoperacionL10nEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface InMemoryTipoReoperacionL10nEntityMapper extends InMemoryEntityMapper<TipoReoperacionL10n, InMemoryTipoReoperacionL10nEntity> {

    InMemoryTipoReoperacionL10nEntityMapper INSTANCE = Mappers.getMapper(InMemoryTipoReoperacionL10nEntityMapper.class);

    @Override
    @Mapping(source = "tipoReoperacion.idTipoReoperacion", target = "IdTipoReoperacion")
    @Mapping(source = "inMemoryIdiomaRepositoryEntity.idIdioma", target = "IdIdioma")
    TipoReoperacionL10n toDomainEntity(InMemoryTipoReoperacionL10nEntity inMemoryTipoReoperacionL10NEntity);
}
