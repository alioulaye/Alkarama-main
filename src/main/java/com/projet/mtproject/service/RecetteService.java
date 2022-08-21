package com.projet.mtproject.service;

import com.projet.mtproject.DAO.RecetteRepository;
import com.projet.mtproject.model.Recette;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecetteService {
    @Autowired
    private RecetteRepository recetteRepository;
    public Boolean save(Recette recette){

        if(recette==null){
            return false;
        }else {
            recetteRepository.save(recette);
            return true;
        }
    }

    public List<Recette>liste(){
        return recetteRepository.findAll();
    }
}

