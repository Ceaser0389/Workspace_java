/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app6;

import entities.VagaEmprego;

/**
 *
 * @author César Alves
 */
public class Program3 {
    public static void main(String[] args) {
        
        // declaração e inst um array
      VagaEmprego[] vagasPublicadas = new VagaEmprego[5];
   
     
      VagaEmprego vaga = new VagaEmprego();
      
       //instancia e atribui a vaga ao array ao mesmo tempo
      vagasPublicadas[2] = new VagaEmprego();
      
      vagasPublicadas[2].titulo = "Web Designer";
      vagasPublicadas[2].salario = 65000;
      
       vagasPublicadas[0] = new VagaEmprego();
       
       vagasPublicadas[0].titulo = "Programador Java";
       vagasPublicadas[0].salario = 50000;
       
        
        for (int i = 0; i < vagasPublicadas.length; i++) {
            if(vagasPublicadas[i] != null){
                System.out.println(vagasPublicadas[i].titulo + " = "
                + vagasPublicadas[i].salario);
            }
        }
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
