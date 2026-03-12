package com.centroweg.OnePieceJpa.dto.ship;

public record ShipResponseDto(
        Long id,
        String name,
        String captain,
        String type,
        String crew
) {
}
