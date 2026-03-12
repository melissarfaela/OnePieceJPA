package com.centroweg.OnePieceJpa.repository;

import com.centroweg.OnePieceJpa.model.CharacterOnePiece;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CharacterRepository extends JpaRepository<CharacterOnePiece, Long> {
}
