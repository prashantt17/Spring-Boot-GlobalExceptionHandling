package com.prashant.springbootGlobalException.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prashant.springbootGlobalException.EmployeeService.IEmployeeService;
import com.prashant.springbootGlobalException.Model.Employee;

@RestController
@RequestMapping("/rest/emp")
public class EmployeeController {

	@Autowired
	IEmployeeService imployeeService;

	@GetMapping("/getAllEmployee")
	public List<Employee> getAllEmployee() {
		return imployeeService.getAllEmployeeService();
	}
	
	
	@PostMapping("/createEmployee")
	public void createEmployee (@RequestBody Employee employee) {
		imployeeService.createEmployee(employee);
	}
}
