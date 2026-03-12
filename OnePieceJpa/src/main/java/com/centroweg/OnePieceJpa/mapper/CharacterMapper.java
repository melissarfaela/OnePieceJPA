package com.centroweg.OnePieceJpa.mapper;

import com.centroweg.OnePieceJpa.dto.character.CharacterRequestDto;
import com.centroweg.OnePieceJpa.dto.character.CharacterResponseDto;
import com.centroweg.OnePieceJpa.model.Character;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CharacterMapper {

    public Character forEntity(CharacterRequestDto dto){
        return new Character(
                dto.name(),
                dto.occupation(),
                dto.reward(),
                dto.crewName()
        );
    }

    public CharacterResponseDto forResponseDto(Character character){
        return new CharacterResponseDto(
                character.getId(),
                character.getName(),
                character.getOccupation(),
                character.getReward(),
                character.getCrewName()
        );
    }

    public List<CharacterResponseDto> forListResponseDto(List<Character> characters){
        List<CharacterResponseDto> list = new ArrayList<>();
        for(Character character : characters){
            list.add(forResponseDto(character));
        }
        return list;
    }

}
