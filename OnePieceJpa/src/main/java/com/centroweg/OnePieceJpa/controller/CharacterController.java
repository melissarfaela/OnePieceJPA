package com.centroweg.OnePieceJpa.controller;

import com.centroweg.OnePieceJpa.dto.character.CharacterRequestDto;
import com.centroweg.OnePieceJpa.dto.character.CharacterResponseDto;
import com.centroweg.OnePieceJpa.service.CharacterService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/one_piece/character")
@RequiredArgsConstructor
public class CharacterController {
    private final CharacterService characterService;
    @PostMapping
    public CharacterResponseDto registerCharacter(@Valid @RequestBody CharacterRequestDto characterRequestDto){
        return characterService.registerCharacter(characterRequestDto);
    }
    @GetMapping()
    public List<CharacterResponseDto> listAllCharacters(){
        return characterService.listAllCharacter();
    }

}
