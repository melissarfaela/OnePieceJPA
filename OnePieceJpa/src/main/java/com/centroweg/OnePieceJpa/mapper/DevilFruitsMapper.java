package com.centroweg.OnePieceJpa.mapper;

import com.centroweg.OnePieceJpa.dto.devilfruits.DevilFruitRequestDto;
import com.centroweg.OnePieceJpa.dto.devilfruits.DevilFruitResponseDto;
import com.centroweg.OnePieceJpa.model.DevilFruits;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class DevilFruitsMapper {

    public DevilFruits forEntity(DevilFruitRequestDto dto){
        return new DevilFruits(
                dto.name(),
                dto.type(),
                dto.power(),
                dto.user()
        );
    }

    public DevilFruitResponseDto forResponseDto(DevilFruits devilFruits){
        return new DevilFruitResponseDto(
                devilFruits.getId(),
                devilFruits.getName(),
                devilFruits.getType(),
                devilFruits.getPower(),
                devilFruits.getUser()
        );
    }

    public List<DevilFruitResponseDto> forListResponseDto(List<DevilFruits> fruits){
        List<DevilFruitResponseDto> list = new ArrayList<>();
        for (DevilFruits devilFruits : fruits){
            list.add(forResponseDto(devilFruits));
        }

        return list;
    }

}
