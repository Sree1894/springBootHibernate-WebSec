package com.magellanix.WebSecurity.Services;

import com.magellanix.WebSecurity.Models.Report;

import java.util.List;

public interface ReportService {
    List<Report> findAll();

    Report createReport(Report report);

    Report findById(String id);
}
