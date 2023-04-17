/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.provamonitoria;




/**
 *
 * @author Felipe
 * 
 */

public class Visita {
    private String hora, data;
    private Visitante visitante;

    public Visita() {
    }

    public Visita(String hora, String data, Visitante visitante) {
        this.hora = hora;
        this.data = data;
        this.visitante = visitante;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Visitante getVisitante() {
        return visitante;
    }

    public void setVisitante(Visitante visitante) {
        this.visitante = visitante;
    }

    @Override
    public String toString() {
        return "Visita{" + "hora=" + hora + ", data=" + data + ", visitante=" + visitante + '}';
    }
    
    
    
}
