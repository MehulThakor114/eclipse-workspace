package com.phoenix.services;
import java.sql.SQLException;
import java.util.List;

import com.phoenix.data.User;
import com.phoniex.exceptions.ServiceException;
import com.phoniex.exceptions.UserAlreadyExistException;
import com.phoniex.exceptions.UserNotFoundException;
/**
 * Auther: Mehul Thakor
 * Date : 7/7/2021
 * Version : 1.0
 * Copyright : Sterlite Technologies
 */
public interface LoginService {
	
	List<User> findAll() throws ServiceException;
	User findUsersById(String userName) throws UserNotFoundException;
	void add(User user) throws UserAlreadyExistException;
	void edit(User user) throws ServiceException;
	void remove(User user) throws ServiceException;
	String changePassWord(User user) throws ServiceException , SQLException;
}
