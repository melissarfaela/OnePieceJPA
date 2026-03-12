package com.centroweg.OnePieceJpa.mapper;

import com.centroweg.OnePieceJpa.dto.ship.ShipRequestDto;
import com.centroweg.OnePieceJpa.dto.ship.ShipResponseDto;
import com.centroweg.OnePieceJpa.model.Ship;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ShipMapper {

    public Ship forEntity(ShipRequestDto dto){
        return new Ship(
                dto.name(),
                dto.captain(),
                dto.type(),
                dto.crew()
        );
    }

    public ShipResponseDto forResponseDto(Ship ship){
        return new ShipResponseDto(
                ship.getId(),
                ship.getName(),
                ship.getCaptain(),
                ship.getType(),
                ship.getCrew()
        );
    }

    public List<ShipResponseDto> forListResponseDto(List<Ship> ships){
        List<ShipResponseDto> list = new ArrayList<>();
        for (Ship ship : ships){
            list.add(forResponseDto(ship));
        }

        return list;
    }
}
