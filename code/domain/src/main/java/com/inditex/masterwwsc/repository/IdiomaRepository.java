package com.inditex.masterwwsc.repository;

import com.inditex.masterwwsc.entities.Idioma;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;

@Repository
public interface IdiomaRepository extends JpaRepository<Idioma, BigInteger> {
}
