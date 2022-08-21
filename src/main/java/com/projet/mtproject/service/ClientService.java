package com.projet.mtproject.service;

import com.projet.mtproject.DAO.ClientRepository;
import com.projet.mtproject.model.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;
    public Client save(Client client){

            return  clientRepository.save(client);

    }

    public List<Client> liste(){
        return clientRepository.findAll();
    }
}
