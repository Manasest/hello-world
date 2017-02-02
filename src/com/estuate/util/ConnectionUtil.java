package com.estuate.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtil {
	public static Connection getConnection() {
		Connection connection = null;
		
		if(connection != null)
			return connection;
		
		else{
			try {
				Class.forName("com.mysql.jdbc.Driver");
				connection= DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=root");
			} catch (ClassNotFoundException | SQLException e) {
				e.printStackTrace();
			}
			return connection;
      }
    }
}