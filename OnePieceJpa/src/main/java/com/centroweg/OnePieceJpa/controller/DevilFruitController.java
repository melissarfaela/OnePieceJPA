package com.centroweg.OnePieceJpa.controller;

import com.centroweg.OnePieceJpa.dto.devilfruits.DevilFruitRequestDto;
import com.centroweg.OnePieceJpa.dto.devilfruits.DevilFruitResponseDto;
import com.centroweg.OnePieceJpa.service.DevilFruitsService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/one_piece/devil_fruits")
@RequiredArgsConstructor
public class DevilFruitController {
    private final DevilFruitsService devilFruitsService;

    @PostMapping
    public DevilFruitResponseDto registerDevilFruits(@RequestBody DevilFruitRequestDto devilFruitRequestDto){
        return devilFruitsService.registerDevilFruits(devilFruitRequestDto);
    }
}
