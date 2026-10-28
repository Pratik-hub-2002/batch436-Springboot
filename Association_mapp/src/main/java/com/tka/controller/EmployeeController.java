package com.tka.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tka.entity.EmployeeEntity;
import com.tka.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeService es;

	@PostMapping("/Empinsert")
	public String dataInsert(@RequestBody List<EmployeeEntity> ee) {
		return es.dataInsert(ee);
	}

	@PutMapping("/Empupdate/{id}")
	public String dataUpdated(@RequestBody EmployeeEntity ee, @PathVariable int id) {

		return es.dataUpdate(ee, id);
	}

	@DeleteMapping("/Empdelete/{id}")
	public String dataDeleted(@PathVariable int id) {
		return es.dataDeleted(id);
	}

	@GetMapping("/Empfetch/{id}")
	public EmployeeEntity dataFetch(@PathVariable int id) {

		return es.dataFetch(id);
	}

	@GetMapping("/Empfetchall")
	public List<EmployeeEntity> dataFetchAll() {

		List<EmployeeEntity> list = es.dataFetchAll();
		return list;
	}
}
