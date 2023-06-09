/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app6;

/**
 *
 * @author César Alves
 */
public class Program4 {
    public static void main(String[] args) {
        
        
        String [] [] locais = new String [3] [0];
        
        locais[0] = new String [3];
        locais[0][0] = "Uberlândia;";
        locais[0][1] = "Uberaba";
        locais[0][2] = "Belo Horizonte";
        
        locais[1] = new String[1];
        locais[1][0] = "Rio de Janeiro";
        
        locais[2] = new String[2];
        locais[2][0] = "São Paulo";
        locais[2][1] = "Ribeirão Preto";
        
        for (int i = 0; i < locais.length; i++) {
             for (int j = 0; j < locais[i].length; j++) {
                System.out.println(locais[i][j]);
            }
        }
        
        
        
    }
}
