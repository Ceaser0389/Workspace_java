package devdojo.maratonajava.javacore.Oexcecoes.exception.test;

import java.util.Scanner;

import devdojo.maratonajava.javacore.Oexcecoes.exception.dominio.LoginInvalidoException;

public class LoginInvalidoExceptionTest01 {

	public static void main(String[] args) {
	
		try {
			logar();
		} catch (LoginInvalidoException e) {
			e.printStackTrace();
		}

	}
	
	private static void logar() throws LoginInvalidoException {
		
		Scanner teclado = new Scanner(System.in);
		String userNameDB = "Goku";
		String senhaDB = "ssj";
		
		System.out.println("Usuário");
		String userNameDigitado  = teclado.nextLine();
		System.out.println("Senha");
		String  senhaDigitada  = teclado.nextLine();
		
	     if(!userNameDB.equals(userNameDigitado)|| !senhaDB.equals(senhaDigitada)) {
	    	 
	    	 throw new LoginInvalidoException("usuário ou senha inválido");
	     }
		
	     System.out.println("Usuário logado com sucesso");
	     
	}

}
