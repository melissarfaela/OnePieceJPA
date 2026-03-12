package com.centroweg.OnePieceJpa.dto.reward;

public record RewardResponseDto(
        Long id,
        String nameWanted,
        Double value,
        String reason
) {
}
