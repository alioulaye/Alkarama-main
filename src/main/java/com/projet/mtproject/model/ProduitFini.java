package com.projet.mtproject.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;



@Entity
@Table(name = "produitfini")
public class ProduitFini implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPF;

    @Column(name = "libelle")
    private String libelle;

    public ProduitFini() {
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getIdPF() {
        return idPF;
    }

    public void setIdPF(Long idPF) {
        this.idPF = idPF;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public List<Produit> getProduits() {
        return produits;
    }

    public void setProduits(List<Produit> produits) {
        this.produits = produits;
    }

    @OneToMany(mappedBy = "produitFini")

    private List<Produit> produits;

}
