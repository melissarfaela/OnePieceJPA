package com.centroweg.OnePieceJpa.service;

import com.centroweg.OnePieceJpa.dto.devilfruits.DevilFruitRequestDto;
import com.centroweg.OnePieceJpa.dto.island.IslandRequestDto;
import com.centroweg.OnePieceJpa.dto.island.IslandResponseDto;
import com.centroweg.OnePieceJpa.mapper.IslandMapper;
import com.centroweg.OnePieceJpa.model.DevilFruits;
import com.centroweg.OnePieceJpa.model.Island;
import com.centroweg.OnePieceJpa.repository.IslandRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class IslandService {
    private final IslandRepository islandRepository;
    private final IslandMapper islandMapper;

    public IslandResponseDto registerIsland(IslandRequestDto islandRequestDto){
        Island island = islandMapper.forEntity(islandRequestDto);
        island = islandRepository.save(island);
        return islandMapper.forResponseDto(island);
    }

    public List<IslandResponseDto> listAllIslands(){
        List<Island> islands = islandRepository.findAll();
        return islandMapper.forListResponseDto(islands);
    }

    public IslandResponseDto searchById(Long id){
        Island island = islandRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("The island does not exist"));
        return islandMapper.forResponseDto(island);
    }

    public IslandResponseDto islandUpdate(IslandRequestDto dto, long id){
        Island island = islandRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User does not exist"));

        island.setName(dto.name());
        island.setSea(dto.sea());
        island.setClimate(dto.climate());
        island.setDescription(dto.description());

        return islandMapper.forResponseDto(island);
    }
}
