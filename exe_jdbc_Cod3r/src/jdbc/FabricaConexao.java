package jdbc;

import java.net.ConnectException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.management.RuntimeErrorException;

public class FabricaConexao {

	public static Connection getConexao()  {
		try {
			String url = "jdbc:mysql://localhost/curso_java?verifyServerCertificate"
			+ "=false&useSSL=true";
			final String usuario = "root";
			final String senha = "pc1989";
			
			return  DriverManager.getConnection(url,usuario,senha);
		} 
		catch (SQLException e) {
			throw new RuntimeException(e);
		}
		
	}
	
	
	
	
	
	
}
