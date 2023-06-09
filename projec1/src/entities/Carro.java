/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author César Alves
 */
public class Carro {
    
   public String fabricante;
   public String modelo;
   public String cor;
   public  String tipoCombustivel;
   public int anoDeFabricacao;
   public double velorDeMercado;
   
   public Proprietario dono = new Proprietario();
    
   
   public void ligar(){
       System.out.println("Ligando o carro " + modelo);
   
   }
    
    
    
}
