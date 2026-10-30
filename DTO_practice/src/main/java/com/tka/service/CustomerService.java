package com.tka.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tka.entity.CustomerEntity;
import com.tka.repo.CustomerRepo;

@Service
public class CustomerService {

	@Autowired
	CustomerRepo cr;

	public String insertData(CustomerEntity ce) {
		cr.save(ce);
		String msg = "Data Inserted";
		return msg;
	}

	public String deletData(int id) {
		cr.deleteById(id);
		String msg = "Data Deleted";
		return msg;
	}

	public String updateData(CustomerEntity ce, int id) {
		CustomerEntity cee = cr.getById(id);
		cee.setCust_name(ce.getCust_name());
		cee.setCust_email(ce.getCust_email());
		cee.setCust_gender(ce.getCust_gender());
		cee.setCust_city(ce.getCust_city());
		cr.save(cee);
		String msg = "Data Updated";
		return msg;
	}

	public Optional<CustomerEntity> fetchbyidData(int id) {
		return cr.findById(id);

	}

	public List<CustomerEntity> fetchallData() {

		return cr.findAll();
	}
}
