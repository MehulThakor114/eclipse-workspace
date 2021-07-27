package com.phoenix.dbconfig;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConfig {
    
	public static Connection getConnection(String jdbcDriver,String jdbcUrl,String dbUser,String dbPassword) throws ClassNotFoundException, SQLException  {
		    Class.forName(jdbcDriver);
			return DriverManager.getConnection(jdbcUrl,dbUser,dbPassword);
	}
}
