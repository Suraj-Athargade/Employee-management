package com.developer.empmanagement.controller;


import com.developer.empmanagement.entity.Employee;
import com.developer.empmanagement.service.EmpService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/emp")
public class Controller {

  private final EmpService empService;

  public Controller(EmpService empService) {
    this.empService = empService;
  }

  @GetMapping
  public List<Employee> findAllEmployee(){
    return empService.findAllEmployee();
  }
  @GetMapping("/{id}")
  public Optional<Employee> findEmployeeById(@PathVariable("id") Long id){
    return empService.findEmployeeById(id);
  }
  @PostMapping("/addEmployee")
  public Employee saveEmployee(@RequestBody Employee employee){
    return empService.saveEmployee(employee);
  }

  @PutMapping("/updateEmployee")
  public Employee updateEmployee(@RequestBody Employee employee){
    return empService.updateEmployee(employee);
  }

  @DeleteMapping("/{id}")
  public void deleteEmployee(@PathVariable("id") Long id){
     empService.deleteEmployee(id);
  }
}
