package devdojo.maratonajava.javacore.Rdatas.test;

import java.time.Instant;
import java.time.LocalDateTime;

public class InstantTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Instant now = Instant.now();   // manipular datas em um banco de dados
		System.out.println(now);
		
		System.out.println(LocalDateTime.now());
		
		System.out.println(now.getNano()); // nano segundo do seg  
		
		
	}

}
