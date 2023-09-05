package com.cashflowpro.cashflowpro.repository;

import com.cashflowpro.cashflowpro.modele.Compte_bancaire;
import com.cashflowpro.cashflowpro.modele.VisaMastercard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VisaMastercardRepository extends JpaRepository<VisaMastercard, Long> {
}
