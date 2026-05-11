package com.hms.db;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

	private static Connection conn;
	
	public static Connection getConn() {
		
		try {
			
			//step:1 for connection - load the driver class 
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// step:2 - create a connection (use your local MySQL password; avoid committing real secrets to public repos)
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospitals", "root", "YOUR_MYSQL_PASSWORD");
			
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		
		return conn;
	}
}
