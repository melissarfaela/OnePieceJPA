package com.centroweg.OnePieceJpa.dto.ship;

public record ShipRequestDto(
        String name,
        String captain,
        String type,
        String crew
) {
}
