package com.devJava.L_progFuncional.exe06.application;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Program {

	public static void main(String[] args) {
	
		
		// Stream seq de elementos,fonte de dados suporte a "operações agregadas"
		
		
				 List<Integer> list = Arrays.asList(3,4,5,10,7);
				
				 Stream<Integer> st1 = list.stream().map(x -> x *10);
				 System.out.println(Arrays.toString(st1.toArray()));
				
				 
				 System.out.println("**********************************************************");
				
				
				 Stream<String> st2 = Stream.of("Maria","Bob","alex");
				 System.out.println(Arrays.toString(st2.toArray()));
				
			
				 System.out.println("**********************************************************");
				
				 Stream<Integer> st3 = Stream.iterate(0, x -> x  + 2);
				 System.out.println(Arrays.toString(st3.limit(10).toArray()));
				 
	
				 System.out.println("**********************************************************");
				 
				 
				
				 
				 
				 
	}

}
