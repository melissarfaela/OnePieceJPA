package com.centroweg.OnePieceJpa.dto.reward;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PositiveOrZero;

public record RewardRequestDto(
        @NotBlank(message = "You need to type a name.")
        String nameWanted,
        @PositiveOrZero(message = "The reward has to be positive.")
        Double value,
        @NotBlank(message = "You need to type a reason.")
        String reason
) {
}
