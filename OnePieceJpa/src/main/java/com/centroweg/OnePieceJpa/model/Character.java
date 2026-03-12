package com.centroweg.OnePieceJpa.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "personagem")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Character {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String occupation;


    @Column(nullable = false)
    private String crewName;

    public Character(String name, String occupation, String crewName) {
        this.name = name;
        this.occupation = occupation;
        this.crewName = crewName;
    }
}
