package com.centroweg.OnePieceJpa.service;

import com.centroweg.OnePieceJpa.dto.character.CharacterRequestDto;
import com.centroweg.OnePieceJpa.dto.character.CharacterResponseDto;
import com.centroweg.OnePieceJpa.mapper.CharacterMapper;
import com.centroweg.OnePieceJpa.model.CharacterOnePiece;
import com.centroweg.OnePieceJpa.repository.CharacterRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CharacterService {
    private final CharacterRepository characterRepository;
    private final CharacterMapper characterMapper;
    public CharacterResponseDto registerCharacter(CharacterRequestDto characterRequestDto){
        CharacterOnePiece character = characterMapper.forEntity(characterRequestDto);
        character = characterRepository.save(character);
        return characterMapper.forResponseDto(character);
    }
    public List<CharacterResponseDto> listAllCharacter(){
        List<CharacterOnePiece> characters = characterRepository.findAll();
        return characterMapper.forListResponseDto(characters);
    }
}
