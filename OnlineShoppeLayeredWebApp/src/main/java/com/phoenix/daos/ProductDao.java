package com.phoenix.daos;

import java.sql.SQLException;
import java.util.List;

import com.phoenix.data.Product;
import com.phoniex.exceptions.ProductNotFoundException;
/**
 * Auther: Mehul Thakor
 * Date : 7/7/2021
 * Version : 1.0
 * Copyright : Sterlite Technologies
 */
public interface ProductDao {

    List<Product> getAll() throws SQLException;
	
	Product getProductById(int id) throws ProductNotFoundException, SQLException;
	
	void insert(Product product) throws SQLException;
	
	void delete(Product product) throws SQLException;
	
	void update(Product product) throws SQLException;
}
