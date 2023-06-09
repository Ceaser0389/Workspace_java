/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author César Alves
 */
public class FolhaPagamento {
    
    
    public double calcularSalario(int horasNormais, int horasExtras,
            double valorHoraNormal, double valorHoraExtra){
    
    double valorHorasNormais = horasNormais * valorHoraNormal;
    double valorHorasExtras = horasExtras * valorHoraExtra;
    
    return  valorHorasNormais * valorHorasExtras;
    }
    
    
    
}
