package com.projet.mtproject.DAO;

import com.projet.mtproject.model.Produit;
import com.projet.mtproject.model.ProduitFini;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProduitFiniRepository extends JpaRepository<ProduitFini, Long> {
}
