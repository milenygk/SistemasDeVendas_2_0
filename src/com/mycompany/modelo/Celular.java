/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.modelo;

/**
 *
 * @author mileny.1948
 */
public class Celular extends Produto{
     private Double memoriaRam;
     private String armazenamento;

    public Celular() {
    }

    public Double getMemoriaRam() {
        return memoriaRam;
    }

    public void setMemoriaRam(Double memoriaRam) {
        this.memoriaRam = memoriaRam;
    }

    public String getArmazenamento() {
        return armazenamento;
    }

    public void setArmazenamento(String armazenamento) {
        this.armazenamento = armazenamento;
    }

 @Override
    public String toString() {
        return  "Nome: " + super.getNome() + 
                " | Preço: " + super.getPreco() + 
                " | Memória Ram: " + this.memoriaRam + 
                " | Armazenamento: " + this.armazenamento;
    }  
 }
