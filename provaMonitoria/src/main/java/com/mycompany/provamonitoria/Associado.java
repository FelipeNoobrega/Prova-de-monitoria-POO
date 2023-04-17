/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.provamonitoria;

/**
 *
 * @author Felipe
 */
public class Associado {
    private String cod;
    private String date;

    public Associado() {
    }

    public Associado(String cod, String date) {
        this.cod = cod;
        this.date = date;
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Associado{" + "cod=" + cod + ", date=" + date + '}';
    }
    
    
    
}
