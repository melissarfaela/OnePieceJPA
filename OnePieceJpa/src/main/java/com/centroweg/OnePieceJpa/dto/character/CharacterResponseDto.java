package com.centroweg.OnePieceJpa.dto.character;

public record CharacterResponseDto(
        Long id,
        String name,
        String occupation,
        Double reward,
        String crewName
) {
}
