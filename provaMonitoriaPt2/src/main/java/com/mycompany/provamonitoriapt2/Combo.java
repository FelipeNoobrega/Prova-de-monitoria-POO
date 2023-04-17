/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.provamonitoriapt2;

/**
 *
 * @author Felipe
 */
public abstract class Combo {
    private int codigo, qtBrinquedos;
    private String tema;
    
    public Combo() {}
    
    public Combo(int codigo, String tema, int qtBrinquedos) {
        this.codigo = codigo;
        this.tema = tema;
        this.qtBrinquedos = qtBrinquedos;
    }
    public int getCodigo() {
        return codigo;
    }
    
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    public String getTema() {
        return tema;
    }
    
    public void setTema(String tema) {
        this.tema = tema;
    }
    
    public int getQtBrinquedos() {
        return qtBrinquedos;
    }
    
    public void setQtBrinquedos(int qtBrinquedos) {
        this.qtBrinquedos = qtBrinquedos;
    }
    
    public abstract double valorDoAluguel();
        
}

   
