package com.cashflowpro.cashflowpro.repository;

import com.cashflowpro.cashflowpro.modele.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface RoleRepository extends JpaRepository<Role, Long> {
}
