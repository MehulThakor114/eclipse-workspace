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
 * Version : 1.0
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
		try {
			users = loginDao.getAll();
		} catch ( SQLException e) {
			
			throw new ServiceException(e.getMessage()); 
		}
		return users;
	}

	@Override
	public User findUsersById(String username) throws UserNotFoundException {
		try {
			return loginDao.getUserById(username);
		} catch (SQLException e) {
			
			throw new UserNotFoundException(e.getMessage()); 
		}
	}

	@Override
	public void add(User user) throws UserAlreadyExistException {
		try {
			loginDao.insert(user);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new UserAlreadyExistException(e.getMessage());
		}
	}

	@Override
	public void edit(User user) throws ServiceException {
		try {
			loginDao.update(user);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new ServiceException(e.getMessage());
		}
	}

	@Override
	public void remove(User user) throws ServiceException {
		try {
			loginDao.delete(user);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new ServiceException(e.getMessage());
		}
	}

	@Override
	public String changePassWord(User user) throws ServiceException {
		try {
			User us = new User();
			String newPassword = null;
			us.setPassword(newPassword);
			loginDao.update(us);
			return "Password Changed Successfully";
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new ServiceException(e.getMessage());
		}
		
	}

}

