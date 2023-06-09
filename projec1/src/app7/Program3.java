/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app7;

import com.folha.Deducao;
import com.folha.Holerite;

/**
 *
 * @author César Alves
 */
public class Program3 {
    
    public static void main(String[] args) {
       
        Deducao inss = new Deducao();
        inss.setNome("INSS");
        inss.setValor(64);
        
        Deducao valeTransporte = new Deducao();
        valeTransporte.setNome("Vale Transporte");
        valeTransporte.setValor(48);
        
        Holerite holerite = new Holerite();
        
        holerite.setNomeFuncioanrio("João das Couves ");
        holerite.setSalarioBruto(800);
        holerite.setDeducoes( new Deducao[] {inss, valeTransporte});
      
        System.out.println("Salário líquido: "+ holerite.getSalarioLiquido());
       
        
        
        
        
        
        
        
        
    }    
}
