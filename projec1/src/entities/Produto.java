/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author César Alves
 */
public class Produto {
    
    
    
    public void definirPreco( Preco preco , double percentualImpostos,
            double margemLucro){
    
        preco.valorImpostos = preco.valorCustos * (percentualImpostos / 100);
        
        preco.valorLucro = preco.valorCustos * (margemLucro/100);
        
        preco.precoVenda = preco.valorCustos + preco.valorImpostos
      + preco.valorLucro;
        
        
    }
    
    
}
