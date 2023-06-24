package com.userupdate.project1.controllers;

import com.userupdate.project1.dao.EmployeeRepository;
import com.userupdate.project1.entity.Employee;

import java.util.List;
import java.util.Optional;

import com.userupdate.project1.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;

@Controller
public class EmployeeController {
    private final EmployeeService employeeService;
    @Autowired
    EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeController(EmployeeService employeeService){
        this.employeeService = employeeService;
    }

    @GetMapping("/list-employees")
    public String listEmployees(Model model) {

        //List<Employee> employeesList = employeeRepository.findAll();
        model.addAttribute("employeesList", employeeService.getEmployees());
        System.out.println("I am done with the controller");

        return "list-of-employees";
    }

    @GetMapping("/list-employees-by-name")
    public String listEmployeesByName(@RequestParam String name, Model model) {

        List<Employee> employeesList = employeeService.getEmployees(name);
        model.addAttribute("employeesList", employeeService.getEmployees(name));

        return "list-of-employees";
    }

    @GetMapping("/list-employees-by-ID")
    public String EmployeeByID(@RequestParam Long employeeNumber, Model model) {

        Employee employee = employeeService.getEmployee(employeeNumber);
        model.addAttribute("employee", employee);

        if (employee != null){
            return "edit-employee";
        } else {
        return "error";}
    }
    @PostMapping("/edit-employees-data")

    public String employeeEdit(@RequestParam Long employeeNumber,
                               String firstName, String lastName,
                               String extension, Model model) {

        //Employee employee = new Employee(employeeNumber, firstName, lastName, extension);
        Employee savedEmployee =  employeeService.updateEmployee(employeeNumber, firstName, lastName, extension);
        System.out.println("I am saved employee data, I am leaving the controller");
        System.out.println(savedEmployee.toString());
        model.addAttribute("employee", savedEmployee);
        if (savedEmployee != null){
            return "confirmation-page";
        } else {
            return "error";}
    }

}
