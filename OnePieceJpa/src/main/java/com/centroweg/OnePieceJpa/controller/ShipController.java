package com.centroweg.OnePieceJpa.controller;

import com.centroweg.OnePieceJpa.dto.character.CharacterRequestDto;
import com.centroweg.OnePieceJpa.dto.character.CharacterResponseDto;
import com.centroweg.OnePieceJpa.dto.ship.ShipRequestDto;
import com.centroweg.OnePieceJpa.dto.ship.ShipResponseDto;
import com.centroweg.OnePieceJpa.service.ShipService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/one_piece/ship")
@RequiredArgsConstructor
public class ShipController {
    private final ShipService shipService;

    @PostMapping
    public ShipResponseDto registerShip(@RequestBody ShipRequestDto shipRequestDto){
        return shipService.registerShip(shipRequestDto);
    }

    @GetMapping
    public List<ShipResponseDto> listAllShips(){
        return shipService.listAllShips();
    }

    @GetMapping("/{id}")
    public ShipResponseDto searchById(@PathVariable Long id) {
        return shipService.searchById(id);
    }

    @PutMapping("/ship/{id}")
    public ShipResponseDto update(@RequestBody ShipRequestDto shipRequestDto, @PathVariable Long id) {
        return shipService.shipUpdate(shipRequestDto, id);
    }

    @DeleteMapping("/ship/{id}")
    public void delete(@PathVariable Long id) {
        shipService.delete(id);
    }

}
