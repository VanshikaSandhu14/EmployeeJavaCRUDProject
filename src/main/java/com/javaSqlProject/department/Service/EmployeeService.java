package com.javaSqlProject.department.Service;

import com.javaSqlProject.department.Entity.Employee;
import com.javaSqlProject.department.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    public Employee findEmployeeById(Long employeeId) {
        return employeeRepository.findByEmployeeId(employeeId);
    }
}
