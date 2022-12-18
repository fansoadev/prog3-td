package com.td.prog3.controller.response.create;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class CreatePlayer {
    private String name;
    private Long number;
}