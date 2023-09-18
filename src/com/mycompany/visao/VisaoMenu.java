/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.visao;

import com.mycompany.controle.ControleSistema;
import com.mycompany.modelo.Celular;
import com.mycompany.modelo.Computador;
import com.mycompany.modelo.Televisao;
import com.mycompany.modelo.VideoGame;
import java.util.Scanner;

/**
 *
 * @author mileny.1948
 */
public class VisaoMenu {
    public static int menuPrincipal(){
        System.out.println("=========SISTEMA DE VENDAS 2.0=========");
        System.out.println("1 - Cadastrar Produto");
        System.out.println("2 - Alterar Produto");
        System.out.println("3 - Remover Produto");
        System.out.println("4 - Listar Produtos");
        System.out.println("5 - Vender Produtos");
        
        System.out.println(" =======================================");
        int opcaoMenu = new Scanner(System.in).nextInt();
        
        return opcaoMenu;
    }
    
    public static int menuEscolhaProduto(){
        System.out.println("==========CADASTRAR PRODUTO==========");
        System.out.println("Qual categoria de produto deseja cadastrar?");
        System.out.println("1 - Video Game");
        System.out.println("2 - Computador");
        System.out.println("3 - Televisão");
        System.out.println("4 - Celular");
        System.out.println("=====================================");
        int opcaoProduto = new Scanner(System.in).nextInt();
        
        return opcaoProduto;
    }
    
    public static int menuAlteracaoProduto(){
        System.out.println("==========ALTERAR PRODUTO==========");
        System.out.println("Qual produto deseja alterar?");
        
        for(int i = 0; i < ControleSistema.produtos.size(); i++){
            System.out.println(i + 1 + " | " + ControleSistema.produtos.get(i));
        }
        
        System.out.println("====================================");
        int produtoAlterar = new Scanner(System.in).nextInt();
        
        return produtoAlterar;
    }
    
    public static Object menuAlteracaoProdutoInformacoes(Object object){
        if(object instanceof VideoGame){
            System.out.println("Novo nome: ");
            ((VideoGame) object).setNome(new Scanner(System.in).nextLine());
            System.out.println("Novo preço: ");
            ((VideoGame) object).setPreco(new Scanner(System.in).nextDouble());
            System.out.println("Nova plataforma: ");
            ((VideoGame) object).setPlataforma(new Scanner(System.in).nextLine());
        }else if(object instanceof Computador){
            System.out.println("Novo nome: ");
            ((Computador) object).setNome(new Scanner(System.in).nextLine());
            System.out.println("Novo preço: ");
            ((Computador) object).setPreco(new Scanner(System.in).nextDouble());
            System.out.println("Nova quantidade de memoria RAM: ");
           ((Computador) object).setMemoriaRam(new Scanner(System.in).nextDouble());
            System.out.println("Novo processador: ");
           ((Computador) object).setProcessador(new Scanner(System.in).nextLine());
        }else if(object instanceof Televisao){
             System.out.println("Novo nome: ");
            ((Televisao) object).setNome(new Scanner(System.in).nextLine());
            System.out.println("Novo preço: ");
            ((Televisao) object).setPreco(new Scanner(System.in).nextDouble());
            System.out.println("Nova quantidade de Polegadas: ");
           ((Televisao) object).setPolegadas(new Scanner(System.in).nextLine());
        }else if(object instanceof Celular){
            System.out.println("Novo nome: ");
            ((Celular) object).setNome(new Scanner(System.in).nextLine());
            System.out.println("Novo preço: ");
            ((Celular) object).setPreco(new Scanner(System.in).nextDouble());
            System.out.println("Nova quantidade de memoria RAM: ");
           ((Celular) object).setMemoriaRam(new Scanner(System.in).nextDouble());
            System.out.println("Nova quantidade de armazenamento: ");
           ((Celular) object).setArmazenamento(new Scanner(System.in).nextLine());
        }
        
        return object;
    }
    
     public static int menuRemocaoProduto(){
        System.out.println("==========REMOVER PRODUTO==========");
        System.out.println("Qual produto deseja remover?");
        
        for(int i = 0; i < ControleSistema.produtos.size(); i++){
            System.out.println(i + 1 + " | " + ControleSistema.produtos.get(i));
        }
        
        System.out.println("====================================");
        int produtoRemoover = new Scanner(System.in).nextInt();
        
        return produtoRemoover;
    }
     public static int menuVenderProduto(){
        System.out.println("==========VENDER PRODUTO==========");
        System.out.println("Qual produto deseja Vender?");
        
         for(int i = 0; i < ControleSistema.produtos.size(); i++){
            System.out.println(i + 1 + " | " + ControleSistema.produtos.get(i));
        }
        
        System.out.println("====================================");
        int produtoVender = new Scanner(System.in).nextInt();
        
//         System.out.println("Qual a quantidade do produto" +  +  " deseja vender? ");
//         System.out.println(quantidadeDeProduto);

        return produtoVender;
     }
}
