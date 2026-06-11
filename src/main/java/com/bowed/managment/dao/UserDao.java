package com.bowed.managment.dao;

import com.bowed.managment.entity.User;

public interface UserDao {
    User findByUserName(String userName);
    void save(User user);

}
