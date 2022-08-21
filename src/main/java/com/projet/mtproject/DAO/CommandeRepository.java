package com.projet.mtproject.DAO;

import com.projet.mtproject.model.Commande;
import com.projet.mtproject.model.Produit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommandeRepository extends JpaRepository<Commande, Long> {
}
