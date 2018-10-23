package com.codeclan.employeeLab.EmployeeLab.Repositories;


import com.codeclan.employeeLab.EmployeeLab.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
