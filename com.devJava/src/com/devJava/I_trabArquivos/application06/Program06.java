package com.devJava.I_trabArquivos.application06;

import java.io.File;
import java.util.Locale;
import java.util.Scanner;

public class Program06 {

	public static void main(String[] args) {
	
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		
		System.out.println("enter with file path :");
		String strPath = sc.nextLine();
		
		
		File path = new File(strPath);
		
		System.out.println("getName: " + path.getName()); // pega o nme do arquivo e despreza o caminho 
		
		
		System.out.println("getParent: " + path.getParent()); // só o caminho desprezando o nome 
		
		System.out.println("getPath" + path.getPath());
		
			
		
		
		sc.close();
		
				
	}

}
