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

import com.tka.entity.DepartmentEntity;
import com.tka.service.DepartmentService;

@RestController
public class DepartmentController {

	@Autowired
	DepartmentService ds;

	@PostMapping("/insert")
	public String insertData(@RequestBody DepartmentEntity de) {
		ds.insertData(de);
		return "Department Inserted Successfully via API!";
	}

	@PutMapping("/update/{id}")
	public String updateData(@RequestBody DepartmentEntity de, @PathVariable int id) {
		ds.updateData(de, id);
		return "Department Updated Successfully via API!";
	}

	@DeleteMapping("/delete/{id}")
	public String deleteData(@PathVariable int id) {
		ds.deleteData(id);
		return "Department Deleted Successfully via API!";
	}

	@GetMapping("/fetch/{id}")
	public DepartmentEntity fetchData(@PathVariable int id) {
		DepartmentEntity dee = ds.fetchData(id);
		return dee;
	}

	@GetMapping("/fetchall")
	public List<DepartmentEntity> fetchAllData() {

		List<DepartmentEntity> list = ds.fetchDataAll();
		return list;
	}
}
