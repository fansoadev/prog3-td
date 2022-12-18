package com.td.prog3.service;

import com.td.prog3.model.Play;
import com.td.prog3.repository.PlayRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class PlayService {
    private PlayRepository playRepository;

    public List<Play> getPlay(){
        return playRepository.findAll();
    }

    public List<Play> createPlay(List<Play> toCreate){
        return playRepository.saveAll(toCreate);
    }

    public List<Play> updatePlay(List<Play> toUpdate){
        return playRepository.saveAll(toUpdate);
    }
}