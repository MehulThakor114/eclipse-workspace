package com.phoenix.daos;

import java.sql.SQLException;
import java.util.List;

import com.phoenix.data.User;
/**
 * Auther: Mehul Thakor
 * Date : 7/7/2021
 * Version : 1.0
 * Copyright : Sterlite Technologies
 */
public interface LoginDao {
    
	List<User> getAll() throws SQLException;
	User getUserById(String username) throws SQLException;
	void insert(User user) throws SQLException;
	void update(User user) throws SQLException;
	void delete(User user) throws SQLException;
    
	
}
