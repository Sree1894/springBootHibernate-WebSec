package com.magellanix.WebSecurity.Controllers;

import com.magellanix.WebSecurity.Models.Address;
import com.magellanix.WebSecurity.Models.Application;
import com.magellanix.WebSecurity.Models.User;
import com.magellanix.WebSecurity.Repositories.AddressRepo;
import com.magellanix.WebSecurity.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/rest/api")
public class UsersController {

    @Autowired
    UserService userService;

    @Autowired
    AddressRepo addressRepo;

    @GetMapping("/users")
    public List<User> getAllUsers() {
        return userService.findAllUsers();
    }

    @GetMapping("/user/{id}")
    public User getUserById(@PathVariable String id) {
        return userService.findById(id);
    }


    @PostMapping("/user")
    public User save(@RequestBody User requestUser) {
        addressRepo.save(requestUser.getAddress());
        return userService.save(requestUser);
    }

    @PutMapping("/user")
    public User update(@RequestBody User requestUser) {
        return userService.updateUser(requestUser);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteUser(@PathVariable String id) {
        userService.deleteUser(id);
    }

    @GetMapping("/user/adress")
    public List<Address> getAdress(){
        return  addressRepo.findAll();
    }

    @PostMapping("/user/adress")
    public Address getAdress(Address address){

        return  addressRepo.save(address);
    }

}
