package com.centroweg.OnePieceJpa.service;

import com.centroweg.OnePieceJpa.dto.reward.RewardRequestDto;
import com.centroweg.OnePieceJpa.dto.reward.RewardResponseDto;
import com.centroweg.OnePieceJpa.mapper.RewardMapper;
import com.centroweg.OnePieceJpa.model.Reward;
import com.centroweg.OnePieceJpa.repository.RewardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RewardService {
    private final RewardRepository rewardRepository;
    private final RewardMapper rewardMapper;

    public RewardResponseDto registerReward(RewardRequestDto rewardRequestDto){
        Reward reward = rewardMapper.forEntity(rewardRequestDto);
        reward = rewardRepository.save(reward);
        return rewardMapper.forResponseDto(reward);
    }

}
