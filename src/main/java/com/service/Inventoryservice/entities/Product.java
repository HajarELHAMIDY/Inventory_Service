package com.service.Inventoryservice.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id; 
	private String name; 
	private int quantite ;
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product(Long id, String name, int quantite) {
		super();
		this.id = id;
		this.name = name;
		this.quantite = quantite;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQ() {
		return quantite;
	}

	public void setQ(int quantite) {
		this.quantite = quantite;
	} 
	

}
