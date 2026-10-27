package com.tka.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tka.dao.DepartmentDao;
import com.tka.entity.DepartmentEntity;

@Service
public class DepartmentService {

	@Autowired
	DepartmentDao dd;

	public String insertData(DepartmentEntity de) {
		String msg = dd.insertData(de);
		return msg;
	}

	public String updateData(DepartmentEntity de, int id) {
		String msg = dd.update(de, id);
		return msg;
	}

	public String deleteData(int id) {
		String msg = dd.deleteData(id);
		return msg;
	}

	public DepartmentEntity fetchData(int id) {

		DepartmentEntity dee = dd.fetchData(id);
		return dee;
	}

	public List<DepartmentEntity> fetchDataAll() {

		List<DepartmentEntity> list = dd.fetchAllData();

		return list;
	}
}
