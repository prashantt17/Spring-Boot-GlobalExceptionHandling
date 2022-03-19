package com.prashant.springbootGlobalException.EmployeeRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.prashant.springbootGlobalException.Model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
