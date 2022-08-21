package com.projet.mtproject.DAO;

import com.projet.mtproject.model.EtatCommande;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EtatCommandeRepository extends JpaRepository<EtatCommande, Long> {
}
