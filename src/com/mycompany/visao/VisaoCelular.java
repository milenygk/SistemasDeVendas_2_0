/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.visao;

import com.mycompany.modelo.Celular;
import java.util.Scanner;

/**
 *
 * @author mileny.1948
 */
public class VisaoCelular {
   public static Celular menuCadastroCelular(){
       Celular celular = new Celular();
       
        System.out.println("Nome: ");
        celular.setNome(new Scanner(System.in).nextLine());
         System.out.println("Preço: ");
        celular.setPreco(new Scanner(System.in).nextDouble());
        System.out.println("Memória Ram: ");
        celular.setMemoriaRam(new Scanner(System.in).nextDouble());
        System.out.println("Amazenamento: ");
        celular.setArmazenamento(new Scanner(System.in).nextLine());
        System.out.println("-------------------------------------------------");
        
        return celular;
   }
}
