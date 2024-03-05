package com.java8.cap2;


import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Capitulo2 {

    public static void main(String[] args) {
	
	Usuario user1 = new Usuario("Paulo Silveira", 150);
	Usuario user2 = new Usuario("Kiko", 120);
	Usuario user3 = new Usuario("Gael ", 170);
	
	List<Usuario> usuarios = Arrays.asList(user1,user2,user3);
	
	for(Usuario u : usuarios) {
	    System.out.println(u.getNome());
	}
	
	System.out.println("*****************************");
	
	
	 Mostrador mostrador0 = new Mostrador(); usuarios.forEach(mostrador0);
	  
	 System.out.println("*****************************");
	 
	
	 usuarios.forEach( new Consumer<Usuario>() {
	  
	  @Override public void accept(Usuario u) { System.out.println(u.getNome()); }
	  }); System.out.println("*****************************");
	 
	 
	
        Consumer<Usuario> mostrador =(Usuario u )->
        	{System.out.println(u.getNome());};
	
	usuarios.forEach(u -> u.tornaModerador());
	
	
    }

}
