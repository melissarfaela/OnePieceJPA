package com.centroweg.OnePieceJpa.repository;

import com.centroweg.OnePieceJpa.model.DevilFruits;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DevilFruitsRepository extends JpaRepository<DevilFruits, Long> {
}
