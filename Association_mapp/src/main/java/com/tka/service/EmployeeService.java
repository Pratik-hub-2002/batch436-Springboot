package com.tka.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tka.dao.EmployeeDao;
import com.tka.entity.EmployeeEntity;

@Service
public class EmployeeService {

	@Autowired
	EmployeeDao ed;

	public String dataInsert(List<EmployeeEntity> ee) {

		return ed.dataInsert(ee);
	}

	public String dataUpdate(EmployeeEntity ee, int id) {

		return ed.dataUpdated(ee, id);
	}

	public String dataDeleted(int id) {

		return ed.dataDeleted(id);
	}

	public EmployeeEntity dataFetch(int id) {

		return ed.dataFetch(id);
	}

	public List<EmployeeEntity> dataFetchAll() {

		List<EmployeeEntity> list = ed.dataFetchAll();
		return list;
	}
}
