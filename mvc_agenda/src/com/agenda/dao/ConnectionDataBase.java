package com.agenda.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionDataBase {

	
	 private static final String  URL = "jdbc:mysql://localhost/agenda";
	 
	 private static final String USER = "root";
	 
	 private final String  SENHA = "pc1989";
	
	 private static final String DRIVER_CLASS = "com.mysql.jdbc.Driver";
	
	
	 public static Connection getConnection() {
		
		 System.out.println("Conectando ao Banco de Dados");
		 
		 try {
			Class.forName(DRIVER_CLASS);
			return DriverManager
			.getConnection("jdbc:mysql://localhost/agenda","root","pc1989");
		} 
		 catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		 catch (Exception e) {
			throw new RuntimeException(e);
		}
		 return null;
		 
	 }
	
}
