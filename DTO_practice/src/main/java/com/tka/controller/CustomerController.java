package com.tka.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tka.entity.CustomerEntity;
import com.tka.service.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	CustomerService cs;

	@PostMapping("/insertCust")
	public String insertData(@RequestBody CustomerEntity ce) {

		return cs.insertData(ce);
	}

	@DeleteMapping("/deleteCust/{id}")
	public String deleteData(@PathVariable int id) {

		return cs.deletData(id);
	}

	@PutMapping("/updateCust/{id}")
	public String updateData(@RequestBody CustomerEntity ce, @PathVariable int id) {

		return cs.updateData(ce, id);
	}

	@GetMapping("/fetchCust/{id}")
	public Optional<CustomerEntity> fetchbyidData(@PathVariable int id) {

		return cs.fetchbyidData(id);
	}

	@GetMapping("/fetchCust")
	public List<CustomerEntity> fetchallData() {

		return cs.fetchallData();
	}
}
