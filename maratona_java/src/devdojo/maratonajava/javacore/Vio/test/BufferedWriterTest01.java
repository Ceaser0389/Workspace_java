package devdojo.maratonajava.javacore.Vio.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterTest01 {

	public static void main(String[] args) {
		
		// BufferdWriter é otimizado, vc escreve na memória, utilizada dados em memória
		
		File file= new File("File.txt");
	
		try  (FileWriter fw = new FileWriter(file,true);
			 BufferedWriter bw = new BufferedWriter(fw)){
			 bw.write("O DevDojo é lindo, é o melhor curso do brasillllll");
			 bw.newLine();
			 bw.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
