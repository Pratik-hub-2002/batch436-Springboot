package com.tka.entity;

import java.util.List;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class DepartmentEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int dept_id;
	private String dept_name;
	private String dept_head;
	private String dept_location;

	@OneToMany(mappedBy = "dept_e",fetch = jakarta.persistence.FetchType.EAGER)
	private List<EmployeeEntity> employees;

	public List<EmployeeEntity> getEmployees() {
		return employees;
	}

	public void setEmployees(List<EmployeeEntity> employees) {
		this.employees = employees;
	}

	public String getDept_head() {
		return dept_head;
	}

	public void setDept_head(String dept_head) {
		this.dept_head = dept_head;
	}

	public String getDept_location() {
		return dept_location;
	}

	public void setDept_location(String dept_location) {
		this.dept_location = dept_location;
	}

	public int getDept_id() {
		return dept_id;
	}

	public void setDept_id(int dept_id) {
		this.dept_id = dept_id;
	}

	public String getDept_name() {
		return dept_name;
	}

	public void setDept_name(String dept_name) {
		this.dept_name = dept_name;
	}
}
