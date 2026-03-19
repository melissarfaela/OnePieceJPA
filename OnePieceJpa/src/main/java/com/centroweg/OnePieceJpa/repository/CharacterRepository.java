package com.centroweg.OnePieceJpa.repository;

import com.centroweg.OnePieceJpa.model.CharacterOnePiece;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CharacterRepository extends JpaRepository<CharacterOnePiece, Long> {

    Optional<CharacterOnePiece> findByName(String name);
    boolean existsById(Long id);

    Optional<CharacterOnePiece> findByIdAndName(long id, String name);

    Optional<CharacterOnePiece> findByNameAndEmail(String name, String email);

    List<CharacterOnePiece> findByIdIn(List<Long> ids);
}
