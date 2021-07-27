package com.phoenix.services;

import java.sql.SQLException;
import java.util.List;

import com.phoenix.daos.LoginDao;
import com.phoenix.daos.LoginDaoImpl;
import com.phoenix.data.User;
import com.phoniex.exceptions.ServiceException;
import com.phoniex.exceptions.UserAlreadyExistException;
import com.phoniex.exceptions.UserNotFoundException;
/**
 * Auther: Mehul Thakor
 * Date : 7/7/2021
 * Version : 2.0
 * Copyright : Sterlite Technologies
 */
public class LoginServiceImpl implements LoginService {

	private LoginDao loginDao;
	

	public LoginServiceImpl() {
		
		loginDao = new LoginDaoImpl();
	}

	@Override
	public List<User> findAll() throws ServiceException {
		List<User> users=null;
		users = loginDao.getAll();
		return users;
	}

	@Override
	public User findUsersById(String username) throws UserNotFoundException {
		User user =	loginDao.getUserById(username);
		if(user!=null)
			return user;
		else
			throw new UserNotFoundException("sorry! user not found");
			
	}

	@Override
	public void add(User user) throws UserAlreadyExistException {
		loginDao.insert(user);
	}

	@Override
	public void edit(User user) throws ServiceException {
		loginDao.update(user);
	}

	@Override
	public void remove(User user) throws ServiceException {
		loginDao.delete(user);
	}

	@Override
	public String changePassWord(User user) throws ServiceException {
		User us = new User();
		String newPassword = null;
		us.setPassword(newPassword);
		loginDao.update(us);
		return "Password Changed Successfully";
		
	}

}

