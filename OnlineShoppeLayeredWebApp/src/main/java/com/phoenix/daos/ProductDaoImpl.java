package com.phoenix.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.phoenix.data.Product;
import com.phoenix.dbconfig.OracleConnection;
/**
 * Auther: Mehul Thakor
 * Date : 7/7/2021
 * Version : 1.0
 * Copyright : Sterlite Technologies
 */
public class ProductDaoImpl implements ProductDao {

	private static Connection con;

	static {
		try {
			con = OracleConnection.getOracleConnection();
			System.out.println("Connection Established");
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		

	}

	@Override
	public List<Product> getAll() throws SQLException {
		String sql = "select * from product";
		Statement stmt = con.createStatement();
		List<Product> productList = new ArrayList<Product>();
		ResultSet rs = stmt.executeQuery(sql);
		while (rs.next()) {
			Product product = new Product();
			product.setId(rs.getInt(1));
			product.setName(rs.getString(2));
			product.setBrand(rs.getString(3));
			product.setPrice(rs.getFloat(4));
			productList.add(product);
		}
		return productList;
	}

	@Override
	public Product getProductById(int id) throws SQLException {
		String sql = "select * from product where id=?";
		PreparedStatement stmt = con.prepareStatement(sql);
		stmt.setInt(1, id);
		ResultSet rs = stmt.executeQuery(sql);
		if(rs.next()) {
			Product product = new Product();
			product.setId(rs.getInt(1));
			product.setName(rs.getString(2));
			product.setBrand(rs.getString(3));
			product.setPrice(rs.getFloat(4));
			return product;
		}else
			return null;
		
	}

	@Override
	public void insert(Product product) throws SQLException {
		String sql = "Insert into product(productId,productName,brand,price) values(?,?,?,?)";
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setInt(1, product.getId());
			stmt.setString(2, product.getName());
			stmt.setString(3, product.getBrand());
			stmt.setFloat(4, product.getPrice());
			int updateCount = stmt.executeUpdate();
			if (updateCount > 0) {
				System.out.println("New product added successfully");

			} else {
				System.out.println("Sorry!Some error occurs");
			}

	}

	@Override
	public void delete(Product product) throws SQLException {
		String sql = "delete from product where productId=?";
		PreparedStatement stmt = con.prepareStatement(sql);
		stmt.setInt(1, product.getId());
		int updateCount = stmt.executeUpdate();
		if (updateCount > 0) {
			System.out.println("User deleted successfully");

		} else {
			System.out.println("Sorry!Some error occurs");
		}
	}

	@Override
	public void update(Product product) throws SQLException {
		String sql="update product set productName=?,brand=?,price=? where productId=?";
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setInt(1, product.getId());
			stmt.setString(2, product.getName());
			stmt.setString(3, product.getBrand());
			stmt.setFloat(4, product.getPrice());
			int updateCount = stmt.executeUpdate();
			if (updateCount > 0) {
				System.out.println("product updated successfully");

			} else {
				System.out.println("Sorry!Some error occurs");
			}
	}

}

