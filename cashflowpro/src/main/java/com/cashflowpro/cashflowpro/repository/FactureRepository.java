package com.cashflowpro.cashflowpro.repository;

import com.cashflowpro.cashflowpro.modele.Facture;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FactureRepository extends JpaRepository<Facture, Long> {
}
