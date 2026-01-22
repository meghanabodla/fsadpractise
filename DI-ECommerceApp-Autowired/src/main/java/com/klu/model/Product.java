package com.klu.model;

import org.springframework.stereotype.Component;

@Component
public class Product {
	private int productId;
	private String productName;
	private double price;
	private String category;
	public Product() {
		this.productId= 101;
		this.productName="Meghana";
		this.price=4500.000;
		this.category="Electronics";
		
	}
	public int getproductId() {
		return productId;	
	}
	public String getproductName() {
		return productName;	
	}
	public double getprice() {
		return price;	
	}
	public String getCategory() {
		return category;	
	}
	
	

}
