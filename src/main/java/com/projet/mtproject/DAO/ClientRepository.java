package com.projet.mtproject.DAO;

import com.projet.mtproject.model.Client;
import com.projet.mtproject.model.Produit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
