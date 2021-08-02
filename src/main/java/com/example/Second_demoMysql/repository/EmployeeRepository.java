package com.example.Second_demoMysql.repository;

import com.example.Second_demoMysql.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
