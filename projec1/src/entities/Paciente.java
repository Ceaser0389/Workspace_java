/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author César Alves
 */
public class Paciente {
    
    public double peso;
    public double altura;
      
    
   public IMC calcularIndiceDeMassaCorporal(){
       
       IMC imc = new IMC();
        
        double  indice = peso/ (altura * altura) ; 
        
        if (indice < 18.5){
          imc.abaixoDoPesoIdeal = true;
        }
        else if( indice < 25 ){
             imc.pesoIdeal = true;
        }
        else{
           imc.obeso = true;
           
           if( indice < 30){
           imc.grauObesidade = "Acima do Peso";
           }else if (indice < 35) {
               imc.grauObesidade = "I";
            }
           else if (indice < 40){
               imc.grauObesidade = "II";
           }else{
               imc.grauObesidade = "III";
           } 
        }
        
        return imc;
    }
    
    
}
