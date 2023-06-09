package application4;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;

public class Program4 {

	public static void main(String[] args) {
		
	 	String[] lines = new String[] {"Good Morning", "Good Afternoon" ,
	 	"Good Evening"};
		
	 	String path = "D:\\Projetos\\out.txt";
	 	
	 	try(BufferedWriter bw = new BufferedWriter(new FileWriter(path,true))){
	 		 for (String line : lines) {
				bw.write(line);
				bw.newLine();
			}
		}
	 		
	 	catch (IOException e) {
			e.printStackTrace();
		}
	 	
	 	
	 	
	 	
	 	
	 	}
	 	
	 	
	 	

	}


