package com.td.prog3.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "sponsor")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Sponsor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idSponsor;
    private String name;

    @ManyToMany(mappedBy = "sponsors")
    private List<Team> teams;
}
