package com.example.RelationshipLab;

import com.example.RelationshipLab.models.Department;
import com.example.RelationshipLab.models.Employee;
import com.example.RelationshipLab.repositories.DepartmentRepository;
import com.example.RelationshipLab.repositories.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class RelationshipLabApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;

	@Autowired
	DepartmentRepository departmentRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void createEmployeeAndDepartment(){
		Department department = new Department("HR");
		departmentRepository.save(department);

		Employee employee1 = new Employee("Sandy", "Yu", department);
		employeeRepository.save(employee1);

		Employee employee2 = new Employee("Chris", "Dias", department);
		employeeRepository.save(employee2);
	}

}
