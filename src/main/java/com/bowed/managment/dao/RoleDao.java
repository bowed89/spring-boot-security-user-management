package com.bowed.managment.dao;

import com.bowed.managment.entity.Role;

public interface RoleDao {
    public Role findRoleByName(String theRoleName);
    void save(Role role);
}
