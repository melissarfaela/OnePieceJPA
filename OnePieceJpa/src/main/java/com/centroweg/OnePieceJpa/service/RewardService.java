package com.centroweg.OnePieceJpa.service;

import com.centroweg.OnePieceJpa.dto.reward.RewardRequestDto;
import com.centroweg.OnePieceJpa.dto.reward.RewardResponseDto;
import com.centroweg.OnePieceJpa.mapper.RewardMapper;
import com.centroweg.OnePieceJpa.model.Reward;
import com.centroweg.OnePieceJpa.repository.RewardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

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

    public List<RewardResponseDto> listAllRewards(){
        List<Reward> rewards = rewardRepository.findAll();
        return rewardMapper.forListResponseDto(rewards);
    }

    public RewardResponseDto searchById(Long id){
        Reward reward = rewardRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("There is no reward."));
        return rewardMapper.forResponseDto(reward);
    }

    public RewardResponseDto updateReward(RewardRequestDto dto, long id){
        Reward reward = rewardRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User does not exist"));

        reward.setNameWanted(dto.nameWanted());
        reward.setValue(dto.value());
        reward.setReason(dto.reason());

        return rewardMapper.forResponseDto(reward);
    }

    public void delete(Long id){
        if (rewardRepository.existsById(id)){
            rewardRepository.deleteById(id);
        }

        throw new RuntimeException("User does not exist");
    }
}
