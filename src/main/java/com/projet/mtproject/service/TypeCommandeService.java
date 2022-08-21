package com.projet.mtproject.service;

import com.projet.mtproject.DAO.TypeCommandeRepository;
import com.projet.mtproject.DAO.TypePaiementRepository;
import com.projet.mtproject.model.TypeCommande;
import com.projet.mtproject.model.TypePaiement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TypeCommandeService {
    @Autowired
    private TypeCommandeRepository typeCommandeRepository;

    public Boolean save(TypeCommande typeCommande){
        if(typeCommande==null){
            return false;
        }else {
            typeCommandeRepository.save(typeCommande);
            return true;
        }
    }

    public List<TypeCommande> liste(){
        return typeCommandeRepository.findAll();
    }

}
