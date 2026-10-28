package com.tka.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tka.entity.EmployeeEntity;

@Repository
public class EmployeeDao {

	@Autowired
	SessionFactory sf;

	public String dataInsert(List<EmployeeEntity> ee) {

		Session ss = sf.openSession();
		Transaction t = ss.beginTransaction();

		for (EmployeeEntity emp : ee) {
			ss.persist(emp);
		}

		t.commit();
		ss.close();

		String msg = "Emp Data Inserted";
		return msg;
	}

	public String dataUpdated(EmployeeEntity ee, int id) {

		Session ss = sf.openSession();
		Transaction t = ss.beginTransaction();

		EmployeeEntity eet = ss.find(EmployeeEntity.class, id);

		eet.setEmp_name(ee.getEmp_name());
		eet.setEmp_city(ee.getEmp_city());
		eet.setEmp_salary(ee.getEmp_salary());
		eet.setEmp_email(ee.getEmp_email());
		eet.setEmp_phone(ee.getEmp_phone());
		eet.setEmp_pan_card(ee.getEmp_pan_card());
		eet.setEmp_designation(ee.getEmp_designation());
		eet.setEmp_gender(ee.getEmp_gender());
		eet.setEmp_dob(ee.getEmp_dob());
		eet.setEmp_joining_date(ee.getEmp_joining_date());
		eet.setUpdated_at(ee.getUpdated_at());
		eet.setEmp_rating(ee.getEmp_rating());

		ss.merge(eet);
		t.commit();
		ss.close();

		String msg = "Emp Data Updated";
		return msg;
	}

	public String dataDeleted(int id) {

		Session ss = sf.openSession();
		Transaction t = ss.beginTransaction();

		EmployeeEntity eet = ss.find(EmployeeEntity.class, id);

		ss.remove(eet);
		t.commit();
		ss.close();

		String msg = "Emp Data Deleted";
		return msg;
	}

	public EmployeeEntity dataFetch(int id) {

		Session ss = sf.openSession();
		Transaction t = ss.beginTransaction();

		EmployeeEntity eet = ss.find(EmployeeEntity.class, id);

		t.commit();
		ss.close();

		return eet;
	}

	public List<EmployeeEntity> dataFetchAll() {

		Session ss = sf.openSession();
		Transaction t = ss.beginTransaction();

		String fetchAll = "from EmployeeEntity";
		
		Query<EmployeeEntity> query = ss.createQuery(fetchAll, EmployeeEntity.class);
		List<EmployeeEntity> list = query.getResultList();

		return list;
	}

}
