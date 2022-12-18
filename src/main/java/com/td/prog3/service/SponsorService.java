package com.td.prog3.service;

import com.td.prog3.model.Sponsor;
import com.td.prog3.repository.SponsorRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class SponsorService {
    private SponsorRepository sponsorRepository;

    public List<Sponsor> getSponsor(){
        return sponsorRepository.findAll();
    }

    public List<Sponsor> createSponsor(List<Sponsor> toCreate){
        return sponsorRepository.saveAll(toCreate);
    }
}