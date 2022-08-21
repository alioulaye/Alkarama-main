package com.projet.mtproject.controller;

import com.projet.mtproject.exchange.ProduitRequest;
import com.projet.mtproject.model.Categorie;
import com.projet.mtproject.model.Produit;
import com.projet.mtproject.model.ProduitFini;
import com.projet.mtproject.model.Recette;
import com.projet.mtproject.service.ProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

@Controller
@RequestMapping("/produit")
@CrossOrigin
public class ProduitController {
    @Autowired
    private ProduitService produitService;

    @PostMapping("/add")
    public @ResponseBody Boolean save(@RequestBody ProduitRequest produitRequest){

        Base64.Decoder decoder = Base64.getDecoder();
        Produit produit=new Produit();
        Categorie categorie = new Categorie();
        ProduitFini produitFini =new ProduitFini();
        Recette recette =  new Recette();
        recette.setIdR(produitRequest.getRecette().getIdR());
        recette.setLibelle(produitRequest.getRecette().getLibelle());
      produitFini.setIdPF(produitRequest.getProduitfini().getIdPF());
        produitFini.setLibelle(produitRequest.getProduitfini().getLibelle());
        categorie.setIdC(produitRequest.getCategorie().getIdC());
        categorie.setLibelle(produitRequest.getCategorie().getLibelle());
        produit.setCategorie(categorie);
        produit.setProduitFini(produitFini);
        produit.setLibelle(produitRequest.getLibelle());
        produit.setPhoto(produitRequest.getPhoto());
        produit.setPoids(produitRequest.getPoids());
        produit.setPrix(produitRequest.getPrix());
        produit.setReference(produitRequest.getReference());
     System.out.println("+++++++++++"+produitRequest.getCategorie().getLibelle()+ "=>>>" + produitRequest.getCategorie().getLibelle()+ produitRequest.getRecette().getLibelle()+ produitRequest.getProduitfini().getIdPF());
        produit.setQuantite(produitRequest.getQuantite());
        produit.setRecette(produitRequest.getRecette());
        produit.setImage(decoder.decode(produitRequest.getImage()));
        return produitService.save(produit);
    }

    @GetMapping("/liste")
    public @ResponseBody
    List<ProduitRequest> all(){

        List<Produit> lPd =  produitService.all();
         List<ProduitRequest> list = new ArrayList<>() ;

        for (int i = 0; i <lPd.size() ; i++) {

            ProduitRequest p = new ProduitRequest();
            Categorie c = new Categorie();
            c.setIdC(lPd.get(i).getCategorie().getIdC());
            c.setLibelle(lPd.get(i).getCategorie().getLibelle());
            Recette r = new Recette();
            r.setIdR(lPd.get(i).getRecette().getIdR());
            r.setLibelle(lPd.get(i).getRecette().getLibelle());
            ProduitFini pf = new ProduitFini();
            pf.setIdPF(lPd.get(i).getProduitFini().getIdPF());
            pf.setLibelle(lPd.get(i).getProduitFini().getLibelle());
            p.setId(lPd.get(i).getId());
            p.setLibelle(lPd.get(i).getLibelle());
            p.setPoids(lPd.get(i).getPoids());
            p.setPrix(lPd.get(i).getPrix());
            p.setQuantite(lPd.get(i).getQuantite());
            p.setReference(lPd.get(i).getReference());
            p.setCategorie(c);
            p.setRecette(r);
            p.setProduitfini(pf);
            String decodedString;

                decodedString = Base64.getEncoder().encodeToString(lPd.get(i).getImage());
                p.setPhoto(decodedString);

            list.add(p);
            }
        return list;
    }
}
