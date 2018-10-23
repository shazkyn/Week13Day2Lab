package com.codeclan.employeeLab.EmployeeLab;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    private String first_name;
    private String last_name;
    private int employeeNum;
    private List<Project> projects;
    private Department department;

    public Employee(String first_name , String last_name , int employeeNum , Department department) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.employeeNum = employeeNum;
        this.projects = new ArrayList<> ( );
        this.department = department;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public int getEmployeeNum() {
        return employeeNum;
    }

    public void setEmployeeNum(int employeeNum) {
        this.employeeNum = employeeNum;
    }

    public List<Project> getProjects() {
        return projects;
    }

    public void setProjects(List<Project> projects) {
        this.projects = projects;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}


