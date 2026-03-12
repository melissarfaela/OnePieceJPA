package com.centroweg.OnePieceJpa.mapper;

import com.centroweg.OnePieceJpa.dto.character.CharacterRequestDto;
import com.centroweg.OnePieceJpa.dto.character.CharacterResponseDto;
import com.centroweg.OnePieceJpa.model.CharacterOnePiece;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CharacterMapper {

    public CharacterOnePiece forEntity(CharacterRequestDto dto){
        return new CharacterOnePiece(
                dto.name(),
                dto.occupation(),
                dto.crewName()
        );
    }

    public CharacterResponseDto forResponseDto(CharacterOnePiece character){
        return new CharacterResponseDto(
                character.getId(),
                character.getName(),
                character.getOccupation(),
                character.getCrewName()
        );
    }

    public List<CharacterResponseDto> forListResponseDto(List<CharacterOnePiece> characters){
        List<CharacterResponseDto> list = new ArrayList<>();
        for(CharacterOnePiece character : characters){
            list.add(forResponseDto(character));
        }
        return list;
    }

}
