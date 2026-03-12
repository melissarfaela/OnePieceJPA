package com.centroweg.OnePieceJpa.controller;

import com.centroweg.OnePieceJpa.dto.reward.RewardRequestDto;
import com.centroweg.OnePieceJpa.dto.reward.RewardResponseDto;
import com.centroweg.OnePieceJpa.service.RewardService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/one_piece/reward")
@RequiredArgsConstructor
public class RewardController {
    private final RewardService rewardService;

    @PostMapping
    public RewardResponseDto registerReward(@RequestBody RewardRequestDto rewardRequestDto){
        return rewardService.registerReward(rewardRequestDto);
    }
}
