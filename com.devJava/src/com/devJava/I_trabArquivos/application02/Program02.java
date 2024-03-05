package com.devJava.I_trabArquivos.application02;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program02 {

	public static void main(String[] args) {
		
		//EXEMPLO MANUAL 	
		
		 String path  = "C:\\Projetos\\ina.txt";
		 FileReader fr = null ;
		 BufferedReader  br  = null;
		 
		 try {
			
			 fr = new FileReader(path);
			 br = new BufferedReader(fr);
			 
			 String line = br.readLine();
		 
			 while(line != null) {
				System.out.println(line); 
				line = br.readLine(); 
			  }
			 
		 }
		 catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}	
		finally {
				try {
				if(br != null) {
					br.close();
				}
				if(fr != null) {
					fr.close();
				
				}
			  }catch (Exception e) {
				// TODO: handle exception
			  }
			}	

		}

	}


