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

/**
 * A LigneCommande.
 */
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "ligne_commande")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class LigneCommande implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "date")
    private String date;

    @Column(name = "quantite")
    private Integer quantite;

    @Column(name = "designation")
    private String designation;

    @Column(name = "prixUnitaire")
    private float prixUnitaire;

    @Column(name = "prixTotal")
    private float prixTotal;

    @ManyToOne(fetch = FetchType.EAGER)
    @JsonIgnoreProperties(value = "lignescommandes", allowSetters = true)
    private Commande commande;


}
