package com.developer.empmanagement.service;

import com.developer.empmanagement.entity.Employee;

import java.util.List;
import java.util.Optional;

public interface EmpService {
    List<Employee> findAllEmployee();
    Optional<Employee> findEmployeeById(Long id);

    Employee saveEmployee(Employee employee);
    Employee updateEmployee(Employee employee);

    String deleteEmployee(Long id);


}
