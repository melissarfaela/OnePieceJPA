package com.centroweg.OnePieceJpa.service;

import com.centroweg.OnePieceJpa.dto.character.CharacterRequestDto;
import com.centroweg.OnePieceJpa.dto.devilfruits.DevilFruitRequestDto;
import com.centroweg.OnePieceJpa.dto.devilfruits.DevilFruitResponseDto;
import com.centroweg.OnePieceJpa.mapper.DevilFruitsMapper;
import com.centroweg.OnePieceJpa.model.CharacterOnePiece;
import com.centroweg.OnePieceJpa.model.DevilFruits;
import com.centroweg.OnePieceJpa.repository.DevilFruitsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

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

    public List<DevilFruitResponseDto> listAllDevilFruits(){
        List<DevilFruits> devilFruits = devilFruitsRepository.findAll();
        return devilFruitsMapper.forListResponseDto(devilFruits);
    }

    public DevilFruitResponseDto searchById(Long id){
        DevilFruits devilFruits = devilFruitsRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("The Fruit does not exist"));
        return devilFruitsMapper.forResponseDto(devilFruits);
    }

    public DevilFruitResponseDto updateDevilFruits(DevilFruitRequestDto dto, long id){
        DevilFruits devilFruits = devilFruitsRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User does not exist"));
        devilFruits.setName(dto.name());
        devilFruits.setType(dto.type());
        devilFruits.setPower(dto.power());
        devilFruits.setUser(dto.user());

        return devilFruitsMapper.forResponseDto(devilFruits);
    }

    public void delete(Long id){
        if (devilFruitsRepository.existsById(id)){
            devilFruitsRepository.deleteById(id);
        }

        throw new RuntimeException("User does not exist");
    }
}
