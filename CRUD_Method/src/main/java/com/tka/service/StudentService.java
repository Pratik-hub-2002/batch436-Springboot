package com.tka.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tka.dao.StudentDao;
import com.tka.entity.StudentEntity;

@Service
public class StudentService {

	@Autowired
	StudentDao sd;

	public String insert(StudentEntity se) {

		String msg = sd.insert(se);
		return msg;
	}

	public String update(StudentEntity se, int id) {

		String msg = sd.update(se, id);
		return msg;
	}

	public String delete(int id) {

		String msg = sd.delete(id);
		return msg;
	}

	public StudentEntity fetch(int id) {

		StudentEntity se = sd.fetch(id);

		return se;
	}

	public List<StudentEntity> fetch() {

		List<StudentEntity> list = sd.fetchAll();

		return list;
	}
}
