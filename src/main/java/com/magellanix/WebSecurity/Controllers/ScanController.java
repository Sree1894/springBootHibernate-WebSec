package com.magellanix.WebSecurity.Controllers;

import com.magellanix.WebSecurity.Models.Application;
import com.magellanix.WebSecurity.Models.Scan;
import com.magellanix.WebSecurity.Services.ApplicationService;
import com.magellanix.WebSecurity.Services.ScanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rest/api")
public class ScanController {

    @Autowired
    ScanService scanService;

    @Autowired
    ApplicationService applicationService;

    @GetMapping("/scan")
    public List<Scan> getAllScan(){
        return scanService.findAll();
    }

    @GetMapping("/scan/{id}")
    public Scan getScanById(@PathVariable String id){
        return scanService.findById(id);
    }

    @PostMapping("/scan/{id}")
    public Scan createScan(@PathVariable String id,@RequestBody Scan scan){

        Application application=applicationService.findById(id);
        scan.setApplication(application);
        return scanService.createScan(scan);
    }
}
