package com.centroweg.OnePieceJpa.repository;

import com.centroweg.OnePieceJpa.model.Ship;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShipRepository extends JpaRepository<Ship, Long> {
}
