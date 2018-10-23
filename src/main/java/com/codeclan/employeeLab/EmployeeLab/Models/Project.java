package com.codeclan.employeeLab.EmployeeLab.Models;

import com.codeclan.employeeLab.EmployeeLab.Models.Employee;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Projects")
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "Project")
    private String projectName;

    @Column(name = "Length")
    private int projectLength;

    @ManyToMany
    @JoinTable(
            name = "employees_projects",
            joinColumns = {@JoinColumn(
                    name = "project_id",
                    nullable = false,
                    updatable = false)
            },
            inverseJoinColumns = {@JoinColumn(
                    name = "employee_id",
                    nullable = false,
                    updatable = false)
            }
    )
    private List<Employee>employees;

    public Project(String projectName , int projectLength) {
        this.projectName = projectName;
        this.projectLength = projectLength;
        this.employees = new ArrayList<> ();
    }

    public Project() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
