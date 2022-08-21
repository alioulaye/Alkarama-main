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
@Table(name = "pointretrait")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class PointRetrait implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "lieu")
    private String lieu;

    @OneToMany(mappedBy = "pointRetrait")
    @JsonIgnoreProperties(value = "lignescommandes", allowSetters = true)
    private List<Commande> commande;

}
