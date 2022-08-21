package com.projet.mtproject.DAO;

import com.projet.mtproject.model.PointRetrait;
import com.projet.mtproject.model.Produit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PointRetraitRepository extends JpaRepository<PointRetrait, Long> {
}
