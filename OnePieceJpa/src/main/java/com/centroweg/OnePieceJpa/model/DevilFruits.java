package com.centroweg.OnePieceJpa.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "devil_fruit")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class DevilFruits {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String type;

    @Column(nullable = false)
    private String power;

    @Column(nullable = false)
    private String user;

    public DevilFruits(String name, String type, String power, String user) {
        this.name = name;
        this.type = type;
        this.power = power;
        this.user = user;
    }
}
