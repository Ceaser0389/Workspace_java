package devdojo.maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest01 {

	public static void main(String[] args) {
	
		
	File file= new File("File.txt");
	
	try(FileReader fr = new FileReader(file)){
		
		char[] in = new char[50];
		fr.read(in);
		for (char c : in) {
			System.out.print(c);
		}
		
		
	}catch (IOException e) {
		 e.printStackTrace();
	}
		
		
		
		
		

	}

}
