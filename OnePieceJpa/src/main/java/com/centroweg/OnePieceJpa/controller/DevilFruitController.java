package com.centroweg.OnePieceJpa.controller;

import com.centroweg.OnePieceJpa.dto.character.CharacterResponseDto;
import com.centroweg.OnePieceJpa.dto.devilfruits.DevilFruitRequestDto;
import com.centroweg.OnePieceJpa.dto.devilfruits.DevilFruitResponseDto;
import com.centroweg.OnePieceJpa.service.DevilFruitsService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/one_piece/devil_fruits")
@RequiredArgsConstructor
public class DevilFruitController {
    private final DevilFruitsService devilFruitsService;

    @PostMapping
    public DevilFruitResponseDto registerDevilFruits(@RequestBody DevilFruitRequestDto devilFruitRequestDto){
        return devilFruitsService.registerDevilFruits(devilFruitRequestDto);
    }

    @GetMapping
    public List<DevilFruitResponseDto> listAllDevilFruits(){
        return devilFruitsService.listAllDevilFruits();
    }

    @GetMapping("/{id}")
    public DevilFruitResponseDto searchById(@PathVariable Long id) {
        return devilFruitsService.searchById(id);
    }


}
