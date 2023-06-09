/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app4;

import entities.Preco;
import entities.Produto;

/**
 *
 * @author César Alves
 */
public class project4 {
    public static void main(String[] args) {
        
        Preco preco = new Preco();
        preco.valorCustos =140;
        
        Produto produto = new Produto();
        produto.definirPreco(preco, 20, 15);
        
        System.out.println("Valor Custos: " + preco.valorCustos);
        System.out.println("Valor Impostos: " + preco.valorImpostos);
        System.out.println("Valor Lucro: " + preco.valorLucro);
        System.out.println("Preço Venda: " + preco.precoVenda);
        
        
       
        
        
    }
}
