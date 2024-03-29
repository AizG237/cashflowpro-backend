package com.cashflowpro.cashflowpro.repository;

import com.cashflowpro.cashflowpro.modele.Compte_bancaire;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CptBancaireRepository extends JpaRepository<Compte_bancaire, Long> {
}
