/*
*  Author:mehul.thakor@stltech.in
*  Creation Date: 9-Jun-2021
*  Version:1.0
*  Copyright: Sterlite Technologies Ltd.
*/
package com.phoenix.web.models;

import com.phoniex.exceptions.UserNotFoundException;
import com.phoenix.data.User;
import com.phoenix.services.*;

public class LoginBean {
     private String username;
     private String password;
     
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
     
	public boolean isValid() throws UserNotFoundException
	{
		  LoginService loginser = new LoginServiceImpl();
		  User dbUser= loginser.findUsersById(username);
	      
		if(dbUser!=null && password.equals(dbUser.getPassword()))
		{
	         return true;
		}
		else
		{
			return false;  
		}	
	}   
}
