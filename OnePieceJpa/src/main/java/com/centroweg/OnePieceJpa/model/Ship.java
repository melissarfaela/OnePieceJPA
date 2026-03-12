package com.centroweg.OnePieceJpa.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "ship")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Ship {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String captain;

    @Column(nullable = false)
    private String type;

    @Column(nullable = false)
    private String crew;

    public Ship(String name, String captain, String type, String crew) {
        this.name = name;
        this.captain = captain;
        this.type = type;
        this.crew = crew;
    }
}
