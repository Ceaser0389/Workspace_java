/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author César Alves
 */
public class Usuario {
    
    private String nome;
    private  static int totalUsuariosLogados;
    
    public Usuario(String nome){
        this.nome = nome;
    }
    
    public String getNome() {
            return nome;
    }
    
    public void logar(){
        this.totalUsuariosLogados++;
    }
    
    public void deslogar() {
       this.totalUsuariosLogados--;
    }
    
    public static int getTotalUsuariosLogados() {
        return totalUsuariosLogados;
        }
    
}
