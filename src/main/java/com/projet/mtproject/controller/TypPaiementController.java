package com.projet.mtproject.controller;

import com.projet.mtproject.model.TypePaiement;
import com.projet.mtproject.service.TypePaiementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/type-paiement")
@CrossOrigin
public class TypPaiementController {

    @Autowired
    private TypePaiementService typePaiementService;

    @PostMapping("/ajout")
    public @ResponseBody Boolean save(@RequestBody TypePaiement typePaiement){

        return typePaiementService.save(typePaiement);
    }

    @GetMapping("/liste")
    public @ResponseBody
    List<TypePaiement>liste()
    {
        return typePaiementService.liste();
    }
}
