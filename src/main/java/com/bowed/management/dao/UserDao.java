package com.bowed.management.dao;

import com.bowed.management.entity.User;

public interface UserDao {
    User findByUserName(String userName);
    void save(User user);

}
