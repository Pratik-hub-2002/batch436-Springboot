package com.tka.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tka.entity.StudentEntity;

@Repository
public class StudentDao {

	@Autowired
	SessionFactory sf;

	public String insert(StudentEntity se) {

		Session ss = sf.openSession();
		Transaction t = ss.beginTransaction();

		ss.persist(se);
		t.commit();
		ss.close();

		return "Data Inserted";
	}

	public String update(StudentEntity se, int id) {

		Session ss = sf.openSession();
		Transaction t = ss.beginTransaction();

		StudentEntity sse = ss.find(StudentEntity.class, id);
		sse.setStud_name(se.getStud_name());
		sse.setStud_city(se.getStud_city());
		sse.setStud_age(se.getStud_age());

		ss.merge(sse);
		t.commit();
		ss.close();

		return "Data Updated";
	}

	public String delete(int id) {

		Session ss = sf.openSession();
		Transaction t = ss.beginTransaction();

		StudentEntity sse = ss.find(StudentEntity.class, id);

		ss.remove(sse);
		t.commit();
		ss.close();
		return "Data Deleted";
	}

	public StudentEntity fetch(int id) {

		Session ss = sf.openSession();
		Transaction t = ss.beginTransaction();

		StudentEntity sse = ss.find(StudentEntity.class, id);

		t.commit();
		ss.close();
		return sse;
	}

	public List<StudentEntity> fetchAll() {

		Session ss = sf.openSession();
		Transaction t = ss.beginTransaction();

		String fetch = "from StudentEntity";
		Query<StudentEntity> query = ss.createQuery(fetch, StudentEntity.class);
		List<StudentEntity> list = query.getResultList();
		return list;

	}
}
