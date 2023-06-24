package com.userupdate.project1.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Column;


@Entity
@Table(name="employees")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "employeeNumber")
    private Long employeeNumber;

    @Column(name = "lastName")
    private String lastName;
    @Column(name = "firstName")
    private String firstName;
    @Column(name = "extension")
    private String extension;
    @Column(name = "officeCode")
    private Long officeCode;
    @Column(name = "jobTitle")
    private String jobTitle;
    @Column(name = "email")
    private String email;
    @Column(name = "reportsTo", nullable = true)
    private Long reportsTo;

    public Employee() {
    }

    public Employee(long employeeNumber, String lastName, String firstName, String extension, Long officeCode, String jobTitle, String email, long reportsTo) {
        this.employeeNumber = employeeNumber;
        this.lastName = lastName;
        this.firstName = firstName;
        this.extension = extension;
        this.officeCode = officeCode;
        this.jobTitle = jobTitle;
        this.email = email;
        this.reportsTo = reportsTo;
    }

    public long getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(long employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public Long getOfficeCode() {
        return officeCode;
    }

    public void setOfficeCode(Long officeCode) {
        this.officeCode = officeCode;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getReportsTo() {
        return reportsTo;
    }

    public void setReportsTo(long reportsTo) {
        this.reportsTo = reportsTo;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeNumber=" + employeeNumber +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", extension='" + extension + '\'' +
                ", officeCode=" + officeCode +
                ", jobTitle='" + jobTitle + '\'' +
                ", email='" + email + '\'' +
                ", reportsTo=" + reportsTo +
                '}';
    }
}
