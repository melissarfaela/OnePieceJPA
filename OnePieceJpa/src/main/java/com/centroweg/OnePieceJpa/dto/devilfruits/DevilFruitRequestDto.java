package com.centroweg.OnePieceJpa.dto.devilfruits;

import jakarta.validation.constraints.NotBlank;

public record DevilFruitRequestDto(
        @NotBlank(message = "You need to type a name.")
        String name,
        @NotBlank(message = "You need to type a type.")
        String type,
        @NotBlank(message = "You need to type a power.")
        String power,
        @NotBlank(message = "You need to type a user.")
        String user
) {
}
