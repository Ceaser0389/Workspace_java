/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app8;

import entidades.Usuario;

/**
 *
 * @author César Alves
 */
public class TesteUsuario {
    public static void main(String[] args) {
        
        Usuario usuario1 = new Usuario("João");
        Usuario usuario2 = new Usuario("Sebastião");
        
        usuario1.logar();
        usuario2.logar();
        
        System.out.println(usuario1.getNome());
        System.out.println(usuario2.getNome());
        
        System.out.println(Usuario.getTotalUsuariosLogados());
        
        
        
        
        
        
    }
}
