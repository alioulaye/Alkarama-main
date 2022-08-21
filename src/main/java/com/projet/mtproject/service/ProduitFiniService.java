package com.projet.mtproject.service;

import com.projet.mtproject.DAO.ProduitFiniRepository;
import com.projet.mtproject.model.ProduitFini;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProduitFiniService {
    @Autowired
    private ProduitFiniRepository produitFiniRepository;

    public Boolean save(ProduitFini produitFini){
        if(produitFini==null){
            return  false;
        }
        else {
            produitFiniRepository.save(produitFini);
            return true;
        }
    }

    public List<ProduitFini> all(){
        return produitFiniRepository.findAll();
    }
}
