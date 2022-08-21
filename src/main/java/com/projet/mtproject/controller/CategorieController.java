package com.projet.mtproject.controller;

import com.projet.mtproject.exchange.ProduitRequest;
import com.projet.mtproject.model.Categorie;
import com.projet.mtproject.model.Produit;
import com.projet.mtproject.model.ProduitFini;
import com.projet.mtproject.model.Recette;
import com.projet.mtproject.service.CategorieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

@Controller
@RequestMapping("/categorie")
@CrossOrigin
public class CategorieController {
    @Autowired
    private CategorieService categorieService;

    @PostMapping("/add-categorie")
    public @ResponseBody Boolean save(@RequestBody  Categorie categorie){
        return categorieService.save(categorie);
    }

    @GetMapping("/liste-client")
    public @ResponseBody
    List<Categorie>liste(){
        List<Categorie> lPd=  categorieService.liste();
       for (int i=0; i<lPd.size(); i++){
            List<Produit> list = new ArrayList<>() ;
            System.out.println(lPd.get(i).getProduit().size());
            lPd.get(i).getProduit();
            System.out.println("+++++++++"+lPd.get(i).getProduit().size());
           for (int j=0;j<lPd.get(i).getProduit().size();j++){

               Produit p = new Produit();

               p.setId(lPd.get(i).getProduit().get(j).getId());
               p.setLibelle(lPd.get(i).getProduit().get(j).getLibelle());
               p.setPoids(lPd.get(i).getProduit().get(j).getPoids());
               p.setPrix(lPd.get(i).getProduit().get(j).getPrix());
               p.setQuantite(lPd.get(i).getProduit().get(j).getQuantite());
               p.setReference(lPd.get(i).getProduit().get(j).getReference());
               String decodedString;

               decodedString = Base64.getEncoder().encodeToString(lPd.get(i).getProduit().get(i).getImage());
               p.setPhoto(decodedString);

               list.add(p);
           }
           lPd.get(i).setProduit(list);
        }
        return  lPd;
    }
}
