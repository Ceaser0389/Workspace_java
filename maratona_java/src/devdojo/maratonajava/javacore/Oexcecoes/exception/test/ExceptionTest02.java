package devdojo.maratonajava.javacore.Oexcecoes.exception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest02 {

	public static void main(String[] args) throws IOException{
		
		criarNovoArquivo();		
	}
	
	
	public static void criarNovoArquivo()  throws IOException {
		File file = new File("C:\\Projetos\\workspace_java\\teste.txt");

		try {
			boolean iscriado = file.createNewFile();
			System.out.println("Arquivo criado" + iscriado);
			
		} catch (IOException e) {
			
			  e.printStackTrace();
			 throw new RuntimeException("Problema na hora de criar o arquivo.");
		}
		
		
		
	}
}
