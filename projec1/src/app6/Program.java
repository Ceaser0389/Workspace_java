/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app6;

/**
 *
 * @author César Alves
 */
public class Program {
    
    public static void main(String[] args) {
        
        float[] pesosProdutos = new float[10];
        
        pesosProdutos[0] = 10.2f;
        pesosProdutos[4] = 98;
        pesosProdutos[9] = 30.5f;
        
        
        float total = pesosProdutos[0] + pesosProdutos[4] + pesosProdutos[9];
        System.out.println(total);
        
        
        for(int i =0; i < pesosProdutos.length; i++){
            System.out.println("Elemento" + i + " = " + pesosProdutos[i]);
        }
        
        System.out.println("****************************************");
        
        float[] pesosPodutos2 = {10.2f,0,0,0,100,0,0,0,0,30.f};
        float total2 = 0;
        
        for (int i = 0; i < pesosPodutos2.length; i++) {
            System.out.println("Elemento" + i + " = " + pesosPodutos2[i]);
            total2 += pesosPodutos2[i];
        }
        
        System.out.println("---------");
        System.out.println("Total: " +total2);
        
        
        
        
        
        
        
    }   
}
