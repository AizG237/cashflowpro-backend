package com.cashflowpro.cashflowpro.repository;

import com.cashflowpro.cashflowpro.modele.Mtnmomo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MtnmomoRepository extends JpaRepository<Mtnmomo, Long> {
}
