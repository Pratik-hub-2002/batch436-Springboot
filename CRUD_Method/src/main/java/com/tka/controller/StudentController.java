package com.tka.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.tka.entity.StudentEntity;
import com.tka.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	StudentService ss;

	@PostMapping("/insert")
	public String insertData(@RequestBody StudentEntity se) {

		String msg = ss.insert(se);
		return msg;
	}

	@PutMapping("/update/{id}")
	public String updateData(@RequestBody StudentEntity se, @PathVariable int id) {

		String msg = ss.update(se, id);
		return msg;
	}

	@DeleteMapping("/delete/{id}")
	public String deleteData(@PathVariable int id) {

		String msg = ss.delete(id);
		return msg;
	}

	@GetMapping("/fetch/{id}")
	public StudentEntity fetch(@PathVariable int id) {

		StudentEntity se = ss.fetch(id);
		return se;
	}

	@GetMapping("/fetchall")
	public List<StudentEntity> fetchAll() {

		List<StudentEntity> list = ss.fetch();
		return list;
	}
}
