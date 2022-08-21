package com.projet.mtproject.controller;

import com.projet.mtproject.DAO.RecetteRepository;
import com.projet.mtproject.model.Recette;
import com.projet.mtproject.service.RecetteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/recette")
@CrossOrigin(origins = {"http://localhost:4200", "https://localhost:4200"})

public class RecetteController {
    @Autowired
    private RecetteService recetteService;

    @PostMapping("/ajout")
    public @ResponseBody Boolean
    save(@RequestBody Recette recette){
        return recetteService.save(recette);
    }
    @GetMapping("/liste")
    public @ResponseBody
    List<Recette> liste(){
        return recetteService.liste();
    }
}
