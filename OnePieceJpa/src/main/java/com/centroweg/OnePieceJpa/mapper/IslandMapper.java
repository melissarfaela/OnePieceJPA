package com.centroweg.OnePieceJpa.mapper;

import com.centroweg.OnePieceJpa.dto.island.IslandRequestDto;
import com.centroweg.OnePieceJpa.dto.island.IslandResponseDto;
import com.centroweg.OnePieceJpa.model.Island;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class IslandMapper {

    public Island forEntity(IslandRequestDto dto){
        return new Island(
                dto.name(),
                dto.sea(),
                dto.climate(),
                dto.description()
        );
    }

    public IslandResponseDto forResponseDto(Island island){
        return new IslandResponseDto(
                island.getId(),
                island.getName(),
                island.getSea(),
                island.getClimate(),
                island.getDescription()
        );
    }

    public List<IslandResponseDto> forListresponseDto(List<Island> islands){
        List<IslandResponseDto> list = new ArrayList<>();
        for (Island island : islands){
            list.add(forResponseDto(island));
        }

        return list;
    }
}
