package com.cashflowpro.cashflowpro.repository;

import com.cashflowpro.cashflowpro.modele.Orangemoney;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrangemoneyRepository extends JpaRepository<Orangemoney, Long> {
}
