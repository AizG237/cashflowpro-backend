package com.cashflowpro.cashflowpro.repository;

import com.cashflowpro.cashflowpro.modele.PlanInvest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PlanInvestRepository extends JpaRepository<PlanInvest, Long> {
    Optional<PlanInvest> findByNominvest(String nominvest);
}
