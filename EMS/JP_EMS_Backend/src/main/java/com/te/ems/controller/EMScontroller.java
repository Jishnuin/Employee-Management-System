package com.te.ems.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.te.ems.dto.Employee;
import com.te.ems.service.EMSservice;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/emsadd")
@CrossOrigin("*")
public class EMScontroller {

	@Autowired
	private EMSservice emSservice;

	@PostMapping(path = "/add")
	public ResponseEntity<?> addEmployee(@RequestBody Employee employee) {
		Employee employee2 = emSservice.addEmployee(employee);
		if (employee2 != null) {
			log.info("The employee data added is: "+employee);
			return new ResponseEntity<>("Added Sucessfully", HttpStatus.OK);
		} else {
			log.error("Data Couldn't be added");
			return new ResponseEntity<>("Something Went Wrong....!!", HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}

	@GetMapping("/fetch/{id}")
	public ResponseEntity<?> getEmployee(@PathVariable long id) {
		Employee employee = emSservice.getById(id);
		if (employee != null) {
			log.info("The Employee data successfully fetched as shown: "+employee);
			return new ResponseEntity<>(employee, HttpStatus.OK);
		} else {
			log.error("Data Couldn't be retrieved");
			return new ResponseEntity<>("Something Went Wrong....!!", HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}
}
