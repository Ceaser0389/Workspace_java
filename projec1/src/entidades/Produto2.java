/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author César Alves
 */
public class Produto2 {
    
    private int estoque;
    
    public void adicionarEstoque ( int estoque){
       this.estoque += estoque;
       this.verificarEstoqueMinimo();
    }
    
    public void retirarEstoque (int estoque){
      this.estoque -= estoque;
      this.verificarEstoqueMinimo();
    }
    
    
    public void verificarEstoqueMinimo(){
    
        if(this.estoque < 5)
            System.out.println("Abaixo do estoque mínimo: " 
            + this.obterEstoque());
   
    }
    
    public int obterEstoque(){
        return this.estoque;
    }
}
