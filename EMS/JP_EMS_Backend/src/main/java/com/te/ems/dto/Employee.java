package com.te.ems.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "Employee_details")
public class Employee {
	@Column(name = "emp_id")
	@Id
	@GeneratedValue
	long eId;
	@Column(name = "emp_name")
	String name;
	@Column(name = "designation")
	String design;
	@Column(name = "salary")
	double sal;
	@Column(name = "age")
	int age;
}
