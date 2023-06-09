/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app7;

import entidades.Produto2;

/**
 *
 * @author César Alves
 */
public class Program {
    public static void main(String[] args) {
        
        Produto2 produto = new Produto2();
        
        produto.adicionarEstoque(10);
        System.out.println(produto.obterEstoque());
        
        produto.retirarEstoque(8);
        System.out.println(produto.obterEstoque());
        
        
        
        
    }
}
