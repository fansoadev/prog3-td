package com.td.prog3.controller.response.create;

import com.td.prog3.model.Team;
import lombok.*;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class CreatePlay {
    private LocalDateTime dateTime;
    private String stadium;
    private Team teamA;
    private Team teamB;
}