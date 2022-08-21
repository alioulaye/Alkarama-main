package com.projet.mtproject.service;

import com.projet.mtproject.DAO.TypePaiementRepository;
import com.projet.mtproject.model.TypePaiement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TypePaiementService {
    @Autowired
    private TypePaiementRepository typePaiementRepository;

    public Boolean save(TypePaiement typePaiement){
        if(typePaiement==null){
            return false;
        }else {
            typePaiementRepository.save(typePaiement);
            return true;
        }
    }

    public List<TypePaiement>liste()
    {
        return typePaiementRepository.findAll();
    }

}
