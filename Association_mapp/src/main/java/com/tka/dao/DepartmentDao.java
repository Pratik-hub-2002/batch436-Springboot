package com.tka.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tka.entity.DepartmentEntity;

@Repository
public class DepartmentDao {

	@Autowired
	SessionFactory sf;

	public String insertData(DepartmentEntity de) {

		Session ss = sf.openSession();
		Transaction t = ss.beginTransaction();

		ss.persist(de);
		t.commit();
		ss.close();
		return "Data Inserted";
	}

	public String update(DepartmentEntity de, int id) {

		Session ss = sf.openSession();
		Transaction t = ss.beginTransaction();

		DepartmentEntity dee = ss.find(DepartmentEntity.class, id);
		dee.setDept_name(de.getDept_name());
		dee.setDept_head(de.getDept_head());
		dee.setDept_location(de.getDept_location());
		ss.merge(dee);
		t.commit();
		ss.close();

		return "Data Updated";
	}

	public String deleteData(int id) {

		Session ss = sf.openSession();
		Transaction t = ss.beginTransaction();

		DepartmentEntity dee = ss.find(DepartmentEntity.class, id);

		ss.remove(dee);
		t.commit();
		ss.close();
		return "Data Deleted";
	}

	public DepartmentEntity fetchData(int id) {

		Session ss = sf.openSession();
		Transaction t = ss.beginTransaction();

		DepartmentEntity dee = ss.find(DepartmentEntity.class, id);

		t.commit();
		ss.close();
		return dee;
	}

	public List<DepartmentEntity> fetchAllData() {

		Session ss = sf.openSession();
		Transaction t = ss.beginTransaction();

		String fetch = "from DepartmentEntity";
		Query<DepartmentEntity> query = ss.createQuery(fetch, DepartmentEntity.class);
		List<DepartmentEntity> list = query.getResultList();

		return list;
	}

}
