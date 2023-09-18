/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.modelo;

/**
 *
 * @author mileny.1948
 */
public class Televisao extends Produto{
    private String polegadas;

    public Televisao() {
    }

    public Televisao(String polegadas) {
        this.polegadas = polegadas;
    }

    public String getPolegadas() {
        return polegadas;
    }

    public void setPolegadas(String polegadas) {
        this.polegadas = polegadas;
    }
    
     @Override
    public String toString() {
        return  "Nome: " + super.getNome() + 
                " | Preço: " + super.getPreco() +
                " | Polegadas: " + this.polegadas;
    } 
}
