package devdojo.maratonajava.javacore.Minterfaces.test;

import devdojo.maratonajava.javacore.Minterfaces.dominio.DataBaseLoader;
import devdojo.maratonajava.javacore.Minterfaces.dominio.DataLoader;
import devdojo.maratonajava.javacore.Minterfaces.dominio.FileLoader;

public class DataLoaderTest01 {

	public static void main(String[] args) {
	
	 	DataBaseLoader dataBaseLoader = new DataBaseLoader();
	 	FileLoader fileLoader = new FileLoader();
	 	
	 	dataBaseLoader.load();
	 	fileLoader.load();
		
	 	System.out.println();
	 	dataBaseLoader.checkPermission();
	 	fileLoader.checkPermission();
		
	 	System.out.println();
		dataBaseLoader.remove();
		fileLoader.remove();
		
		System.out.println();
		
		DataLoader.retrieveMaxDataSize();
		DataBaseLoader.retrieveMaxDataSize();
		
		

	}

}
