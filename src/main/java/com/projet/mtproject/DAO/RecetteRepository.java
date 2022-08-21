package com.projet.mtproject.DAO;

import com.projet.mtproject.model.Recette;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecetteRepository extends JpaRepository<Recette, Long> {
}
