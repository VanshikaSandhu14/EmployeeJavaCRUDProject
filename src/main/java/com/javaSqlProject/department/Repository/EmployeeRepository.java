package com.javaSqlProject.department.Repository;

import com.javaSqlProject.department.Entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    Employee findByEmployeeId(Long employeeId);

//    Employee getById(Long employeeId);

}
