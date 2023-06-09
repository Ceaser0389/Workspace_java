/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.folha;

/**
 *
 * @author César Alves
 */
public class Holerite {
   
    private String nomeFuncionario;
    private double salarioBruto;
    private Deducao[] deducoes;
    
    public String getNomeFuncionario(){
      return this.nomeFuncionario;
    }
    
    public void setNomeFuncioanrio( String nomeFuncionario){
       this.nomeFuncionario = nomeFuncionario;
    }
    
    public double getSalarioBruto(){
     return this.salarioBruto;
    }
    
    public void setSalarioBruto(double salarioBruto){
       this.salarioBruto = salarioBruto;
    }
    
    public Deducao[] getDeducoes(){
      return  deducoes;
    }
    
    public void setDeducoes(Deducao[] deducoes){
      this.deducoes = deducoes;
    }
    
    public double getSalarioLiquido(){
    
        double salarioLiquido = getSalarioBruto();
        
        for (Deducao deducao : getDeducoes()) {
            salarioLiquido -= deducao.getValor();
        }
        
        return salarioLiquido;
    }
    
}
