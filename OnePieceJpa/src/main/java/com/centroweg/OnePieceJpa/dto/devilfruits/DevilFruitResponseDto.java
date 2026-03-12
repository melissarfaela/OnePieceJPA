package com.centroweg.OnePieceJpa.dto.devilfruits;

public record DevilFruitResponseDto(
        Long id,
        String name,
        String type,
        String power,
        String user
) {
}
