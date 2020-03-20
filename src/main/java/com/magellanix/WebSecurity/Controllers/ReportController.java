package com.magellanix.WebSecurity.Controllers;

import com.magellanix.WebSecurity.Models.Report;
import com.magellanix.WebSecurity.Services.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rest/api")
public class ReportController {

    @Autowired
    ReportService reportService;

    @GetMapping("/report")
    public List<Report> getAllReports(){
        return reportService.findAll();
    }

    @PostMapping("/report")
    public Report createReport(@RequestBody Report report){
        return reportService.createReport(report);
    }

    @GetMapping("/report/{id}")
    public Report getReportById(@PathVariable String id){

        return reportService.findById(id);


    }
}
