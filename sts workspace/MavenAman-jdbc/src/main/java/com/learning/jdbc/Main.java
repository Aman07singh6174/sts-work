package com.learning.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

//import com.learning.jdbc.entitity.Employee;

public class Main {

	public static void main(String[] args) throws SQLException {
	//	Employee e=new Employee9(10,"Surya",5500000);
		
		Connection connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root","root");
		
		Statement statement=connection.createStatement();
		statement.executeUpdate("insert into empleyee value (4,'suryathakur' ,120000);");
		
		System.err.println("!-----success-----!");
		
		
	}

}
