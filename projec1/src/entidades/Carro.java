/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author César Alves
 */
public class Carro {
    
    
    public static final int VELOCIDADE_MAXIMA = 180;
    
    public void acelerar(int velocidade){
        if(velocidade >  VELOCIDADE_MAXIMA){
            System.out.println("Velocidade acima da permitida.");
        }
        else{
            System.out.println("Acelerando...");
        }
    
    }
    
    
    
    
    
    
}
