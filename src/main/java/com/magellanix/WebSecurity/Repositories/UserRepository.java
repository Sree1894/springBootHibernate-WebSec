package com.magellanix.WebSecurity.Repositories;

import com.magellanix.WebSecurity.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
