package com.td.prog3.service;

import com.td.prog3.model.Player;
import com.td.prog3.repository.PlayerRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.awt.print.Pageable;
import java.util.List;

@Service
@AllArgsConstructor
public class PlayerService {
    private PlayerRepository playerRepository;

    public List<Player> getPlayers(Long page, Long pageSize){
        if(page != null && pageSize != null){
            Pageable pageable = (Pageable) PageRequest.of(Math.toIntExact(page - 1), Math.toIntExact(pageSize));
            return playerRepository.findAll((Sort) pageable).stream().toList();
        }
        else{
            return playerRepository.findAll();
        }
    }

    public List<Player> createPlayer(List<Player> toCreate){
        return playerRepository.saveAll(toCreate);
    }

    public List<Player> updatePlayer(List<Player> toUpdate){
        return playerRepository.saveAll(toUpdate);
    }
}