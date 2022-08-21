package com.projet.mtproject.service;

import com.projet.mtproject.DAO.CategorieRepository;
import com.projet.mtproject.model.Categorie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategorieService {
    @Autowired
    private CategorieRepository categorieRepository;
    public Boolean save(Categorie categorie){

        if(categorie==null){
            return false;
        }else {
            categorieRepository.save(categorie);
            return true;
        }
    }

    public List<Categorie>liste(){
        return categorieRepository.findAll();
    }
}

