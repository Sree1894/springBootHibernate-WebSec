package com.magellanix.WebSecurity.Models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import javax.persistence.*;


@AllArgsConstructor
@Entity
@Table(name = "Scan_Table")
public class Scan {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "Name")
    private String scanName;

    @Column(name = "Status")
    private String status;

    @Column(name = "Updated_Date")
    private String updatedDate;

    @Column(name = "Next_Schedule")
    private String nextSchedule;


    @ManyToOne(fetch = FetchType.LAZY,optional = false)
    @JoinColumn(name = "application_id",referencedColumnName = "id")
    @JsonIgnore
    private Application application;

    @OneToOne(mappedBy = "scan",cascade = CascadeType.ALL)
    private Report report;

    public Scan() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getScanName() {
        return scanName;
    }

    public void setScanName(String scanName) {
        this.scanName = scanName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(String updatedDate) {
        this.updatedDate = updatedDate;
    }

    public String getNextSchedule() {
        return nextSchedule;
    }

    public void setNextSchedule(String nextSchedule) {
        this.nextSchedule = nextSchedule;
    }

    public Application getApplication() {
        return application;
    }

    public void setApplication(Application application) {
        this.application = application;
    }

    public Report getReport() {
        return report;
    }

    public void setReport(Report report) {
        this.report = report;
    }
}
