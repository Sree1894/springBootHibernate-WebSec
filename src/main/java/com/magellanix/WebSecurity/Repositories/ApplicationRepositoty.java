package com.magellanix.WebSecurity.Repositories;

import com.magellanix.WebSecurity.Models.Application;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApplicationRepositoty extends JpaRepository<Application,Long> {
}
