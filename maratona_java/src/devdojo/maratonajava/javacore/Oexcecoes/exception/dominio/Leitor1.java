package devdojo.maratonajava.javacore.Oexcecoes.exception.dominio;

import java.io.Closeable;
import java.io.IOException;

import devdojo.maratonajava.javacore.ZZAclassesInternas.Override;

public class Leitor1  implements Closeable{

	
	 @Override
	  public void close() throws IOException{
		  
		  System.out.println("Fechando leitor 1");
	  }
}
