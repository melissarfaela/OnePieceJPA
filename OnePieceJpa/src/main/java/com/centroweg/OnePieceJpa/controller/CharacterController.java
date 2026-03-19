package com.centroweg.OnePieceJpa.controller;

import com.centroweg.OnePieceJpa.dto.character.CharacterRequestDto;
import com.centroweg.OnePieceJpa.dto.character.CharacterResponseDto;
import com.centroweg.OnePieceJpa.model.CharacterOnePiece;
import com.centroweg.OnePieceJpa.service.CharacterService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
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

    @GetMapping("/{id}")
    public CharacterResponseDto searchById(@PathVariable Long id) {
        return characterService.searchById(id);
    }

    @PutMapping("/character/{id}")
    public CharacterResponseDto update(@RequestBody CharacterRequestDto characterRequestDto, @PathVariable Long id) {
        return characterService.updateCharacter(characterRequestDto, id);
    }

    @DeleteMapping("/character/{id}")
    public void delete(@PathVariable Long id) {
        characterService.delete(id);
    }

    @GetMapping("/character/name")
    public CharacterResponseDto searchById(@RequestParam String name) {
        return characterService.searchByName(name);
    }

    @GetMapping("/{id}/exists")
    public boolean characterExists(@PathVariable Long id){
        return characterService.characterExists(id);
    }

    @GetMapping("/search/{id}/{name}")
    public CharacterOnePiece findByIdAndName(
            @PathVariable Long id,
            @PathVariable String name) {

        return characterService.findByIdAndName(id, name);
    }

    @GetMapping("/search/{name}/{email}")
    public CharacterOnePiece findByNameAndEmail(
            @PathVariable String name,
            @PathVariable String email) {

        return characterService.findByNameAndEmail(name, email);
    }

    @GetMapping("/list/{ids}")
    public List<CharacterOnePiece> findByIds(@PathVariable String ids) {

        List<Long> idList = Arrays.stream(ids.split(","))
                .map(Long::parseLong)
                .toList();

        return characterService.findByIds(idList);
    }
}
