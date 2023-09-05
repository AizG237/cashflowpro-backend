package com.cashflowpro.cashflowpro.repository;

import com.cashflowpro.cashflowpro.modele.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UtilisateurRepository extends JpaRepository <Utilisateur, Long> {
}
