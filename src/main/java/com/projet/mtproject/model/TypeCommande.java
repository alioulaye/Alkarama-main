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

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "typecommande")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class TypeCommande implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idType;

    @Column(name = "libelle")
    private String libelle;
    @OneToMany(mappedBy = "typeCommande")
    @JsonIgnoreProperties(value = "lignescommandes", allowSetters = true)
    private List<Commande> commande;

}
