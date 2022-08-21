package com.projet.mtproject.DAO;

import com.projet.mtproject.model.TypeCommande;
import com.projet.mtproject.model.TypePaiement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TypePaiementRepository extends JpaRepository<TypePaiement, Long> {
}
