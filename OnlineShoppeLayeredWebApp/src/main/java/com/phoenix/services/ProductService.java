package com.phoenix.services;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.phoenix.data.Product;
import com.phoniex.exceptions.ProductNotFoundException;
import com.phoniex.exceptions.ServiceException;
/**
 * Auther: Mehul Thakor
 * Date : 7/7/2021
 * Version : 1.0
 * Copyright : Sterlite Technologies
 */
public interface ProductService {

	List<Product> findAll() throws ServiceException;

	Product findProductByld(int id) throws ProductNotFoundException, SQLException;

	void add(Product product) throws ServiceException, SQLException;

	void edit(Product product) throws ServiceException, SQLException;

	void remove(Product product) throws ServiceException, SQLException;

	List<Product> findByName(String name) throws ServiceException;

	List<Product> findByBrand(String brand) throws ServiceException;

	List<Product> findByPrice(float price) throws ServiceException;

	List<Product> findByPriceRange(float minPrice, float maxPrice) throws ServiceException;

	List<Product> findByNameAndBrand(String name, String brand) throws ServiceException;

	List<Product> findByNameAndPrice(String name, float price) throws ServiceException;

	List<Product> findByBrandAndPrice(String brand, float price) throws ServiceException;

	List<Product> sortByName() throws ServiceException, SQLException;

	List<Product> sortByBrand() throws ServiceException, SQLException;

	List<Product> sortByPrice() throws ServiceException, SQLException;

	List<Product> sortByPriceDesc() throws ServiceException, SQLException;
}

