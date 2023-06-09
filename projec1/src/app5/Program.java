/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app5;

import entities.Aeronave;

/**
 *
 * @author César Alves
 */
public class Program {
    
    public static void main(String[] args) {
       
        
       Aeronave aviaoGol = new Aeronave(); 
       
       
       Aeronave aviaoTam = new Aeronave();
     
       
       aviaoGol.reservarAssentos(10);
       aviaoTam.reservarAssentos(5);
     
        int assentosGol = aviaoGol.calcularAssentosDisponiveis();
        int assentosTam = aviaoTam.calcularAssentosDisponiveis();
        
        System.out.println("Assentos disponíveis - Gol: " +assentosGol);
        System.out.println("Assentos disponíveis - Gol: " +assentosTam);
        
        
        
    }   
}
