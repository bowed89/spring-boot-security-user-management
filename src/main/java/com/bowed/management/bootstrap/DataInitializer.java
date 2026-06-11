package com.bowed.management.bootstrap;

import com.bowed.management.dao.RoleDao;
import com.bowed.management.dao.UserDao;
import com.bowed.management.entity.Role;
import com.bowed.management.entity.User;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DataInitializer implements CommandLineRunner {
    private final UserDao userDao;
    private final RoleDao roleDao;

    public DataInitializer(UserDao userDao, RoleDao roleDao) {
        this.userDao = userDao;
        this.roleDao = roleDao;
    }
    @Override
    public void run(String... args) throws Exception {
        System.out.println("Loading initial data...");

        Role employee = new Role("ROLE_EMPLOYEE");
        Role manager = new Role("ROLE_MANAGER");
        Role admin = new Role("ROLE_ADMIN");

        roleDao.save(employee);
        roleDao.save(manager);
        roleDao.save(admin);

        String password =
                "$2a$04$eFytJDGtjbThXa80FyOOBuFdK2IwjyWefYkMpiBEFlpBwDH.5PM0K";

        User john = new User(
                "john",
                password,
                true,
                List.of(employee)
        );

        User mary = new User(
                "mary",
                password,
                true,
                List.of(employee, manager)
        );

        User susan = new User(
                "susan",
                password,
                true,
                List.of(employee, manager, admin)
        );

        userDao.save(john);
        userDao.save(mary);
        userDao.save(susan);

        System.out.println("Database initialized");
    }
}
