package com.centroweg.OnePieceJpa.dto.reward;

public record RewardRequestDto(
        String nameWanted,
        Double value,
        String reason
) {
}
