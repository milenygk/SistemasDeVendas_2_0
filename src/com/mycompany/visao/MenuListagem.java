/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.visao;

import com.mycompany.controle.ControleSistema;
import com.mycompany.modelo.Celular;
import com.mycompany.modelo.Computador;
import com.mycompany.modelo.Televisao;
import com.mycompany.modelo.VideoGame;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mileny.1948
 */
public class MenuListagem extends javax.swing.JFrame {

    /**
     * Creates new form MunuListagem
     */
    public MenuListagem() {
        initComponents();
        
        listarTodos();
    }
    
    public void listarTodos(){
        if(!ControleSistema.produtos.isEmpty()){
            DefaultTableModel defaultTableMode1 = new DefaultTableModel();

            defaultTableMode1.addColumn("Informações");
            defaultTableMode1.addColumn("Categoria");

            tableListagem.setModel(defaultTableMode1);

            defaultTableMode1.setRowCount(0);

            for(int i = 0; i < ControleSistema.produtos.size(); i++){
    //           tableListagem.append(ControleSistema.produtos.get(i).toString() + "\n");
                 Object[] linha = new Object[defaultTableMode1.getColumnCount()];
                 defaultTableMode1.addRow(linha);

                 if(ControleSistema.produtos.get(i) instanceof Computador){
                     tableListagem.setValueAt(((Computador)ControleSistema.produtos.get(i)), i, 0);
                     tableListagem.setValueAt("Computador", i, 1);

                 }else if(ControleSistema.produtos.get(i) instanceof VideoGame){
                     tableListagem.setValueAt(((VideoGame)ControleSistema.produtos.get(i)), i, 0);
                     tableListagem.setValueAt("Video Game", i, 1);

                 }else if(ControleSistema.produtos.get(i) instanceof Televisao){
                     tableListagem.setValueAt(((Televisao)ControleSistema.produtos.get(i)), i, 0);
                     tableListagem.setValueAt("Televisão", i, 1);

                 }else if(ControleSistema.produtos.get(i) instanceof Celular){
                     tableListagem.setValueAt(((Celular)ControleSistema.produtos.get(i)), i, 0);
                     tableListagem.setValueAt("Celular", i, 1); 
                 }
            }
        }
}
    
    public void listarComputador(){
        if(!ControleSistema.produtos.isEmpty()){
            DefaultTableModel defaultTableModel = new DefaultTableModel();
            
            defaultTableModel.addColumn("Nome: ");
            defaultTableModel.addColumn("Preço: ");
            defaultTableModel.addColumn("Memória RAM: ");
            defaultTableModel.addColumn("Processador: ");
            
            tableListagem.setModel(defaultTableModel);
            
            defaultTableModel.setRowCount(0);
            int linhaCont = 0;
            for(int i = 0; i < ControleSistema.produtos.size(); i++){
                if(ControleSistema.produtos.get(i) instanceof Computador){
                    Object[] linha = new Object[defaultTableModel.getRowCount()];
                    defaultTableModel.addRow(linha);
                    
                    tableListagem.setValueAt(((Computador)ControleSistema.produtos.get(i)).getNome(), linhaCont, 0);
                    tableListagem.setValueAt(((Computador)ControleSistema.produtos.get(i)).getPreco(), linhaCont, 1);
                    tableListagem.setValueAt(((Computador)ControleSistema.produtos.get(i)).getMemoriaRam(), linhaCont, 2);
                    tableListagem.setValueAt(((Computador)ControleSistema.produtos.get(i)).getProcessador(), linhaCont, 3);
                    
                    linhaCont++;
                }
            }
        }
    }
        public void listarVideoGame(){
        if(!ControleSistema.produtos.isEmpty()){
            DefaultTableModel defaultTableModel = new DefaultTableModel();
            
            defaultTableModel.addColumn("Nome: ");
            defaultTableModel.addColumn("Preço: ");
            defaultTableModel.addColumn("Plataforma: ");
            
            tableListagem.setModel(defaultTableModel);
            
            defaultTableModel.setRowCount(0);
            int linhaCont = 0;
            for(int i = 0; i < ControleSistema.produtos.size(); i++){
                if(ControleSistema.produtos.get(i) instanceof VideoGame){
                    Object[] linha = new Object[defaultTableModel.getRowCount()];
                    defaultTableModel.addRow(linha);
                    
                    tableListagem.setValueAt(((VideoGame)ControleSistema.produtos.get(i)).getNome(), linhaCont, 0);
                    tableListagem.setValueAt(((VideoGame)ControleSistema.produtos.get(i)).getPreco(), linhaCont, 1);
                    tableListagem.setValueAt(((VideoGame)ControleSistema.produtos.get(i)).getPlataforma(), linhaCont, 2);                   
                    
                    linhaCont++;
                }
            }
        }
    }
        
         public void listarTelevisao(){
        if(!ControleSistema.produtos.isEmpty()){
            DefaultTableModel defaultTableModel = new DefaultTableModel();
            
            defaultTableModel.addColumn("Nome: ");
            defaultTableModel.addColumn("Preço: ");
            defaultTableModel.addColumn("Polegadas: ");
            
            tableListagem.setModel(defaultTableModel);
            
            defaultTableModel.setRowCount(0);
            int linhaCont = 0;
            for(int i = 0; i < ControleSistema.produtos.size(); i++){
                if(ControleSistema.produtos.get(i) instanceof Televisao){
                    Object[] linha = new Object[defaultTableModel.getRowCount()];
                    defaultTableModel.addRow(linha);
                    
                    tableListagem.setValueAt(((Televisao)ControleSistema.produtos.get(i)).getNome(), linhaCont, 0);
                    tableListagem.setValueAt(((Televisao)ControleSistema.produtos.get(i)).getPreco(), linhaCont, 1);
                    tableListagem.setValueAt(((Televisao)ControleSistema.produtos.get(i)).getPolegadas(), linhaCont, 2);                   
                    
                    linhaCont++;
                }
            }
        }
    }
         
   public void listarCelular(){
        if(!ControleSistema.produtos.isEmpty()){
            DefaultTableModel defaultTableModel = new DefaultTableModel();
            
            defaultTableModel.addColumn("Nome: ");
            defaultTableModel.addColumn("Preço: ");
            defaultTableModel.addColumn("Memória RAM: ");
            defaultTableModel.addColumn("Armazenamento: ");
            
            tableListagem.setModel(defaultTableModel);
            
            defaultTableModel.setRowCount(0);
            int linhaCont = 0;
            for(int i = 0; i < ControleSistema.produtos.size(); i++){
                if(ControleSistema.produtos.get(i) instanceof Celular){
                    Object[] linha = new Object[defaultTableModel.getRowCount()];
                    defaultTableModel.addRow(linha);
                    
                    tableListagem.setValueAt(((Celular)ControleSistema.produtos.get(i)).getNome(), linhaCont, 0);
                    tableListagem.setValueAt(((Celular)ControleSistema.produtos.get(i)).getPreco(), linhaCont, 1);
                    tableListagem.setValueAt(((Celular)ControleSistema.produtos.get(i)).getMemoriaRam(), linhaCont, 2); 
                    tableListagem.setValueAt(((Celular)ControleSistema.produtos.get(i)).getArmazenamento(), linhaCont, 3);
                    
                    linhaCont++;
                }
            }
        }
    }
        
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cbCategorias = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableListagem = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        cbCategorias.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "Computador", "Video Game ", "Televisão", "Celular", " " }));
        cbCategorias.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbCategoriasItemStateChanged(evt);
            }
        });
        cbCategorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCategoriasActionPerformed(evt);
            }
        });

        tableListagem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Preço", "Memoria RAM", "Procesador"
            }
        ));
        jScrollPane1.setViewportView(tableListagem);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cbCategorias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 286, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbCategorias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbCategoriasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbCategoriasItemStateChanged
        switch(cbCategorias.getSelectedIndex()){
            case 0: 
                listarTodos();
                break;
            case 1:
                listarComputador();
                  break;
            case 2:
                listarVideoGame();
                  break;    
            case 3:
                listarTelevisao();
                  break;  
            case 4:
                listarCelular();
                  break;  
        }
    }//GEN-LAST:event_cbCategoriasItemStateChanged

    private void cbCategoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCategoriasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbCategoriasActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuListagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuListagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuListagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuListagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuListagem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbCategorias;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableListagem;
    // End of variables declaration//GEN-END:variables
}
