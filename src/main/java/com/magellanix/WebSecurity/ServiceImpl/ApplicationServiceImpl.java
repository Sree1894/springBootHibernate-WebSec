package com.magellanix.WebSecurity.ServiceImpl;

import com.magellanix.WebSecurity.Models.Application;
import com.magellanix.WebSecurity.Models.User;
import com.magellanix.WebSecurity.Repositories.ApplicationRepositoty;
import com.magellanix.WebSecurity.Services.ApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ApplicationServiceImpl implements ApplicationService {

    @Autowired
    ApplicationRepositoty applicationRepositoty;


    @Override
    public List<Application> findAllApplications() {
        return applicationRepositoty.findAll();
    }

    @Override
    public Application findById(String id) {
        Optional<Application> application = applicationRepositoty.findById(Long.valueOf(id));
        return application.orElse(null);
    }

    @Override
    public Application updateAppliation(Application requestApplication) {
        return applicationRepositoty.save(requestApplication);
    }

    @Override
    public Application save(Application requestApplication) {
        return applicationRepositoty.save(requestApplication);
    }

    @Override
    public void deleteApplication(String id) {
        Optional<Application> application=applicationRepositoty.findById(Long.valueOf(id));
        application.ifPresent(value -> applicationRepositoty.delete(value));
    }


}
