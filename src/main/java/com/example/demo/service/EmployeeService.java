package com.example.demo.service;

import com.example.demo.custom.exception.EmptyInputException;
import com.example.demo.entity.Employee;
import com.example.demo.repo.EmployeeCrudRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class EmployeeService implements EmployeeServiceInterface {

        @Autowired
        private EmployeeCrudRepo crudRepo;

        @Override
        public Employee addEmployee(Employee employee) {
            if (employee.getName().isEmpty() || employee.getName().length() == 0)
                throw new EmptyInputException("601","Input is empty");
            Employee savedEmployee = crudRepo.save(employee);
            return savedEmployee;
        }

        @Override
        public List<Employee> getAllEmployees() {
            return crudRepo.findAll();
        }

        @Override
        public Employee getEmpById(Long empidL) {
            return crudRepo.findById(empidL).get();
        }

        @Override
        public void deleteEmpById(Long empidL) {
            crudRepo.deleteById(empidL);
        }

}
