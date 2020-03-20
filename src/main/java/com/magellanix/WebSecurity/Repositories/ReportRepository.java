package com.magellanix.WebSecurity.Repositories;

import com.magellanix.WebSecurity.Models.Report;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReportRepository  extends JpaRepository<Report,Long> {
}
