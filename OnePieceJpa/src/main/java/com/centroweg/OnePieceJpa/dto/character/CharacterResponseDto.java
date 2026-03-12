package com.centroweg.OnePieceJpa.dto.character;

public record CharacterResponseDto(
        Long id,
        String name,
        String occupation,
        String crewName
) {
}
