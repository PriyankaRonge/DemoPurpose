package com.example.demo.service;

import com.example.demo.entity.Employee;

import java.util.List;

public interface EmployeeServiceInterface {

    public Employee addEmployee(Employee employee);

    public List<Employee> getAllEmployees();

    public Employee getEmpById(Long empid);

    public void deleteEmpById(Long empid);

}
