package com.magellanix.WebSecurity.Controllers;

import com.magellanix.WebSecurity.Models.Application;
import com.magellanix.WebSecurity.Models.User;
import com.magellanix.WebSecurity.Services.ApplicationService;
import com.magellanix.WebSecurity.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequestMapping("/rest/api")
public class ApplicationController {


    @Autowired
    ApplicationService applicationService;

    @Autowired
    UserService userService;

    @GetMapping("/applications")
    public List<Application> getAllApplications() {
        return applicationService.findAllApplications();
    }

    @GetMapping("/application/{id}")
    public Application getApplicationById(@PathVariable String id){
        return applicationService.findById(id);
    }


    @PostMapping("/application")
    public Application save(@RequestBody Application requestApplication){

        return applicationService.save(requestApplication);
    }


    @PostMapping("/application/{userId}")
    public Application createApplication(@PathVariable String userId,@RequestBody Application requestApplication){

        User user=userService.findById(userId);
        requestApplication.setUser(user);

        return applicationService.save(requestApplication);
    }


    @PutMapping("/application")
    public Application update(@RequestBody Application requestApplication){
        return applicationService.updateAppliation(requestApplication);
    }


    @DeleteMapping("application/{id}")
    public void deleteUser(@PathVariable String id){
        applicationService.deleteApplication(id);
    }
}
