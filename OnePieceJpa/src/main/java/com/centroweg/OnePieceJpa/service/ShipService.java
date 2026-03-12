package com.centroweg.OnePieceJpa.service;

import com.centroweg.OnePieceJpa.dto.ship.ShipRequestDto;
import com.centroweg.OnePieceJpa.dto.ship.ShipResponseDto;
import com.centroweg.OnePieceJpa.mapper.ShipMapper;
import com.centroweg.OnePieceJpa.model.Ship;
import com.centroweg.OnePieceJpa.repository.ShipRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ShipService {
    private final ShipRepository shipRepository;
    private final ShipMapper shipMapper;

    public ShipResponseDto registerShip(ShipRequestDto shipRequestDto){
        Ship ship = shipMapper.forEntity(shipRequestDto);
        ship = shipRepository.save(ship);
        return shipMapper.forResponseDto(ship);
    }
}
