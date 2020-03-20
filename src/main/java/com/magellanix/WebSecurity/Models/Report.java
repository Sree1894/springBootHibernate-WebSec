package com.magellanix.WebSecurity.Models;

import javax.persistence.*;

@Entity
@Table(name = "Report_Table")
public class Report {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String reportName;

    @OneToOne
    @JoinColumn
    @MapsId
    private Scan scan;
}
