package com.centroweg.OnePieceJpa.controller;

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
}
