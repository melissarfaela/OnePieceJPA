package com.centroweg.OnePieceJpa.service;

import com.centroweg.OnePieceJpa.dto.ship.ShipRequestDto;
import com.centroweg.OnePieceJpa.dto.ship.ShipResponseDto;
import com.centroweg.OnePieceJpa.mapper.ShipMapper;
import com.centroweg.OnePieceJpa.model.Ship;
import com.centroweg.OnePieceJpa.repository.ShipRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

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

    public List<ShipResponseDto> listAllShips(){
        List<Ship> ships = shipRepository.findAll();
        return shipMapper.forListResponseDto(ships);
    }

    public ShipResponseDto searchById(Long id){
        Ship ship = shipRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("The ship does not exist."));
        return shipMapper.forResponseDto(ship);
    }

    public ShipResponseDto shipUpdate(ShipRequestDto dto, long id){
        Ship ship = shipRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User does not exist"));

        ship.setName(dto.name());
        ship.setCaptain(dto.captain());
        ship.setType(dto.type());
        ship.setCrew(dto.crew());

        return shipMapper.forResponseDto(ship);
    }
}
