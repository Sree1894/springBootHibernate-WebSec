package com.magellanix.WebSecurity.ServiceImpl;

import com.magellanix.WebSecurity.Models.User;
import com.magellanix.WebSecurity.Repositories.UserRepository;
import com.magellanix.WebSecurity.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;


    @Override
    public List<User> findAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User findById(String id) {
        Optional<User> user=userRepository.findById(Long.valueOf(id));
        return user.orElse(null);
    }

    @Override
    public User save(User requestUser) {
        return userRepository.save(requestUser);
    }

    @Override
    public User updateUser(User requestUser) {
        return userRepository.save(requestUser);
    }

    @Override
    public void deleteUser(String id) {
        Optional<User> user=userRepository.findById(Long.valueOf(id));
        user.ifPresent(value -> userRepository.delete(value));
    }
}
