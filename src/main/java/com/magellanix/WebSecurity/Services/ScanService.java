package com.magellanix.WebSecurity.Services;

import com.magellanix.WebSecurity.Models.Scan;

import java.util.List;

public interface ScanService {
    List<Scan> findAll();

    Scan findById(String id);

    Scan createScan(Scan scan);
}
