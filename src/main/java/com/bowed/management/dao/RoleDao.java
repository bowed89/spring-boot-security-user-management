package com.bowed.management.dao;

import com.bowed.management.entity.Role;

public interface RoleDao {
    public Role findRoleByName(String theRoleName);
    void save(Role role);
}
