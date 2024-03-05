package com.agenda.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public abstract class GenericDao {

	private Connection connection;    //  Connection vem class ConnectionDBase p associação
	
	
	protected GenericDao() {
		this.connection  = ConnectionDataBase.getConnection(); // recebo a conexao p construtor por injeção dependecia
	} 
	
	
	protected Connection getConnection() {
        return connection;
    }
	
	
	
	protected void save( String insertSQL, Object... parametros) 
throws SQLException {
		PreparedStatement pstmt =
				getConnection().prepareStatement(insertSQL);
		
	      for(int i = 0; i < parametros.length;i ++) {
	      		pstmt.setObject(i+1, parametros[i]);
	      	}
	
	      pstmt.execute();
	      pstmt.close();
	      connection.close();
	
	}
	
	   protected void update(String updateSql, Object id, Object... parametros) 
	throws SQLException {
	        PreparedStatement pstmt = 
	        			getConnection().prepareStatement(updateSql);
				
	        for (int i = 0; i < parametros.length; i++) {
	            pstmt.setObject(i+1, parametros[i]);
	        }
	        pstmt.setObject(parametros.length + 1, id);
	        pstmt.execute();
	        pstmt.close();
	        connection.close();
	    }

	
	   protected void delete(String deleteSql, Object... parametros) 
	throws SQLException {
	        PreparedStatement pstmt = 
			getConnection().prepareStatement(deleteSql);
				
	        for (int i = 0; i < parametros.length; i++) {
	            pstmt.setObject(i+1, parametros[i]);
	        }

	        pstmt.execute();
	        pstmt.close();
	        connection.close();
	    }
	
	
	
	
	
}
