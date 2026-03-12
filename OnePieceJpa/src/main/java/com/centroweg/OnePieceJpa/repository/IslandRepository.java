package com.centroweg.OnePieceJpa.repository;

import com.centroweg.OnePieceJpa.model.Island;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IslandRepository extends JpaRepository<Island, Long> {
}
