package com.magellanix.WebSecurity.Services;

import com.magellanix.WebSecurity.Models.User;

import java.util.List;

public interface UserService {
    List<User> findAllUsers();

    User findById(String id);

    User save(User requestUser);

    User updateUser(User requestUser);

    void deleteUser(String id);
}
