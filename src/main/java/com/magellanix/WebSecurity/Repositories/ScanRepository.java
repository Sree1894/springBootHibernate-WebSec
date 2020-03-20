package com.magellanix.WebSecurity.Repositories;

import com.magellanix.WebSecurity.Models.Scan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ScanRepository  extends JpaRepository<Scan,Long> {
}
