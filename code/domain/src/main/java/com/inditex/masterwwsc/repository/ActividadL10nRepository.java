package com.inditex.masterwwsc.repository;

import com.inditex.masterwwsc.entities.ActividadL10n;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;

@Repository
public interface ActividadL10nRepository extends JpaRepository<ActividadL10n, BigInteger> {

}
