package com.tarifas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tarifas.model.Precio;

@Repository
public interface PreciosRepository extends JpaRepository<Precio, Long> {

}
