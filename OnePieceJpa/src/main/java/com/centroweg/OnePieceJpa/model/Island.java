package com.centroweg.OnePieceJpa.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "island")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Island {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String sea;

    @Column(nullable = false)
    private String climate;

    @Column(nullable = false)
    private String description;

    public Island(String name, String sea, String climate, String description) {
        this.name = name;
        this.sea = sea;
        this.climate = climate;
        this.description = description;
    }
}
