package com.cashflowpro.cashflowpro.repository;

import com.cashflowpro.cashflowpro.modele.Adresse;
//import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdresseRepository extends JpaRepository<Adresse, Long> {
}
