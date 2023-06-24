package com.userupdate.project1.service;

import com.userupdate.project1.dao.EmployeeRepository;
import com.userupdate.project1.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    private final EmployeeRepository employeeRepository;

    public EmployeeService (EmployeeRepository employeeRepository){
        this.employeeRepository = employeeRepository;
    }

    public List<Employee> getEmployees() {

        //List<Employee> employeesList = employeeRepository.findAll();
        System.out.println("I am done with the service for find all");
        return employeeRepository.findAll();
    }
    public List<Employee> getEmployees(String name) {

        //List<Employee> employeesList = employeeRepository.findAllByFirstName(name);
        System.out.println("I am done with the service for search by name");
        return employeeRepository.findAllByFirstName(name);
    }

    public Employee getEmployee(Long employeeNumber) {

        //List<Employee> employeesList = employeeRepository.findAllByFirstName(name);
        System.out.println("I am done with the service for search by employeeNumber");
        Optional<Employee> employee = Optional.ofNullable(employeeRepository.findByEmployeeNumber(employeeNumber));
        if (employee.isPresent()){
            System.out.println("I have found something");
            return employeeRepository.findByEmployeeNumber(employeeNumber);
        } else {
            System.out.println("I found nothing");
            return null;
        }
    }

    public Employee updateEmployee(Long employeeNumber, String firstName, String lastName, String extension){
        Employee employee = getEmployee(employeeNumber);
        employee.setFirstName(firstName);
        employee.setLastName(lastName);
        employee.setExtension(extension);
        System.out.println("I am saving employee data");
        Employee savedEmployee = employeeRepository.save(employee);
        return savedEmployee;
    }



}
