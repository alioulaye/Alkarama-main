package com.projet.mtproject.DAO;

import com.projet.mtproject.model.Facture;
import com.projet.mtproject.model.Produit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FactureRepository extends JpaRepository<Facture, Long> {
}
