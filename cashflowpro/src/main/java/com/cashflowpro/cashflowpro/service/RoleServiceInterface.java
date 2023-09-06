package com.cashflowpro.cashflowpro.service;

import com.cashflowpro.cashflowpro.modele.Role;

public interface RoleServiceInterface {
    // create
    Role addRole(Role role);
    //read
    Role getRole(long id);
    //update
    Role updateRole(long id, Role role);
    //delete
    //String deleteRole(long id);
}
