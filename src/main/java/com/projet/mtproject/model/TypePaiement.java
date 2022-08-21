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

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "typepaiement")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class TypePaiement implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "libelleTypePaiement")
    private String libelleTypePaiement;
    @ManyToOne(fetch = FetchType.EAGER)
    @JsonIgnoreProperties(value = "TypePaiement", allowSetters = true)
    private Paiement Paiement;
}
