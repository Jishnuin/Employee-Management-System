package com.te.ems.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.te.ems.dto.Employee;

public interface EMSdao extends JpaRepository<Employee, Long> {

	Employee getByeId(long id);
}
