/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author César Alves
 */
public class Produto3 {
    
  private String nome;
  private int estoque;
    
   public String getNome(){
    
      return this.nome;
   }
    
   public void setNome( String nome){
        this.nome = nome;
   }
    
   public int getEstoque(){
       return this.estoque;
   }
   
   public void setEstoque( int estoque){
       this.estoque = estoque;
   }
    
   public void adcionarEstoque(int estoque){
         this.estoque += estoque;
   }
   
      
   public void retirarEstoque(int estoque){
         this.estoque -= estoque;
   }
   
   
   
}
