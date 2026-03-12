package com.centroweg.OnePieceJpa.dto.character;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;

public record CharacterRequestDto(
        @NotBlank(message = "You need to type a name.")
        String name,
        @NotBlank(message = "The occupation cannot be empty.")
        String occupation,
        @NotBlank(message = "You need to type a crew name.")
        String crewName
){
}
