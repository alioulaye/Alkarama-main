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
import java.util.List;

/**
 * A Paiement.
 */
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "paiement")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class Paiement implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "date")
    private String date;

    @Column(name = "montant")
    private Float montant;

    @ManyToOne(fetch = FetchType.EAGER)
    @JsonIgnoreProperties(value = "paiements", allowSetters = true)
    private Facture facture;

    @OneToMany(mappedBy = "Paiement")
    @Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
    private List<TypePaiement> TypePaiements ;
}
