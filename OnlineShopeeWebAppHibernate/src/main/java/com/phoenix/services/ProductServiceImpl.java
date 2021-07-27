package com.phoenix.services;
/**
 * Auther: Mehul Thakor
 * Date : 7/7/2021
 * Version : 2.0
 * Copyright : Sterlite Technologies
 */
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import com.phoenix.daos.ProductDao;
import com.phoenix.daos.ProductDaoImpl;
import com.phoenix.data.Product;
import com.phoniex.exceptions.ProductNotFoundException;
import com.phoniex.exceptions.ServiceException;
import com.phoniex.exceptions.UserNotFoundException;

public class ProductServiceImpl implements ProductService {

	private ProductDao productDao;
	List<Product> productlist=new ArrayList<Product>();
	public ProductServiceImpl() {
		productDao = new ProductDaoImpl();
	}

	@Override
	public List<Product> findAll() throws ServiceException {
		return productDao.getAll();
	}

	@Override
	public Product findProductByld(int id) throws ProductNotFoundException, SQLException {
		Product product= productDao.getProductById(id);
		if(product!=null)
			return product;
		else
			throw new ProductNotFoundException("sorry! user not found");
			
	}

	@Override
	public void add(Product product) throws ServiceException, SQLException {
		productDao.insert(product);
	}

	@Override
	public void edit(Product product) throws ServiceException, SQLException {
		productDao.update(product);
	}

	@Override
	public void remove(Product product) throws ServiceException, SQLException {
		productDao .delete(product);
	}

	@Override
	public List<Product> findByName(String name) throws ServiceException {
		List<Product> dbproducts = findAll();
		
		List<Product> productsbyName = new ArrayList<Product>();
		for(Product products : dbproducts) {
			if(products.getName()==name) {
				productsbyName.add(products);
			}
		}
		return productsbyName;
	}

	@Override
	public List<Product> findByBrand(String brand) throws ServiceException {
        List<Product> dbproducts = findAll();
		
		List<Product> productsbyBrand = new ArrayList<Product>();
		for(Product products : dbproducts) {
			if(products.getBrand()==brand) {
				productsbyBrand.add(products);
			}
		}
		return productsbyBrand;
	}

	@Override
	public List<Product> findByPrice(float price) throws ServiceException {
        List<Product> dbproducts = findAll();
		
		List<Product> productsbyPrice = new ArrayList<Product>();
		for(Product products : dbproducts) {
			if(products.getPrice()==price) {
				productsbyPrice.add(products);
			}
		}
		return productsbyPrice;
	}

	@Override
	public List<Product> findByPriceRange(float minPrice, float maxPrice) throws ServiceException {
		 List<Product> dbproducts = findAll();
			
			List<Product> productsbyPriRange = new ArrayList<Product>();
			for(Product products : dbproducts) {
				if(products.getPrice()>=minPrice && products.getPrice()<=maxPrice) {
					productsbyPriRange.add(products);
				}
			}
			return productsbyPriRange;
	}

	@Override
	public List<Product> findByNameAndBrand(String name, String brand) throws ServiceException {
		List<Product> dbproducts = findAll();
		
		List<Product> productsNameBrand = new ArrayList<Product>();
		for(Product products : dbproducts) {
			if(products.getName()==name && products.getBrand()==brand) {
				productsNameBrand.add(products);
			}
		}
		return productsNameBrand;
	}

	@Override
	public List<Product> findByNameAndPrice(String name, float price) throws ServiceException {
        List<Product> dbproducts = findAll();
		
		List<Product> productsNamePrice = new ArrayList<Product>();
		for(Product products : dbproducts) {
			if(products.getName()==name && products.getPrice()==price) {
				productsNamePrice.add(products);
			}
		}
		return productsNamePrice;
	}

	@Override
	public List<Product> findByBrandAndPrice(String brand, float price) throws ServiceException {
        List<Product> dbproducts = findAll();
		
		List<Product> productsBrandPrice = new ArrayList<Product>();
		for(Product products : dbproducts) {
			if(products.getBrand()==brand && products.getPrice()==price) {
				productsBrandPrice.add(products);
			}
		}
		return productsBrandPrice;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Product> sortByName() throws ServiceException {
		return (List<Product>) productDao.getAll().stream().sorted(Comparator.comparing(Product::getName));
	     
		
	}

	@Override
	public List<Product> sortByBrand() throws ServiceException {
		 return (List<Product>) productDao.getAll().stream().sorted(Comparator.comparing(Product::getBrand));
	}

	@Override
	public List<Product> sortByPrice() throws ServiceException {
		return (List<Product>) productDao.getAll().stream().sorted(Comparator.comparing(Product::getPrice));
	    
	}

	@Override
	public List<Product> sortByPriceDesc() throws ServiceException {
		return (List<Product>) productDao.getAll().stream().sorted(Comparator.comparing(Product::getPrice).reversed());
	    
	}

}
