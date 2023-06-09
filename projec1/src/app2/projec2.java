/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app2;

import entities.IMC;
import entities.Paciente;

/**
 *
 * @author César Alves
 */
public class projec2 {
    public static void main(String[] args) {
             
        Paciente  p = new Paciente();
        p.peso = 100;
        p.altura = 1.65;
        
        IMC imc = p.calcularIndiceDeMassaCorporal();
        
        System.out.println("Abaixo do peso ideal: "+ imc.abaixoDoPesoIdeal);
        System.out.println("Peso ideal: " + imc.pesoIdeal);
        System.out.println("Obeso: " + imc.obeso);
        System.out.println("Grau de obesidade: " + imc.grauObesidade);

        
        
        
        
        
        
        
        
    }
}
