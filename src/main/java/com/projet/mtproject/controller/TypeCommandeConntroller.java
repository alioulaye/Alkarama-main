package com.projet.mtproject.controller;

import com.projet.mtproject.model.TypeCommande;
import com.projet.mtproject.service.TypeCommandeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/type-commande")
@CrossOrigin
public class TypeCommandeConntroller {

    @Autowired
    private TypeCommandeService typeCommandeService;

    @PostMapping("/ajout")
    public @ResponseBody Boolean  save(@RequestBody  TypeCommande typeCommande){
        return typeCommandeService.save(typeCommande);
    }

    @GetMapping("/liste")
    public @ResponseBody
    List<TypeCommande> liste(){

        return typeCommandeService.liste();
    }


}
