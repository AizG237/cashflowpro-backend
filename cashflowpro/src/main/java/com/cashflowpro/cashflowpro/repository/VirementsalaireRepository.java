package com.cashflowpro.cashflowpro.repository;

import com.cashflowpro.cashflowpro.modele.Virementsalaire;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VirementsalaireRepository extends JpaRepository<Virementsalaire, Long> {
}
