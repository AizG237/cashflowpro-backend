package com.cashflowpro.cashflowpro.service;

import com.cashflowpro.cashflowpro.modele.Role;
import com.cashflowpro.cashflowpro.repository.RoleRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class RoleService implements RoleServiceInterface{
    private final RoleRepository roleRepository;
    @Override
    public Role addRole(Role role) {
        return roleRepository.save(role);
    }

    @Override
    public Role getRole(long id) {
        return roleRepository.findById(id).orElseThrow(()-> new RuntimeException("Role inexistant"));
    }

    @Override
    public Role updateRole(long id, Role role) {
        return roleRepository.findById(id).map(r->{
            r.setNom(role.getNom());
            r.setDateattrib(role.getDateattrib());
            return roleRepository.save(r);
        }).orElseThrow(()->new RuntimeException("Erreur modification du Role"));
    }
}
