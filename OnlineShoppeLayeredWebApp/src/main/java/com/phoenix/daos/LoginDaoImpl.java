package com.phoenix.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.phoenix.data.User;
import com.phoenix.dbconfig.OracleConnection;
/**
 * Auther: Mehul Thakor
 * Date : 7/7/2021
 * Version : 1.0
 * Copyright : Sterlite Technologies
 */
public class LoginDaoImpl implements LoginDao {
	
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
	public List<User> getAll() throws SQLException {
		Statement s = con.createStatement();
		String sql = "select * from users";
		ResultSet rs = s.executeQuery(sql);
		System.out.println("Users>>>>>>>>>>" + rs);
		ArrayList<User> userList = new ArrayList<User>();
		while (rs.next()) {
			User user = new User();
			user.setUsername(rs.getString(1));
			user.setPassword(rs.getString(2));
			userList.add(user);
		}
		return userList;
	}

	@Override
	public User getUserById(String username) throws SQLException {
		String sql = "select username,password from login where username=?";
		PreparedStatement stmt = con.prepareStatement(sql);
		stmt.setString(1, username);
		ResultSet rs = stmt.executeQuery();
		if (rs.next()) {
			User user = new User();
			user.setUsername(rs.getString(1));
			user.setPassword(rs.getString(2));
			return user;
		} else {
			return null;
		}
	}

	@Override
	public void insert(User user) throws SQLException {
		String sql = "Insert into login(username,password) values(?,?)";
		PreparedStatement stmt = con.prepareStatement(sql);
		stmt.setString(1, user.getUsername());
		stmt.setString(2, user.getPassword());
		int updateCount = stmt.executeUpdate();
		if (updateCount > 0) {
			System.out.println("New user added successfully");

		} else {
			System.out.println("Sorry!Some error occurs");
		}
		
	}

	@Override
	public void update(User user) throws SQLException {
		String sql="update login set password=? where username=?";
		PreparedStatement stmt=con.prepareStatement(sql);
		stmt.setString(2, user.getUsername());
		stmt.setString(1, user.getPassword());
		int updateCount = stmt.executeUpdate();
		if (updateCount > 0) {
			System.out.println("User updated successfully");

		} else {
			System.out.println("Sorry!Some error occurs");
		}
		
	}

	@Override
	public void delete(User user) throws SQLException {
		
		String sql="delete from login where username=?";
		PreparedStatement stmt=con.prepareStatement(sql);
		stmt.setString(1, user.getUsername());
		int updateCount =stmt.executeUpdate();
		if (updateCount > 0) {
			System.out.println("User deleted successfully");

		} else {
			System.out.println("Sorry!Some error occurs");
		}
		
	}

  	
	
}
