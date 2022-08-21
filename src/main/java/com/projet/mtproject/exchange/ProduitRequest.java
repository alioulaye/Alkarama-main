package com.projet.mtproject.exchange;

import com.projet.mtproject.model.Categorie;
import com.projet.mtproject.model.ProduitFini;
import com.projet.mtproject.model.Recette;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.Lob;
import java.io.Serializable;

public class ProduitRequest implements Serializable {

    private static final long serialVersionUID = 1L;
    private String libelle;

    private Long id;

    private String poids;

    private String reference;

    private Integer quantite;

    private Float prix;

    private String photo;

    private String image;
    private Categorie categorie;

    private Recette recette;
     private ProduitFini produitfini;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ProduitRequest() {
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getPoids() {
        return poids;
    }

    public void setPoids(String poids) {
        this.poids = poids;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public Integer getQuantite() {
        return quantite;
    }

    public void setQuantite(Integer quantite) {
        this.quantite = quantite;
    }

    public Float getPrix() {
        return prix;
    }

    public void setPrix(Float prix) {
        this.prix = prix;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Categorie getCategorie() {
        return categorie;
    }

    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }

    public Recette getRecette() {
        return recette;
    }

    public void setRecette(Recette recette) {
        this.recette = recette;
    }

    public ProduitFini getProduitfini() {
        return produitfini;
    }

    public void setProduitfini(ProduitFini produitfini) {
        this.produitfini = produitfini;
    }
}
