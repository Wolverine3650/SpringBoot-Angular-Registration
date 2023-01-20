package com.nexonxz.RegistrationExample.Service.impl;

import com.nexonxz.RegistrationExample.Dto.EmployeeDTO;
import com.nexonxz.RegistrationExample.Entity.Employee;
import com.nexonxz.RegistrationExample.Repo.EmployeeRepo;
import com.nexonxz.RegistrationExample.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeImpl implements EmployeeService {

    @Autowired
    private EmployeeRepo employeeRepo;
    @Override
    public String addEmployee(EmployeeDTO employeeDTO) {

        Employee employee = new Employee(
                employeeDTO.getEmployeeId(),
          employeeDTO.getEmployeeName(),
          employeeDTO.getEmployeeAddress(),
          employeeDTO.getMobile()
        );

        employeeRepo.save(employee);

        return employee.getEmployeeName() ;
    }
}
