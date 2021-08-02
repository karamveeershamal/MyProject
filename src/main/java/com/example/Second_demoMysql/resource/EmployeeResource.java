package com.example.Second_demoMysql.resource;

import com.example.Second_demoMysql.model.Employee;
import com.example.Second_demoMysql.model.EmployeeAddress;
import com.example.Second_demoMysql.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.Option;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/rest/employee")
public class EmployeeResource {

    @Autowired
    EmployeeRepository employeeRepository;

    @GetMapping(value = "/all")
    public List<Employee> getAll(){ return employeeRepository.findAll(); }

    @PostMapping(value = "/load")
    public List<Employee> addEmp(@RequestBody Employee employee){
        employeeRepository.save(employee);
        return employeeRepository.findAll();
    }

    @PostMapping(value = "/updateAddress")
    public Employee changeAddress(@RequestParam("Employee_ID") Long id, @RequestParam("Address") String adr){
        Optional<Employee> e = employeeRepository.findById(id);
        Employee employee = e.get();
        employee.setAddress(adr);
        employeeRepository.save(employee);
        return employee;
    }

    @PostMapping(value = "/updateSalary")
    public Employee changeSalary(@RequestParam("Employee_ID") Long id, @RequestParam("Salary") Integer sal){
        Optional<Employee> e = employeeRepository.findById(id);
        Employee employee = e.get();
        employee.setSalary(sal);
        employeeRepository.save(employee);
        return employee;
    }

    @PostMapping(value = "/delete")
    public Employee delete(@RequestParam("Employee_ID") Long id){
        Optional<Employee> e = employeeRepository.findById(id);
        Employee employee = e.get();
        employee.setIs_Active(false);
        employeeRepository.save(employee);
        return employee;
    }

    @PostMapping(value = "/map")
    public List<Employee> addAddress(@RequestBody EmployeeAddress employeeAddress, @RequestParam("Employee_ID") Long id){
        Optional<Employee> e = employeeRepository.findById(id);
        Employee employee = e.get();

        List<EmployeeAddress> ea;
//        if(employee.getEmployeeAddresses() != null) {
            ea = employee.getEmployeeAddresses();
//        }else{
//            ea = new ArrayList<EmployeeAddress>();
//        }
        System.out.print("##");
        System.out.print(ea);
        System.out.print("**");
        ea.add(employeeAddress);
        System.out.print("$$");
        System.out.print(ea);
        System.out.print("&&");


        employee.setEmployeeAddresses(ea);

        return employeeRepository.findAll();
    }
}
