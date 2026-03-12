package com.centroweg.OnePieceJpa.dto.ship;

import jakarta.validation.constraints.NotBlank;

public record ShipRequestDto(
        @NotBlank(message = "You need to type a name.")
        String name,
        @NotBlank(message = "You need to type a captain.")
        String captain,
        @NotBlank(message = "You need to type a type.")
        String type,
        @NotBlank(message = "You need to type a crew.")
        String crew
) {
}
