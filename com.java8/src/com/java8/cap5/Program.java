package com.java8.cap5;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.java8.cap4.Usuario;

public class Program {

    public static void main(String[] args) {
	
	Usuario user1 = new Usuario("Paulo Silveira", 150);
	Usuario user2 = new Usuario("Rodrigo Turini", 120);
	Usuario user3 = new Usuario("Guilherme Silveira", 190);
	
	List<Usuario> usuarios = Arrays.asList(user1,user2,user3);
	
	
	Collections.sort(usuarios,
		(u1, u2) -> user1.getNome().compareTo(user2.getNome()));
	
	System.out.println(usuarios);
	
	
	
	
    }

}
