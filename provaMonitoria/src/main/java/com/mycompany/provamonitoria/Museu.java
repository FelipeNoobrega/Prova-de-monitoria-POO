/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.provamonitoria;

import java.util.ArrayList;


/**
 *
 * @author Felipe
 */
public class Museu {
    private int cod;
    private String data, nome;
    private Cidade cidade;
    private ArrayList <Visita> visitas;

    public Museu() {
        visitas = new ArrayList();
    }

    public Museu(int cod, String data, String nome, Cidade cidade) {
        this.cod = cod;
        this.data = data;
        this.nome = nome;
        this.cidade = cidade;
        visitas = new ArrayList();
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    public ArrayList<Visita> getVisitas() {
        return visitas;
    }

    public void setVisitas(ArrayList<Visita> visitas) {
        this.visitas = visitas;
    }
    
    
    public void insereAtleta(Visita visita){
        visitas.add(visita);
    }
    public void removeAtleta(Visita visita) {
        visitas.remove(visita);
    }

    @Override
    public String toString() {
        return "Museu{" + "cod=" + cod + ", data=" + data + ", nome=" + nome + ", cidade=" + cidade + ", visitas=" + visitas + '}';
    }
    
    
    
}
