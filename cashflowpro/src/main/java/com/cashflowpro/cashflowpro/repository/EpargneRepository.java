package com.cashflowpro.cashflowpro.repository;

import com.cashflowpro.cashflowpro.modele.Epargne;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EpargneRepository extends JpaRepository<Epargne, Long> {
}
