package com.phoenix.daos;

import java.util.List;

import com.phoenix.data.Product;
/**
 * Auther: Mehul Thakor
 * Date : 7/7/2021
 * Version : 2.0
 * Copyright : Sterlite Technologies
 */
public interface ProductDao {

    List<Product> getAll();
	
	Product getProductById(int id);
	
	void insert(Product product);
	
	void delete(Product product);
	
	void update(Product product);
}
