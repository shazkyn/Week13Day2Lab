package com.codeclan.employeeLab.EmployeeLab.Models;

import com.codeclan.employeeLab.EmployeeLab.Models.Employee;

import java.util.ArrayList;
import java.util.List;

public class Project {

    private String projectName;
    private int projectLength;
    private List<Employee>employees;

    public Project(String projectName , int projectLength) {
        this.projectName = projectName;
        this.projectLength = projectLength;
        this.employees = new ArrayList<> ();
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public int getProjectLength() {
        return projectLength;
    }

    public void setProjectLength(int projectLength) {
        this.projectLength = projectLength;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}
