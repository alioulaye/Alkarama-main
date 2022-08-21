package com.projet.mtproject.controller;

import com.projet.mtproject.model.Client;
import com.projet.mtproject.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/client")
@CrossOrigin
public class ClientController {
    @Autowired
    private ClientService clientService;

    @PostMapping("/add-client")
    public @ResponseBody Client save(@RequestBody Client client){
       clientService.save(client);
       return client;

    }

    @GetMapping("/liste-client")
    public @ResponseBody
    List<Client>all(){
        return clientService.liste();
    }
}
