/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app7;

import entidades.Produto3;

/**
 *
 * @author César Alves
 */
public class Program2 {
    public static void main(String[] args) {
        
        Produto3 produto = new Produto3();
        
        produto.setNome("Mouse sem Fio");
        produto.setEstoque(10);
        
        System.out.println(produto.getNome() + " - " + produto.getEstoque());
        
    }
}
