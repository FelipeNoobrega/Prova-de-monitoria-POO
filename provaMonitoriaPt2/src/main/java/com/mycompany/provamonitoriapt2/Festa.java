/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.provamonitoriapt2;

/**
 *
 * @author Felipe
 */
public class Festa {
    private String nomeCliente, dataFesta;
    private Combo combo;

    public Festa() {
    }

    public Festa(String nomeCliente, String dataFesta, Combo combo) {
        this.nomeCliente = nomeCliente;
        this.dataFesta = dataFesta;
        this.combo = combo;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getDataFesta() {
        return dataFesta;
    }

    public void setDataFesta(String dataFesta) {
        this.dataFesta = dataFesta;
    }

    public Combo getCombo() {
        return combo;
    }

    public void setCombo(Combo combo) {
        this.combo = combo;
    }

    @Override
    public String toString() {
        return "Festa{" + "nomeCliente=" + nomeCliente + ", dataFesta=" + dataFesta + ", combo=" + combo + '}';
    }
    
    
    
    
}
