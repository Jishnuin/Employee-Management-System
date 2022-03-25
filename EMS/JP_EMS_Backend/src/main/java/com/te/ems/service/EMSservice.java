package com.te.ems.service;

import com.te.ems.dto.Employee;

public interface EMSservice  {
	Employee addEmployee(Employee employee);
	
	Employee getById(long id);
}
