package com.inditex.masterwwsc.infrastructure.mapper.inmemory;

import com.inditex.masterwwsc.entities.Idioma;
import com.inditex.masterwwsc.infrastructure.domain.entity.InMemoryIdiomaRepositoryEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface InMemoryIdiomaEntityMapper extends InMemoryEntityMapper<Idioma, InMemoryIdiomaRepositoryEntity> {

    InMemoryIdiomaEntityMapper INSTANCE = Mappers.getMapper(InMemoryIdiomaEntityMapper.class);

    @Override
    @Mapping(source = "idIdioma", target = "idIdioma")
    Idioma toDomainEntity(InMemoryIdiomaRepositoryEntity inMemoryIdiomaRepositoryEntity);

}
