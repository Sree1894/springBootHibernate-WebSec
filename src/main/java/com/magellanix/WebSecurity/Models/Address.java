package com.magellanix.WebSecurity.Models;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "address_Table")
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Address extends Audit {

    @Id
    @Column(name="ADDRESS_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "DOOR_NO")
    private String doorNo;
    @Column(name = "STREET_NAME")
    private String streetName;
    @Column(name = "AREA_NAME")
    private String areaName;
    @Column(name = "CITY")
    private String city;



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDoorNo() {
        return doorNo;
    }

    public void setDoorNo(String doorNo) {
        this.doorNo = doorNo;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

}
