/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app6;

import entities.CorreioEletronico;

/**
 *
 * @author César Alves
 */
public class Program5 {
    public static void main(String[] args) {
        
    String[] emails = new String[2];
    emails[0] = "joaodascouves@algaworks.com";
    emails[1] = "zemane@algaworks.com";
    
    CorreioEletronico correio = new CorreioEletronico();
    correio.enviarEmails(emails);
    
   
            }
       
}
