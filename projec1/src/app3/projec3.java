/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app3;

import entities.FolhaPagamento;

/**
 *
 * @author César Alves
 */
public class projec3 {
 
    public static void main(String[] args) {
        
        
        FolhaPagamento folha = new FolhaPagamento();
   
        double salario = folha.calcularSalario(160, 12,
            32.5, 40.2);
        
        System.out.println("Salário calculado: " + salario);
    }
    
}
