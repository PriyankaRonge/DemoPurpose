package com.example.demo.controller;


import com.example.demo.entity.Employee;
import com.example.demo.service.EmployeeServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {


    @Autowired
    private EmployeeServiceInterface employeeServiceInterface;
    @PostMapping("/save")
    public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee){
        Employee employeeSaved = employeeServiceInterface.addEmployee(employee);
        return new ResponseEntity<Employee>(employeeSaved,HttpStatus.CREATED);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Employee>> getAllEmployee() {
        List<Employee> listOfAllEmps = employeeServiceInterface.getAllEmployees();
        return new ResponseEntity<List<Employee>>(listOfAllEmps, HttpStatus.OK);
    }

    @GetMapping("/emp/{empid}")
    public ResponseEntity<Employee> getEmpById(@PathVariable("empid") Long empId){
        Employee empRetrieved = employeeServiceInterface.getEmpById(empId);
        return  new ResponseEntity<Employee>( empRetrieved,HttpStatus.OK);
    }

    @DeleteMapping("/delete/{empid}")
    public ResponseEntity<Void> deleteEmpById(@PathVariable("empid") Long empId){
        employeeServiceInterface.deleteEmpById(empId);
        return new ResponseEntity<Void>(HttpStatus.ACCEPTED);
    }

    @PutMapping("/update")
    public ResponseEntity<Employee> updateEmpById(@RequestBody Employee employee){
        Employee employeeSaved = employeeServiceInterface.addEmployee(employee);
        return new ResponseEntity<Employee>(employeeSaved, HttpStatus.CREATED);
    }
}
