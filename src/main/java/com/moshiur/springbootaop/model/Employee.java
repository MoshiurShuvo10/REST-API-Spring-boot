package com.moshiur.springbootaop.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Employee {

    @Id
    @Column
    private int empId ;

    @Column
    private String firstName;

    @Column
    private String designation;

    public Employee() {}

    public Employee(int empId, String firstName, String designation) {
        this.empId = empId;
        this.firstName = firstName;
        this.designation = designation;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }
}
