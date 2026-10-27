package com.tka.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

import jakarta.persistence.CheckConstraint;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class EmployeeEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int emp_id;

	@Column(nullable = false, length = 100)
	private String emp_name;

	@Column(nullable = false, length = 50)
	private String emp_city;

	@Column(nullable = false)
	private double emp_salary;

	@Column(nullable = false, unique = true, length = 100)
	private String emp_email;

	@Column(nullable = false, length = 10)
	private String emp_phone;

	@Column(nullable = false, unique = true, length = 10)
	private String emp_pan_card;

	@Column(nullable = false)
	private String emp_designation;

	@Column(nullable = false, check = @CheckConstraint(constraint = "emp_gender IN ('Male', 'Female')"))
	private String emp_gender;

	@Column(nullable = false)
	private LocalDate emp_dob;

	@Column(nullable = false, columnDefinition = "Timestamp default current_timestamp")
	private LocalDateTime emp_joining_date;

	@Column(nullable = false, columnDefinition = "boolean default true")
	private boolean is_active;

	@Column(columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP", nullable = false)
	private LocalDateTime updated_at;

	private double emp_rating;

	@ManyToOne
	private DepartmentEntity dept_e;

	public String getEmp_email() {
		return emp_email;
	}

	public void setEmp_email(String emp_email) {
		this.emp_email = emp_email;
	}

	public String getEmp_phone() {
		return emp_phone;
	}

	public void setEmp_phone(String emp_phone) {
		this.emp_phone = emp_phone;
	}

	public String getEmp_pan_card() {
		return emp_pan_card;
	}

	public void setEmp_pan_card(String emp_pan_card) {
		this.emp_pan_card = emp_pan_card;
	}

	public String getEmp_designation() {
		return emp_designation;
	}

	public void setEmp_designation(String emp_designation) {
		this.emp_designation = emp_designation;
	}

	public String getEmp_gender() {
		return emp_gender;
	}

	public void setEmp_gender(String emp_gender) {
		this.emp_gender = emp_gender;
	}

	public LocalDate getEmp_dob() {
		return emp_dob;
	}

	public void setEmp_dob(LocalDate emp_dob) {
		this.emp_dob = emp_dob;
	}

	public LocalDateTime getEmp_joining_date() {
		return emp_joining_date;
	}

	public void setEmp_joining_date(LocalDateTime emp_joining_date) {
		this.emp_joining_date = emp_joining_date;
	}

	public boolean isIs_active() {
		return is_active;
	}

	public void setIs_active(boolean is_active) {
		this.is_active = is_active;
	}

	public LocalDateTime getUpdated_at() {
		return updated_at;
	}

	public void setUpdated_at(LocalDateTime updated_at) {
		this.updated_at = updated_at;
	}

	public double getEmp_rating() {
		return emp_rating;
	}

	public void setEmp_rating(double emp_rating) {
		this.emp_rating = emp_rating;
	}

	public double getEmp_salary() {
		return emp_salary;
	}

	public void setEmp_salary(double emp_salary) {
		this.emp_salary = emp_salary;
	}

	public DepartmentEntity getDept_e() {
		return dept_e;
	}

	public void setDept_e(DepartmentEntity dept_e) {
		this.dept_e = dept_e;
	}

	public int getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}

	public String getEmp_name() {
		return emp_name;
	}

	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}

	public String getEmp_city() {
		return emp_city;
	}

	public void setEmp_city(String emp_city) {
		this.emp_city = emp_city;
	}
}
