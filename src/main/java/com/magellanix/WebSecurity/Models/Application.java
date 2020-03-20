package com.magellanix.WebSecurity.Models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.*;
import java.util.Set;

@AllArgsConstructor
@Entity
@Table(name = "Application_Table")
public class Application {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "name")
    private String applicationName;

    @Column(name = "Created_Date")
    private String createdDate;

    @Column(name = "Url")
    private String applicationUrl;

    @Column(name = "Low_Vulnerabilities")
    private String lowVulnerabilities;

    @Column(name = "Medium_Vulnerabilities")
    private String mediumVulnerabilities;

    @Column(name = "High_Vulnerabilities")
    private String highVulnerabilities;


    @ManyToOne(fetch = FetchType.LAZY,optional = false)
    @JoinColumn(name = "user_id",nullable = false)
    @JsonIgnore
    private User user;


    @OneToMany(mappedBy = "application",cascade = CascadeType.ALL)
    private Set<Scan> applicationScanDetails;

    public Application() {
    }

    public Long getId() {
        return id;
    }

    public Application setId(Long id) {
        this.id = id;
        return this;
    }

    public String getApplicationName() {
        return applicationName;
    }

    public Application setApplicationName(String applicationName) {
        this.applicationName = applicationName;
        return this;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public Application setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
        return this;
    }

    public String getApplicationUrl() {
        return applicationUrl;
    }

    public Application setApplicationUrl(String applicationUrl) {
        this.applicationUrl = applicationUrl;
        return this;
    }

    public String getLowVulnerabilities() {
        return lowVulnerabilities;
    }

    public Application setLowVulnerabilities(String lowVulnerabilities) {
        this.lowVulnerabilities = lowVulnerabilities;
        return this;
    }

    public String getMediumVulnerabilities() {
        return mediumVulnerabilities;
    }

    public Application setMediumVulnerabilities(String mediumVulnerabilities) {
        this.mediumVulnerabilities = mediumVulnerabilities;
        return this;
    }

    public String getHighVulnerabilities() {
        return highVulnerabilities;
    }

    public Application setHighVulnerabilities(String highVulnerabilities) {
        this.highVulnerabilities = highVulnerabilities;
        return this;
    }

    public User getUser() {
        return user;
    }

    public Application setUser(User user) {
        this.user = user;
        return this;
    }

    public Set<Scan> getApplicationScanDetails() {
        return applicationScanDetails;
    }

    public Application setApplicationScanDetails(Set<Scan> applicationScanDetails) {
        this.applicationScanDetails = applicationScanDetails;
        return this;
    }
}
