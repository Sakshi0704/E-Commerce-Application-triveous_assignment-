package com.eapp.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;

@Entity
public class Category {

	private Integer categoryId;
	
	private String categoryName;
	
	private List<Product> products = new ArrayList<>();
	
}
