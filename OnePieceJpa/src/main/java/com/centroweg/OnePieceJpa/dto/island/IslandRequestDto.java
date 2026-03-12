package com.centroweg.OnePieceJpa.dto.island;

import jakarta.validation.constraints.NotBlank;

public record IslandRequestDto(
        @NotBlank(message = "You need to type a name.")
        String name,
        @NotBlank(message = "You need to type a sea.")
        String sea,
        @NotBlank(message = "You need to type a climate.")
        String climate,
        @NotBlank(message = "You need to type a description.")
        String description
) {
}
