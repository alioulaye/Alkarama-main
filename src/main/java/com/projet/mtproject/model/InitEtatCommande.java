package com.projet.mtproject.model;


import com.projet.mtproject.DAO.EtatCommandeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

import javax.annotation.PostConstruct;

@Component
public class InitEtatCommande {

    @Autowired
    private final EtatCommandeRepository etatCommandeRepository;

    public InitEtatCommande(EtatCommandeRepository etatCommandeRepository) {
        this.etatCommandeRepository = etatCommandeRepository;
    }

    @PostConstruct
    private void init(){
        etatCommandeRepository.save(new EtatCommande((long) 1, null,"Expresse"));
        etatCommandeRepository.save(new EtatCommande((long) 2,null,"Normal"));
        etatCommandeRepository.save(new EtatCommande((long) 3,null,"Calendrie"));
    }
}
