/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.provamonitoria;

/**
 *
 * @author Felipe
 */
public class VisitanteAssociado extends Visitante {
    private Associado associado;

    public VisitanteAssociado() {
        associado = new Associado();
    }

    public VisitanteAssociado(String cpf, String nome, int telefone, Cidade cidade, String cod, String date) {
        super(cpf, nome, telefone, cidade);
        associado = new Associado(cod, date);
    }

    public Associado getAssociado() {
        return associado;
    }

    public void setAssociado(Associado associado) {
        this.associado = associado;
    }

    @Override
    public String toString() {
        return super.toString() + "VisitanteAssociado{" + "associado=" + associado + '}';
    }
    
    
    
}
