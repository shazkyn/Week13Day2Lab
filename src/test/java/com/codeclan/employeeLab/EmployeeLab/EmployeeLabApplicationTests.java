package com.codeclan.employeeLab.EmployeeLab;

import com.codeclan.employeeLab.EmployeeLab.Models.Department;
import com.codeclan.employeeLab.EmployeeLab.Models.Employee;
import com.codeclan.employeeLab.EmployeeLab.Repositories.DepartmentRepository;
import com.codeclan.employeeLab.EmployeeLab.Repositories.EmployeesRepository;
import com.codeclan.employeeLab.EmployeeLab.Repositories.ProjectRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EmployeeLabApplicationTests {

	@Autowired
	ProjectRepository projectRepository;

	@Autowired
	EmployeesRepository employeesRepository;

	@Autowired
	DepartmentRepository departmentRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void canCreateAndSaveEmployeeAndDepartment() {
		Department department = new Department ("Menswear");
		departmentRepository.save (department);

		Employee employee = new Employee ("John", "Doe", 1, department);
		employeesRepository.save (employee);
	}

}
