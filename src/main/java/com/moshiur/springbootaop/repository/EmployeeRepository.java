package com.moshiur.springbootaop.repository;

import com.moshiur.springbootaop.model.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee,Integer> {
}
