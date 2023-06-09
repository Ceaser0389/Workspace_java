/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package app6;

/**
 *
 * @author César Alves
 */
public class Program2 {
    public static void main(String[] args) {
        
        int[] numeros1 = {5,8};
        
        //copiamos para um novo array com 5 elementos
        int[] numeros2 = java.util.Arrays.copyOf(numeros1,5);
        
        for (int num : numeros2) {
            System.out.println(num);
        }
        
        
    }
}
