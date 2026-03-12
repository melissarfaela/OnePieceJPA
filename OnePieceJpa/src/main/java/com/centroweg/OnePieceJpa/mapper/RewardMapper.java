package com.centroweg.OnePieceJpa.mapper;

import com.centroweg.OnePieceJpa.dto.reward.RewardRequestDto;
import com.centroweg.OnePieceJpa.dto.reward.RewardResponseDto;
import com.centroweg.OnePieceJpa.model.Reward;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RewardMapper {

    public Reward forEntity(RewardRequestDto dto){
        return new Reward(
                dto.nameWanted(),
                dto.value(),
                dto.reason()
        );
    }

    public RewardResponseDto forResponseDto(Reward reward){
        return new RewardResponseDto(
                reward.getId(),
                reward.getNameWanted(),
                reward.getValue(),
                reward.getReason()
        );
    }

    public List<RewardResponseDto> forListResponseDto(List<Reward> rewards){
        List<RewardResponseDto> list = new ArrayList<>();
        for (Reward reward : rewards){
            list.add(forResponseDto(reward));
        }

        return list;
    }
}
