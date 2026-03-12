package com.centroweg.OnePieceJpa.dto.character;

public record CharacterRequestDto(
        String name,
        String occupation,
        Double reward,
        String crewName
){
}
