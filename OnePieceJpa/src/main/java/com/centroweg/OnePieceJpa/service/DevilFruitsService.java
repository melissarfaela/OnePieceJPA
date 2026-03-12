package com.centroweg.OnePieceJpa.service;

import com.centroweg.OnePieceJpa.dto.devilfruits.DevilFruitRequestDto;
import com.centroweg.OnePieceJpa.dto.devilfruits.DevilFruitResponseDto;
import com.centroweg.OnePieceJpa.mapper.DevilFruitsMapper;
import com.centroweg.OnePieceJpa.model.DevilFruits;
import com.centroweg.OnePieceJpa.repository.DevilFruitsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DevilFruitsService {

    private final DevilFruitsRepository devilFruitsRepository;
    private final DevilFruitsMapper devilFruitsMapper;

    public DevilFruitResponseDto registerDevilFruits(DevilFruitRequestDto devilFruitRequestDto){
        DevilFruits devilFruits = devilFruitsMapper.forEntity(devilFruitRequestDto);
        devilFruits = devilFruitsRepository.save(devilFruits);
        return devilFruitsMapper.forResponseDto(devilFruits);
    }
}
