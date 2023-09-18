/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.sistemasvendas_2_0;

import com.mycompany.controle.ControleSistema;
import com.mycompany.outros.Constantes;
import com.mycompany.visao.VisaoMenu;

/**
 *
 * @author mileny.1948
 */
public class SistemasVendas_2_0 {
    public static void main(String[] args) {
       int opcaoMenu;
       
        while(true){
          opcaoMenu  = VisaoMenu.menuPrincipal();
          
          if(opcaoMenu == Constantes.CADASTRAR){
              ControleSistema.cadastrar();
          }else if(opcaoMenu == Constantes.ALTERAR){
              ControleSistema.alterar(VisaoMenu.menuAlteracaoProduto());
          }else if(opcaoMenu == Constantes.REMOVER){
               ControleSistema.remover(VisaoMenu.menuRemocaoProduto());
          }else if(opcaoMenu == Constantes.LISTAR){
              ControleSistema.listar(ControleSistema.produtos);
          }else if(opcaoMenu == Constantes.VENDER){
              ControleSistema.vender(VisaoMenu.menuVenderProduto());
          }
        }
    }   
}
