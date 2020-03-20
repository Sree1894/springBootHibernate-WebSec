package com.magellanix.WebSecurity.ServiceImpl;

import com.magellanix.WebSecurity.Models.Report;
import com.magellanix.WebSecurity.Repositories.ReportRepository;
import com.magellanix.WebSecurity.Repositories.UserRepository;
import com.magellanix.WebSecurity.Services.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class ReportServiceImpl implements ReportService {
    @Autowired
    ReportRepository reportRepository;


    @Override
    public List<Report> findAll() {
        return reportRepository.findAll();
    }

    @Override
    public Report createReport(Report report) {
        return reportRepository.save(report);
    }

    @Override
    public Report findById(String id) {

        Optional<Report> report=  reportRepository.findById(Long.valueOf(id));
        return report.orElse(null);

    }
}
