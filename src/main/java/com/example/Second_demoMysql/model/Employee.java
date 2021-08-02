package com.example.Second_demoMysql.model;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity(name = "Employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column
    private Long Employee_ID;

    @Column
    private String Name;

    @Column
    private String Mobile;

    @Column
    private String Email;

    @Column
    private Integer Salary;

    //date
    @Column
    private Date Date_of_Joining;

    @Column
    private String Degree;

    @Column
    private String Address;

    @Column
    private boolean is_Active;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "Employee_ID", referencedColumnName = "Employee_ID")
    private List<EmployeeAddress> employeeAddresses;


    public Employee() {
    }


    public List<EmployeeAddress> getEmployeeAddresses() {
        return employeeAddresses;
    }

    public void setEmployeeAddresses(List<EmployeeAddress> employeeAddresses) {
        this.employeeAddresses = employeeAddresses;
    }

    public Long getEmployee_ID() {
        return Employee_ID;
    }

    public void setEmployee_ID(Long employee_ID) {
        Employee_ID = employee_ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getMobile() {
        return Mobile;
    }

    public void setMobile(String mobile) {
        Mobile = mobile;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public Integer getSalary() {
        return Salary;
    }

    public void setSalary(Integer salary) {
        Salary = salary;
    }

    public Date getDate_of_Joining() {
        return Date_of_Joining;
    }

    public void setDate_of_Joining(Date date_of_Joining) {
        Date_of_Joining = date_of_Joining;
    }

    public String getDegree() {
        return Degree;
    }

    public void setDegree(String degree) {
        Degree = degree;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public boolean isIs_Active() {
        return is_Active;
    }

    public void setIs_Active(boolean is_Active) {
        this.is_Active = is_Active;
    }
}
