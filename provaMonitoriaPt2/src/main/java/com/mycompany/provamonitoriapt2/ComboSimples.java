/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.provamonitoriapt2;

/**
 *
 * @author Felipe
 */
public class ComboSimples extends Combo{

    public ComboSimples() {
    }
    
    public ComboSimples(int codigo, String tema, int qtBrinquedos) {
        super(codigo, tema, qtBrinquedos);
    }
    
    @Override
    public double valorDoAluguel() {
        return (super.getQtBrinquedos() * 100) + 500;
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
}
