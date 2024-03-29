package devdojo.maratonajava.javacore.Oexcecoes.exception.test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

import devdojo.maratonajava.javacore.Oexcecoes.exception.dominio.Leitor1;
import devdojo.maratonajava.javacore.Oexcecoes.exception.dominio.Leitor2;

public class TryWithResourcesTest01 {

	public static void main(String[] args) {
		
	
	}
	
	//resources 
	public static void lerArquivo() throws IOException{
		
		try (Leitor1 leitor1 = new Leitor1();
			 Leitor2 leitor2 = new Leitor2()){
			
		} catch (IOException e) {
			
		}
			
	}
	
	
	public static void lerArquivo2() {
		
		Reader  reader = null;
		
		try {
			reader = new BufferedReader(new FileReader("teste.txt"));
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		 finally {
			try {
				
				if (reader != null) {
					reader.close();
				}
			} catch (IOException exception) {
				exception.printStackTrace();
			}
		}
		
		
	}
	

}
