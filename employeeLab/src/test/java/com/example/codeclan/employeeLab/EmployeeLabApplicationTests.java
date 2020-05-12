package com.example.codeclan.employeeLab;

import com.example.codeclan.employeeLab.models.Department;
import com.example.codeclan.employeeLab.models.Employee;
import com.example.codeclan.employeeLab.models.Project;
import com.example.codeclan.employeeLab.repositories.DepartmentRepository;
import com.example.codeclan.employeeLab.repositories.EmployeeRepository;
import com.example.codeclan.employeeLab.repositories.ProjectRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EmployeeLabApplicationTests {
	@Autowired
	ProjectRepository projectRepository;

	@Autowired
	DepartmentRepository departmentRepository;

	@Autowired
	EmployeeRepository employeeRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void addEmployeeAndProject(){
		Department department = new Department("Admin");
		departmentRepository.save(department);
		Employee employee = new Employee("John", "Johnson", department);
		employeeRepository.save(employee);
		Project project = new Project("Admin ting", 5);
		projectRepository.save(project);

		project.addEmployee(employee);
		projectRepository.save(project);
	}

}
