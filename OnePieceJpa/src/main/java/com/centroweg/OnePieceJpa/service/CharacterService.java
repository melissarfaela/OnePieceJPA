package com.centroweg.OnePieceJpa.service;

import com.centroweg.OnePieceJpa.dto.character.CharacterRequestDto;
import com.centroweg.OnePieceJpa.dto.character.CharacterResponseDto;
import com.centroweg.OnePieceJpa.mapper.CharacterMapper;
import com.centroweg.OnePieceJpa.model.CharacterOnePiece;
import com.centroweg.OnePieceJpa.repository.CharacterRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    public CharacterResponseDto searchById(Long id){
        CharacterOnePiece character = characterRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Character does not exist"));
        return characterMapper.forResponseDto(character);
    }

    public CharacterResponseDto updateCharacter(CharacterRequestDto dto, long id) {
        CharacterOnePiece characterOnePiece = characterRepository.findById(id)
                        .orElseThrow(() -> new RuntimeException("User does not exist"));

        characterOnePiece.setName(dto.name());
        characterOnePiece.setOccupation(dto.occupation());
        characterOnePiece.setCrewName(dto.crewName());

        return characterMapper.forResponseDto(characterOnePiece);
    }

    public void delete(Long id){
        if (characterRepository.existsById(id)){
            characterRepository.deleteById(id);
        }

        throw new RuntimeException("User does not exist");
    }

    public CharacterResponseDto searchByName(String name){
        CharacterOnePiece character = characterRepository.findByName(name)
                .orElseThrow(() -> new RuntimeException("Character does not exist"));
        return characterMapper.forResponseDto(character);
    }

    public boolean characterExists(Long id){
        return characterRepository.existsById(id);
    }

    public CharacterOnePiece findByIdAndName(Long id, String name) {
        return characterRepository.findByIdAndName(id, name)
                .orElseThrow(() -> new RuntimeException("Character not found"));
    }

    public CharacterOnePiece findByNameAndEmail(String name, String email) {
        return characterRepository.findByNameAndEmail(name, email)
                .orElseThrow(() -> new RuntimeException("Character not found"));
    }

    public List<CharacterOnePiece> findByIds(List<Long> ids) {
        return characterRepository.findByIdIn(ids);
    }
}
