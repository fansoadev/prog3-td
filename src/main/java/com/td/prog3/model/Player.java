package com.td.prog3.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "player")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPlayer;
    private String name;
    private Long number;

    @ManyToOne
    @JoinColumn(name = "team_id", nullable = false)
    private Team team;
}
