package com.tka.entity;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@JsonPropertyOrder({ "Cust_id", "Cust_name", "Cust_city", "Cust_email", "Cust_mobNo", "Cust_gender" })

@Entity
@Data
@NoArgsConstructor
public class CustomerEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Cust_id;
	private String Cust_name;
	private String Cust_city;
	private String Cust_email;
	private long Cust_mobNo;
	private char Cust_gender;
}
