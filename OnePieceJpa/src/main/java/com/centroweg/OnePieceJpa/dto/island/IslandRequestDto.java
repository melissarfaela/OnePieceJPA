package com.centroweg.OnePieceJpa.dto.island;

public record IslandRequestDto(
        String name,
        String sea,
        String climate,
        String description
) {
}
