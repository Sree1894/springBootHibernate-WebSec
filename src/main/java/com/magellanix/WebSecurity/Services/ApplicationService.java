package com.magellanix.WebSecurity.Services;

import com.magellanix.WebSecurity.Models.Application;
import com.magellanix.WebSecurity.Models.User;

import java.util.List;

public interface ApplicationService {

    List<Application> findAllApplications();

    Application findById(String id);

    Application updateAppliation(Application requestUser);

    Application save(Application requestApplication);

    void deleteApplication(String id);
}
