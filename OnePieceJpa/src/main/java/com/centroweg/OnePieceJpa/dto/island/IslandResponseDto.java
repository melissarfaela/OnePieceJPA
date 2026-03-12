package com.centroweg.OnePieceJpa.dto.island;

public record IslandResponseDto(
        Long id,
        String name,
        String sea,
        String climate,
        String description
) {
}
