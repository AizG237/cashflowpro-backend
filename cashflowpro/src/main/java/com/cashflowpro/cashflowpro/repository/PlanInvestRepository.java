package com.cashflowpro.cashflowpro.repository;

import com.cashflowpro.cashflowpro.modele.PlanInvest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlanInvestRepository extends JpaRepository<PlanInvest, Long> {
}
