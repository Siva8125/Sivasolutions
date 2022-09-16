package com.dsk.db.connections;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;

public class MySqlDBConnection {
	private static MySqlDBConnection mysqldbconnection = new MySqlDBConnection();
	Connection connection;
	private MySqlDBConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/dsk","root","Devi@0538");
			
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	public static Connection getInstance() {
		return mysqldbconnection.connection;
	}
	

	public static void main(String[] args) {
		System.out.println(mysqldbconnection.getInstance());
		
	}

}
