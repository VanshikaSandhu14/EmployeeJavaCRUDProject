package com.javaSqlProject.department.Controller;

import com.javaSqlProject.department.Entity.Employee;
import com.javaSqlProject.department.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/")
    public Employee saveEmployee( @RequestBody Employee employee){
        return employeeService.saveEmployee(employee);
    }

    @GetMapping("/{id}")
    public Employee findEmployeeById(@PathVariable("id") Long id){
        return employeeService.findEmployeeById(id);
    }

}
