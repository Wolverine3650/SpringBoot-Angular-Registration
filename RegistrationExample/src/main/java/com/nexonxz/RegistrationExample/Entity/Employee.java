package com.nexonxz.RegistrationExample.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "employee")
public class Employee {

    @Id
    @Column(name="employee_id",length = 45)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int employeeId;

    @Column(name="employee_name",length = 255)
    private String employeeName;

    @Column(name="employee_address",length = 506)
    private String employeeAddress;

    @Column(name="employee_contact",length = 20)
    private long mobile;

    public Employee(int employeeId, String employeeName, String employeeAddress, long mobile) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeAddress = employeeAddress;
        this.mobile = mobile;
    }

    public Employee() {
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeAddress() {
        return employeeAddress;
    }

    public void setEmployeeAddress(String employeeAddress) {
        this.employeeAddress = employeeAddress;
    }

    public long getMobile() {
        return mobile;
    }

    public void setMobile(long mobile) {
        this.mobile = mobile;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", employeeName='" + employeeName + '\'' +
                ", employeeAddress='" + employeeAddress + '\'' +
                ", mobile=" + mobile +
                '}';
    }
}
