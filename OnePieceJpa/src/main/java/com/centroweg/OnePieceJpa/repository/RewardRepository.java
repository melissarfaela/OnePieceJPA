package com.centroweg.OnePieceJpa.repository;

import com.centroweg.OnePieceJpa.model.Reward;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RewardRepository extends JpaRepository<Reward, Long> {
}
