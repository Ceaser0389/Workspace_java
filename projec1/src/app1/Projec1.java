/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package app1;

import entities.Carro;
import entities.Proprietario;

/**
 *
 * @author César Alves
 */
public class Projec1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        
        Carro meuCarro = new Carro();
        Carro seuCarro = new Carro();
        
        meuCarro.modelo = "Civic";
        seuCarro.modelo = "Palio";
        
        meuCarro.ligar();
        seuCarro.ligar();
    
    
    
    }
    
}
