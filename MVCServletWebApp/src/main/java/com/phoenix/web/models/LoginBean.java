/*
*  Author:mehul.thakor@stltech.in
*  Creation Date: 9-Jun-2021
*  Version:1.0
*  Copyright: Sterlite Technologies Ltd.
*/
package com.phoenix.web.models;

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
     
	public boolean isValid()
	{
		if(username!=null && password!=null && username.equals("Mehul") && password.equals("mehul114"))
		{
	         return true;
		}
		else
		{
			return false;  
		}	
	}
     
}
