package com.projet.mtproject.model;
import lombok.*;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.springframework.web.multipart.MultipartFile;

import javax.persistence.*;

import java.io.Serializable;
import java.util.List;

/**
 * A Produit.
 */



@Entity
@Table(name = "produit")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class Produit implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "libelle")
    private String libelle;

    @Column(name = "poids")
    private String poids;

    @Column(name = "reference")
    private String reference;

    @Column(name = "quantite")
    private Integer quantite;

    @Column(name = "prix")
    private Float prix;
    @Column(name = "photo")
    private String photo;

    @Lob
    @Basic(fetch = FetchType.LAZY)
    private byte[] image;


    @Transient
    private MultipartFile files;

    public Produit() {
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public MultipartFile getFiles() {
        return files;
    }

    public void setFiles(MultipartFile files) {
        this.files = files;
    }

    public Categorie getCategorie() {
        return categorie;
    }

    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }

    public ProduitFini getProduitFini() {
        return produitFini;
    }

    public void setProduitFini(ProduitFini produitFini) {
        this.produitFini = produitFini;
    }

    public Recette getRecette() {
        return recette;
    }

    public void setRecette(Recette recette) {
        this.recette = recette;
    }

    public List<Commande> getCommandes() {
        return commandes;
    }

    public void setCommandes(List<Commande> commandes) {
        this.commandes = commandes;
    }

    @ManyToOne(cascade=CascadeType.MERGE)
    @JoinColumn(name="idC")
    @Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
    private Categorie categorie;


    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="idPF")
    private ProduitFini  produitFini;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="idR")
    private Recette recette;

    @OneToMany(mappedBy = "produit")
    private List<Commande> commandes;
}
