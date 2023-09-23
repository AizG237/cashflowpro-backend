package com.cashflowpro.cashflowpro.modele;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "role")
@NamedNativeQuery(name="Role.findByRoleName",
        query = "SELECT id, nom_role FROM role WHERE nom_role = :role",
        resultClass = Role.class)
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom_role;

}
