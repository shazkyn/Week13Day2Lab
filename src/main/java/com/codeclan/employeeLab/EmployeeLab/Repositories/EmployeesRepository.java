package com.codeclan.employeeLab.EmployeeLab.Repositories;

import com.codeclan.employeeLab.EmployeeLab.Models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeesRepository extends JpaRepository<Employee, Long> {

}
