package com.phoenix.props;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class UserDefinedPropsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(FileInputStream in = new FileInputStream("credentials.properties");){
			
			Properties props = new Properties();
			props.load(in);
			String uname = props.getProperty("username");
			String pwd = props.getProperty("password");
			System.out.println("Username: "+uname);
			System.out.println("Password: "+pwd);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
