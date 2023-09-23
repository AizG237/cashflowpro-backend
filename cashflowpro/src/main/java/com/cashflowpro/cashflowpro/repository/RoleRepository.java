
package com.cashflowpro.cashflowpro.repository;

import com.cashflowpro.cashflowpro.modele.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByRoleName(String role);
}

