package com.userupdate.project1.dao;
import com.userupdate.project1.entity.Employee;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    List<Employee> findAll();
    List<Employee> findAllByFirstName(String name);
    Employee findByEmployeeNumber(Long employeeNumber);
    Employee save(Employee employee);

}
