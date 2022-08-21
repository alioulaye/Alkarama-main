package com.projet.mtproject.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;

import java.io.Serializable;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * A Commande.
 */
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "commande")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class Commande implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "date")
    private String date;

    @Column(name = "annule")
    private boolean annule;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="idF", nullable=false)

    private Facture facture;

    @JsonIgnoreProperties("commandes")
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="etat_id")
    private EtatCommande etat;
/*@ManyToOne
    @JoinColumn(name="idR", nullable=false)
    private Recette recette;*/
    @OneToMany(mappedBy = "commande")
    @Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
    private List<LigneCommande> lignescommandes ;


    @ManyToOne(cascade=CascadeType.MERGE)
    @JoinColumn(name="idType")
    @Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
    private TypeCommande typeCommande ;

    @ManyToOne(cascade=CascadeType.MERGE)
    @JoinColumn(name="pointRetraitId")
    @Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
    private PointRetrait pointRetrait;

    @ManyToOne(cascade=CascadeType.MERGE)
    @JsonIgnoreProperties(value = "commandes", allowSetters = true)
    private Client client;



    @ManyToOne(cascade=CascadeType.MERGE)
    @JoinColumn(name="idPrCmd", nullable=false)
    private Produit produit;

}
