package com.td.prog3.service;

import com.td.prog3.model.Team;
import com.td.prog3.repository.TeamRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class TeamService {
    private TeamRepository teamRepository;

    public List<Team> getTeam() {
        return teamRepository.findAll();
    }

    public List<Team> createTeam(List<Team> toCreate) {
        return teamRepository.saveAll(toCreate);
    }

}