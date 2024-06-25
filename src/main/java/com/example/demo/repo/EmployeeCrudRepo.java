package com.example.demo.repo;


import com.example.demo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeCrudRepo extends JpaRepository<Employee,Long> {
}
