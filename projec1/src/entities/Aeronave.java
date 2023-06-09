/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author César Alves
 */
public class Aeronave {
    
    
   public int totalAssentosNormais;
   public int totalAssentosEspeciais;
   public  int assentosNormaisReservados;
   public int assentosEspeciaisReservados;
    
    public void reservarAssentos(int assentos){
       this.assentosNormaisReservados += assentos;
    }
    
    
    public int calcularAssentosDisponiveis(){
      return  totalAssentosNormais - assentosNormaisReservados +
              totalAssentosEspeciais - assentosEspeciaisReservados;
    }
    
    public void reservarAssentos(int assentosNormais, int assentosEspeciais) {
        this.assentosNormaisReservados += assentosNormais;
        this.assentosEspeciaisReservados += assentosEspeciais;
    }
    
}
