package com.centroweg.OnePieceJpa.controller;

import com.centroweg.OnePieceJpa.dto.character.CharacterResponseDto;
import com.centroweg.OnePieceJpa.dto.island.IslandRequestDto;
import com.centroweg.OnePieceJpa.dto.island.IslandResponseDto;
import com.centroweg.OnePieceJpa.service.IslandService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/one_piece/island")
@RequiredArgsConstructor
public class IslandController {
    private final IslandService islandService;
    @PostMapping
    public IslandResponseDto registerIsland(@RequestBody IslandRequestDto islandRequestDto){
        return islandService.registerIsland(islandRequestDto);
    }

    @GetMapping
    public List<IslandResponseDto> listAllIslands(){
        return islandService.listAllIslands();
    }

    @GetMapping("/{id}")
    public IslandResponseDto searchById(@PathVariable Long id) {
        return islandService.searchById(id);
    }
}
