package com.centroweg.OnePieceJpa.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "reward")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Reward {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String nameWanted;

    @Column(nullable = false)
    private Double value;

    @Column(nullable = false)
    private String reason;

    public Reward(String nameWanted, Double value, String reason) {
        this.nameWanted = nameWanted;
        this.value = value;
        this.reason = reason;
    }
}
