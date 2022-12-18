package com.td.prog3.controller;

import com.td.prog3.model.Team;
import com.td.prog3.service.TeamService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class TeamController {
    private TeamService teamService;

    @GetMapping("/teams")
    public List<Team> getTeam(){
        return teamService.getTeam();
    }
}