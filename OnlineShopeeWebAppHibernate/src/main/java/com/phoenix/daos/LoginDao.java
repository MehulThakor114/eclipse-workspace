package com.phoenix.daos;

import java.util.List;

import com.phoenix.data.User;
/**
 * Auther: Mehul Thakor
 * Date : 7/7/2021
 * Version : 1.0
 * Copyright : Sterlite Technologies
 */
public interface LoginDao {
    
	List<User> getAll();
	User getUserById(String username);
	void insert(User user);
	void update(User user);
	void delete(User user);
    
	
}
