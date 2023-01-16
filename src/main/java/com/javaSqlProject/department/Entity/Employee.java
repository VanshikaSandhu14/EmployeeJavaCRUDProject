package com.javaSqlProject.department.Entity;

import jakarta.persistence.*;

@Entity
@Table
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "emp_name")
    private String name;

    private String department;
    private String salary;
    private String manager_id;

    public Employee() {
    }

    public Employee(String name, String department, String salary, String manager_id) {
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.manager_id = manager_id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getManager_id() {
        return manager_id;
    }

    public void setManager_id(String manager_id) {
        this.manager_id = manager_id;
    }
}
