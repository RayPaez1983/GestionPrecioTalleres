package com.inditex.masterwwsc.infrastructure.repository.reoperation;

import com.inditex.masterwwsc.entities.TipoReoperacion;
import com.inditex.masterwwsc.infrastructure.repository.reoperation.jpa.ReoperationJpaRepository;
import com.inditex.masterwwsc.repository.TipoReoperacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class ReoperationEntityRepository implements TipoReoperacionRepository {
    @Autowired
    private ReoperationJpaRepository reoperationJpaRepository;
    @Override
    public List<TipoReoperacion> findAll() {
        return reoperationJpaRepository.findAll();
    }
}
