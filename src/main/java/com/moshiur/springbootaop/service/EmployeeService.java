package com.moshiur.springbootaop.service;

import com.moshiur.springbootaop.model.Employee;
import com.moshiur.springbootaop.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository ;

    public List<Employee> getEmployees(){
        ArrayList<Employee> employeeList = new ArrayList<>();
        employeeRepository.findAll().forEach(employee -> employeeList.add(employee));
        return employeeList ;
    }

    public Employee getEmployeeById(int empId){
        return employeeRepository.findById(empId).get();
    }

    public void saveEmployee(Employee employee){
        employeeRepository.save(employee);
    }

    public void updateEmployee(Employee employee){
        employeeRepository.save(employee);
    }

    public void deleteEmployee(int empId){
        employeeRepository.deleteById(empId);
    }

}
