package com.eapp.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer productId;
	
	private String productName;
	
	private String productDescription;
	
	private Double price;
	
	private Boolean availability;
	
	private Long orderQuantity;
	
	@JsonIgnore
	private String rating;
	
	@ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	private Category category;
	
	
}
