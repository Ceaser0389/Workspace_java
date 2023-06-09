/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author César Alves
 */
public class CorreioEletronico {
    
    
   public  void enviarEmails(String... emails) {
       //percorre todos os emails recebidos como param
       for (String email : emails) {
            
        System.out.println("E-mail enviado para " + email);
        
      }

    }  
}
