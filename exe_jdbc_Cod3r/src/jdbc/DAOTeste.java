package jdbc;

public class DAOTeste {

	public static void main(String[] args) {
		
		
	 DAO dao = new DAO();
	 
	 String sql = "INSERT INTO pessoas (nome) VALUES (?) ";
	 dao.incluir(sql, "Leon");
	 dao.incluir(sql, "Messi");
	 dao.incluir(sql, "Theo");	
		
	 System.out.println("Pessoas adicionadas com sucesso");	
		
		
		
		
	}

}
