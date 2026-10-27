package com.tka.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class StudentEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String Stud_name;
	private String Stud_city;
	private int stud_age;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStud_name() {
		return Stud_name;
	}

	public void setStud_name(String stud_name) {
		Stud_name = stud_name;
	}

	public String getStud_city() {
		return Stud_city;
	}

	public void setStud_city(String stud_city) {
		Stud_city = stud_city;
	}

	public int getStud_age() {
		return stud_age;
	}

	public void setStud_age(int stud_age) {
		this.stud_age = stud_age;
	}

}
