package com.phoniex.entities;
/*
 * @auther mehul.thakor@stl.tech
 * @creation date 7-Jul-2021
 * @version 1.0
 * copyright Sterlite Technologies Ltd.
 * @description It is a POJO class which acts as Persistent
 *           class or Entity class in Hibernate
 * */
public class Product {

	  //attributes or instance variables
	  private int productId;
	  private String productName;
	  private String brand;
	  private float price;
	  //default constructor
	  public Product() {
		  
	  }
	public Product(int productId, String productName, String brand, float price) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.brand = brand;
		this.price = price;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", brand=" + brand + ", price="
				+ price + "]";
	}
}
