package com.example.Second_demoMysql.model;

import javax.persistence.*;

@Entity(name = "Department")
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column
    private Long Department_ID;

    @Column(name = "Name")
    private String name;

    @Column(name = "Description_text")
    private String Description_text;

    @Column(name = "is_Active")
    private boolean is_Active;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "Department_ID", referencedColumnName = "Employee_ID")
    private Employee employee;


    public Department() {
    }


    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Long getDepartment_ID() {
        return Department_ID;
    }

    public void setDepartment_ID(Long department_ID) {
        Department_ID = department_ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription_text() {
        return Description_text;
    }

    public void setDescription_text(String description_text) {
        Description_text = description_text;
    }

    public boolean isIs_Active() {
        return is_Active;
    }

    public void setIs_Active(boolean is_Active) {
        this.is_Active = is_Active;
    }
}
