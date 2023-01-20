package com.nexonxz.RegistrationExample.Dto;

public class EmployeeDTO {

    private int employee_id;
    private String employee_name;
    private String employeeAddress;
    private long mobile;

    public EmployeeDTO(int employee_id, String employee_name, String employeeAddress, long mobile) {
        this.employee_id = employee_id;
        this.employee_name = employee_name;
        this.employeeAddress = employeeAddress;
        this.mobile = mobile;
    }

    public EmployeeDTO() {

    }

    public int getEmployeeId() {
        return employee_id;
    }

    public void setEmployeeId(int employee_id) {
        this.employee_id = employee_id;
    }

    public String getEmployeeName() {
        return employee_name;
    }

    public void setEmployeeName(String employee_name) {
        this.employee_name = employee_name;
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
        return "EmployeeDTO{" +
                "employeeId=" + employee_id +
                ", employeeName='" + employee_name + '\'' +
                ", employeeAddress='" + employeeAddress + '\'' +
                ", mobile=" + mobile +
                '}';
    }
}
