package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class AlterarNomePessoa {

	public static void main(String[] args)   throws SQLException{
	Scanner sc = new Scanner(System.in);
   
	
	System.out.println("Informe o código da pessoa:");
	int codigo = sc.nextInt();
	
	String select = "SELECT * FROM pessoas WHERE codigo = ?";
	String update= "UPDATE pessoas SET nome = ? WHERE codigo = ?";
	
	Connection conexao = FabricaConexao.getConexao();
	PreparedStatement stmt = conexao.prepareStatement(select);
	stmt.setInt(1, codigo);
	ResultSet resul = stmt.executeQuery();
	
	if(resul.next()) {
		Pessoa p = new Pessoa(resul.getInt(1), resul.getString(2));
		
		System.out.println("O nome atual é " + p.getNome());
		sc.nextLine();
		
		System.out.println("Informe o novo nome: " );
		String novoNome = sc.nextLine();
		
	
		
		stmt.close();
		stmt = conexao.prepareStatement(update);
		stmt.setString(1, novoNome);
		stmt.setInt(2, codigo);
		stmt.execute();
		
		System.out.println("Pessoa alterada com sucesso!");
		
	}
	
	
	conexao.close();
	sc.close();
	}

}
