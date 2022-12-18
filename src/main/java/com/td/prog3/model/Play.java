package com.td.prog3.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "play")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Play {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPlay;

    private LocalDateTime dateTime;

    private String stadium;

    @OneToOne
    @JoinColumn(name = "team_a")
    private Team teamA;

    @OneToOne
    @JoinColumn(name = "team_b")
    private Team teamB;
}
