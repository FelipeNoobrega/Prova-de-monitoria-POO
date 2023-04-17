/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.provamonitoria;

/**
 *
 * @author Felipe
 */
public class Pais {
    
    private String id, nome;
    
    public Pais() {}

    public Pais(String id, String nome) {
        this.id = id;
        this.nome = nome;
    }
    

    public String getId() {
        return id;
    }
    
    public void setId(String id){
        this.id = id;
    }

    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Pais{" + "id=" + id + ", nome=" + nome + '}';
    }
    
    
    
    
}
