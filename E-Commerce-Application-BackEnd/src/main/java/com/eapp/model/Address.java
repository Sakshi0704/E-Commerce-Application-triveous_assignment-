package com.eapp.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer addressId;
	
	private String addressLine;
	
	private String City;
	
	private String State;
	
	private String pincode;
	
	@ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	private Users user;
	
}
