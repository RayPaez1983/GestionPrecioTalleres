package com.inditex.masterwwsc.infrastructure.mapper.inmemory;

import java.util.List;

public interface InMemoryEntityMapper<DOMAIN_ENTITY,INMEMORY_ENTITY> {

    DOMAIN_ENTITY toDomainEntity(INMEMORY_ENTITY inMemoryEntity);
    INMEMORY_ENTITY fromDomainEntity(DOMAIN_ENTITY domainEntity);

    List<DOMAIN_ENTITY> toDomainEntityList(List<INMEMORY_ENTITY> inMemoryEntity);
    List<INMEMORY_ENTITY> fromDomainEntityList (List<DOMAIN_ENTITY> domainEntity);

}
