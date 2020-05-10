package com.moshiur.springbootaop.controller;

import com.moshiur.springbootaop.model.Employee;
import com.moshiur.springbootaop.service.EmployeeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;


    @GetMapping("/employees")
    private List<Employee> getEmployees(){
        return employeeService.getEmployees();
    }

    @GetMapping("/employees/{empId}")
    private Employee getEmployeeById(@PathVariable("empId") int empId){
        return employeeService.getEmployeeById(empId);
    }

    @PostMapping("/employees")
    private Employee insertEmployee(@RequestBody Employee employee){
        employeeService.saveEmployee(employee);
        return employee ;
    }

    @PutMapping("/employees")
    private Employee updateEmployee(@RequestBody Employee employee){
        employeeService.updateEmployee(employee);
        return employee;
    }

    @DeleteMapping("/employees/{empId}")
    private void deleteEmployee(@PathVariable("empId") int empId){
        employeeService.deleteEmployee(empId);
    }
}
