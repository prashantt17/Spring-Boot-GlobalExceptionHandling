package com.prashant.springbootGlobalException.EmployeeService;

import java.util.List;
import com.prashant.springbootGlobalException.Model.Employee;

public interface IEmployeeService {

	public List<Employee> getAllEmployeeService();

	public void createEmployee(Employee employee);
}
