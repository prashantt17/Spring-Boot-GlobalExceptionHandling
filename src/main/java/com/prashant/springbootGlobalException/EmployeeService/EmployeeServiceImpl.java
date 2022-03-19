package com.prashant.springbootGlobalException.EmployeeService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prashant.springbootGlobalException.EmployeeRepository.EmployeeRepository;
import com.prashant.springbootGlobalException.ExceptionHandlers.EmptyInputException;
import com.prashant.springbootGlobalException.Model.Employee;

@Service
public class EmployeeServiceImpl implements IEmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;

	@Override
	public List<Employee> getAllEmployeeService() {
		return employeeRepository.findAll();
	}

	@Override
	public void createEmployee(Employee employee) {

		try {
			if (employee.getName().trim().isEmpty()) {
				throw new EmptyInputException("600", "No Value entered for name");
			}

			employeeRepository.save(employee);

		} catch (Exception e) {
			throw new EmptyInputException("700", "DB aceess error");
		}

	}

}
