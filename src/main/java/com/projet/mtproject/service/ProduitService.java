package com.projet.mtproject.service;

import com.projet.mtproject.DAO.ProduitRepository;
import com.projet.mtproject.model.Produit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProduitService {
    @Autowired
    private ProduitRepository produitRepository;

    public Boolean save(Produit produit){
        if(produit ==null){
            return false;
        }else{
            produitRepository.save(produit);
            return true;
        }
    }

    public List<Produit> all(){
        return produitRepository.findAll();
    }
}
