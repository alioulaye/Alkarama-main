package com.projet.mtproject.controller;

import com.projet.mtproject.model.ProduitFini;
import com.projet.mtproject.service.ProduitFiniService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/produit-fini")
@CrossOrigin
public class ProduitFiniController {
    @Autowired
    private ProduitFiniService produitFiniService;

    @PostMapping("/ajout")
    public @ResponseBody
    Boolean save(@RequestBody ProduitFini produitFini){
        return produitFiniService.save(produitFini);
    }

    public List<ProduitFini> list()
    {
        return produitFiniService.all();
    }
}
