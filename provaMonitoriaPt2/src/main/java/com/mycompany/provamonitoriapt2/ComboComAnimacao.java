/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.provamonitoriapt2;

/**
 *
 * @author Felipe
 */
public class ComboComAnimacao extends Combo{
    private int qtdAnimador;

    public ComboComAnimacao() {
    }
    
    public ComboComAnimacao(int codigo, String tema, int qtBrinquedos, int qtdAnimador) {
        super(codigo, tema, qtBrinquedos);
        this.qtdAnimador = qtdAnimador;
    }

    public int getQtdAnimador() {
        return qtdAnimador;
    }

    public void setQtdAnimador(int qtdAnimador) {
        this.qtdAnimador = qtdAnimador;
    }
    
    @Override
    public double valorDoAluguel() {
        return 500 + (super.getQtBrinquedos() * 100) + (qtdAnimador * 150);
    }

    @Override
    public String toString() {
        return super.toString() + "ComboComAnimacao{" + "qtdAnimador=" + qtdAnimador + '}';
    }
     
    
}
