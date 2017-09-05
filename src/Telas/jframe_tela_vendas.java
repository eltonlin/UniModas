package Telas;

import ClassesBasicas.Cliente;
import ClassesBasicas.ListaItens;
import ClassesBasicas.Produto;
import ClassesBasicas.Vendedor;
import Dao.DaoListaItens;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class jframe_tela_vendas extends javax.swing.JFrame {
   ArrayList<ListaItens> lista; 
   ArrayList<Vendedor> listaVendedor;   
   static Cliente c = new Cliente();
   Vendedor v = new Vendedor();
   boolean check = false;
   
    /**
     * Creates new form jframe_tela_vendas
     */
    public jframe_tela_vendas() {
        initComponents();
        listarVendedor();        
        
        
    }

   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel_cod_vendedor = new javax.swing.JLabel();
        jLabel_cpf_cliente = new javax.swing.JLabel();
        jTextField_cpf_cliente = new javax.swing.JTextField();
        jLabel_nome_cliente = new javax.swing.JLabel();
        jTextField_nome_cliente = new javax.swing.JTextField();
        jButton_finalizar = new javax.swing.JButton();
        jButton_remover = new javax.swing.JButton();
        jButton_adicionar = new javax.swing.JButton();
        jComboBoxVendedor = new javax.swing.JComboBox<>();
        jScrollPane_compra = new javax.swing.JScrollPane();
        jTable_compra = new javax.swing.JTable();
        jButton_voltar = new javax.swing.JButton();
        jLabel_backgroud = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(908, 720));
        setPreferredSize(new java.awt.Dimension(908, 720));
        getContentPane().setLayout(null);

        jLabel_cod_vendedor.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel_cod_vendedor.setForeground(new java.awt.Color(0, 0, 255));
        jLabel_cod_vendedor.setText("Nome do vendedor:");
        getContentPane().add(jLabel_cod_vendedor);
        jLabel_cod_vendedor.setBounds(20, 120, 170, 22);

        jLabel_cpf_cliente.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel_cpf_cliente.setForeground(new java.awt.Color(0, 0, 255));
        jLabel_cpf_cliente.setText("CPF do cliente:");
        getContentPane().add(jLabel_cpf_cliente);
        jLabel_cpf_cliente.setBounds(20, 170, 170, 22);
        getContentPane().add(jTextField_cpf_cliente);
        jTextField_cpf_cliente.setBounds(150, 170, 180, 30);

        jLabel_nome_cliente.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel_nome_cliente.setForeground(new java.awt.Color(0, 0, 255));
        jLabel_nome_cliente.setText("Nome do cliente:");
        getContentPane().add(jLabel_nome_cliente);
        jLabel_nome_cliente.setBounds(340, 170, 170, 22);
        getContentPane().add(jTextField_nome_cliente);
        jTextField_nome_cliente.setBounds(480, 170, 390, 30);

        jButton_finalizar.setBackground(new java.awt.Color(187, 222, 242));
        jButton_finalizar.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton_finalizar.setForeground(new java.awt.Color(0, 0, 255));
        jButton_finalizar.setText("Efetuar pagamento");
        jButton_finalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_finalizarActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_finalizar);
        jButton_finalizar.setBounds(330, 590, 240, 50);

        jButton_remover.setBackground(new java.awt.Color(252, 182, 132));
        jButton_remover.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton_remover.setForeground(new java.awt.Color(255, 0, 0));
        jButton_remover.setText("Remover itens");
        jButton_remover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_removerActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_remover);
        jButton_remover.setBounds(460, 230, 210, 30);

        jButton_adicionar.setBackground(new java.awt.Color(187, 222, 242));
        jButton_adicionar.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton_adicionar.setForeground(new java.awt.Color(0, 0, 255));
        jButton_adicionar.setText("Adicionar itens");
        jButton_adicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_adicionarActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_adicionar);
        jButton_adicionar.setBounds(190, 230, 210, 30);

        jComboBoxVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxVendedorActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBoxVendedor);
        jComboBoxVendedor.setBounds(190, 120, 190, 30);

        jTable_compra.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        jTable_compra.setForeground(new java.awt.Color(0, 0, 255));
        jTable_compra.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Codigo:", "Tipo:", "Discrição:", "Tamanho:", "Quantidade:", "Preço unitario:", "Preço total:"
            }
        ));
        jTable_compra.setGridColor(new java.awt.Color(0, 0, 0));
        jTable_compra.setSelectionBackground(new java.awt.Color(255, 255, 255));
        jTable_compra.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jScrollPane_compra.setViewportView(jTable_compra);
        if (jTable_compra.getColumnModel().getColumnCount() > 0) {
            jTable_compra.getColumnModel().getColumn(0).setHeaderValue("Codigo:");
            jTable_compra.getColumnModel().getColumn(1).setHeaderValue("Tipo:");
            jTable_compra.getColumnModel().getColumn(2).setHeaderValue("Discrição:");
            jTable_compra.getColumnModel().getColumn(3).setHeaderValue("Tamanho:");
            jTable_compra.getColumnModel().getColumn(4).setHeaderValue("Quantidade:");
            jTable_compra.getColumnModel().getColumn(5).setHeaderValue("Preço unitario:");
            jTable_compra.getColumnModel().getColumn(6).setHeaderValue("Preço total:");
        }

        getContentPane().add(jScrollPane_compra);
        jScrollPane_compra.setBounds(20, 280, 860, 260);

        jButton_voltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icone_voltar.jpg"))); // NOI18N
        jButton_voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_voltarActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_voltar);
        jButton_voltar.setBounds(810, 30, 60, 60);

        jLabel_backgroud.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/tela2.jpg"))); // NOI18N
        getContentPane().add(jLabel_backgroud);
        jLabel_backgroud.setBounds(10, 0, 900, 690);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void cadastrarCliente(){
        try {
            Fachada fachada = new Fachada();                         
            c.setCpf(jTextField_cpf_cliente.getText());
            c.setNome_cliente(jTextField_nome_cliente.getText());            
            fachada.cadastrarCliente(c);
            check = true;
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }
    
    private void listarVendedor(){
        try {
            Fachada fachada = new Fachada();
            
            DefaultComboBoxModel model = new DefaultComboBoxModel();
            listaVendedor = fachada.listarVendedor();
            for (Vendedor vendedor : listaVendedor) {
                model.addElement(vendedor.getNomeVendedor());                
            }
            jComboBoxVendedor.setModel(model);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    private void jButton_voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_voltarActionPerformed

       jframe_tela_menu1 menu_1 = new jframe_tela_menu1();
        menu_1.setLocationRelativeTo(null);
        menu_1.setVisible(true);
        dispose();

    }//GEN-LAST:event_jButton_voltarActionPerformed

    private void jButton_adicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_adicionarActionPerformed
        jframe_adicionar_itens add = new jframe_adicionar_itens();
        add.setLocationRelativeTo(null);
        add.setVisible(true);
        this.dispose();
       
        
    }//GEN-LAST:event_jButton_adicionarActionPerformed

    private void jButton_finalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_finalizarActionPerformed
        jframe_pagamento pagto = new jframe_pagamento(lista);
       
       if(lista != null){ 
        cadastrarCliente();        
       }
       else{
            JOptionPane.showMessageDialog(null, "Preencha a lista de itens");
        }     
        
       
       if (check == true){
        pagto.setLocationRelativeTo(null);
        pagto.setVisible(true);   
        }else{
            JOptionPane.showMessageDialog(null, "Preencha o cadastro de Cliente");
        }     
       
              
              
        
    }//GEN-LAST:event_jButton_finalizarActionPerformed

    private void jComboBoxVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxVendedorActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jComboBoxVendedorActionPerformed

    private void jButton_removerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_removerActionPerformed
        // TODO add your handling code here:
        try {
          DefaultTableModel dtm = (DefaultTableModel)jTable_compra.getModel();
        if (jTable_compra.getSelectedRow() >= 0){
            lista.remove(jTable_compra.getSelectedRow()); 
            dtm.removeRow(jTable_compra.getSelectedRow());           
            jTable_compra.setModel(dtm);
        }else{
            JOptionPane.showMessageDialog(null, "Favor selecionar uma linha");
        }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
    }//GEN-LAST:event_jButton_removerActionPerformed
    public void alteraModel(DefaultTableModel model){
        jTable_compra.setModel(model);       
    }
    
    public void recebeLista(ArrayList<ListaItens> l){
        lista = l ;
    }
    public Cliente retornaCliente(){        
       return c;
    }
    public Vendedor retornaVendedor(){
        Vendedor v = new Vendedor();
        v = listaVendedor.get(jComboBoxVendedor.getSelectedIndex()); 
        return v;
    }
    
    
    
    
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
            java.util.logging.Logger.getLogger(jframe_tela_vendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jframe_tela_vendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jframe_tela_vendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jframe_tela_vendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jframe_tela_vendas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_adicionar;
    private javax.swing.JButton jButton_finalizar;
    private javax.swing.JButton jButton_remover;
    private javax.swing.JButton jButton_voltar;
    private javax.swing.JComboBox<String> jComboBoxVendedor;
    private javax.swing.JLabel jLabel_backgroud;
    private javax.swing.JLabel jLabel_cod_vendedor;
    private javax.swing.JLabel jLabel_cpf_cliente;
    private javax.swing.JLabel jLabel_nome_cliente;
    private javax.swing.JScrollPane jScrollPane_compra;
    private javax.swing.JTable jTable_compra;
    private javax.swing.JTextField jTextField_cpf_cliente;
    private javax.swing.JTextField jTextField_nome_cliente;
    // End of variables declaration//GEN-END:variables
}
