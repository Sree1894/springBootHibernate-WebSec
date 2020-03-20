package com.magellanix.WebSecurity.ServiceImpl;

import com.magellanix.WebSecurity.Models.Scan;
import com.magellanix.WebSecurity.Repositories.ScanRepository;
import com.magellanix.WebSecurity.Services.ScanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ScanServiceImpl implements ScanService {
    @Autowired
    ScanRepository scanRepository;


    @Override
    public List<Scan> findAll() {
        return scanRepository.findAll();
    }

    @Override
    public Scan findById(String id) {
        Optional<Scan> scan = scanRepository.findById(Long.valueOf(id));
        return scan.orElse(null);
    }

    @Override
    public Scan createScan(Scan scan) {
        return scanRepository.save(scan);
    }
}
