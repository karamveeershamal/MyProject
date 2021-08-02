package com.example.Second_demoMysql.model;

import javax.persistence.*;

@Entity(name = "employee_address")
public class EmployeeAddress {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "employee_address_ID")
    private Long id;

    @Column(name = "address")
    private String address;

    private Long Employee_ID;

    public EmployeeAddress() {
    }

    public Long getEmployee_ID() {
        return Employee_ID;
    }

    public void setEmployee_ID(Long employee_ID) {
        Employee_ID = employee_ID;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
