package com.te.ems.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.te.ems.dao.EMSdao;
import com.te.ems.dto.Employee;

@Service
public class EMSserviceImpl implements EMSservice {
	

	@Autowired
	private EMSdao emsdao;
	@Override
	public Employee getById(long id) {
		return emsdao.getByeId(id);
	}
	@Override
	public Employee addEmployee(Employee employee) {
		
		return emsdao.save(employee);
	}

	

}
