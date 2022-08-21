package com.projet.mtproject.service;

import com.projet.mtproject.DAO.CommandeRepository;
import com.projet.mtproject.model.Commande;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommandeService {
    @Autowired
    private CommandeRepository commandeRepository;
    public Boolean save(Commande commande){
        if(commande==null){
            return false;
        }else{
            commandeRepository.save(commande);
            return true;
        }
    }

    public List<Commande>liste(){
        return commandeRepository.findAll();
    }
}
