package com.inditex.masterwwsc.repository;

import com.inditex.masterwwsc.entities.Actividad;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigInteger;

public interface ActividadRepository extends JpaRepository<Actividad, BigInteger> {
}
