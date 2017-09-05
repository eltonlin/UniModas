package Telas;

import ClassesBasicas.Produto;
import ClassesBasicas.Vendedor;
import java.util.ArrayList;
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
public class jframe_pesquisa_produto extends javax.swing.JFrame {
    ArrayList<Produto> arrayProduto;

    /**
     * Creates new form jframe_deletar_produto
     */
    public jframe_pesquisa_produto() {
        initComponents();
        listarProduto();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel_pesquisar_por2 = new javax.swing.JLabel();
        jButton_deletar = new javax.swing.JButton();
        jScrollPane_pesquisa = new javax.swing.JScrollPane();
        jTable_pesquisa = new javax.swing.JTable();
        jTextField_pesquisa = new javax.swing.JTextField();
        jButton_alterar = new javax.swing.JButton();
        jButton_voltar = new javax.swing.JButton();
        jButton_Atualizar = new javax.swing.JButton();
        jLabel_pesquisar_por3 = new javax.swing.JLabel();
        jButton_pesquisar = new javax.swing.JButton();
        jLabel_backgroud = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(590, 330));
        setUndecorated(true);
        getContentPane().setLayout(null);

        jLabel_pesquisar_por2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel_pesquisar_por2.setForeground(new java.awt.Color(0, 0, 255));
        jLabel_pesquisar_por2.setText("Tipo do produto:");
        getContentPane().add(jLabel_pesquisar_por2);
        jLabel_pesquisar_por2.setBounds(20, 70, 150, 22);

        jButton_deletar.setBackground(new java.awt.Color(252, 182, 132));
        jButton_deletar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton_deletar.setForeground(new java.awt.Color(255, 0, 0));
        jButton_deletar.setText("Deletar");
        jButton_deletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_deletarActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_deletar);
        jButton_deletar.setBounds(300, 260, 130, 30);

        jTable_pesquisa.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        jTable_pesquisa.setForeground(new java.awt.Color(0, 0, 255));
        jTable_pesquisa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Codigo:", "Tipo:", "Cor:", "Descrição:", "Tamanho:", "Preço unitario:"
            }
        ));
        jTable_pesquisa.setGridColor(new java.awt.Color(0, 0, 0));
        jTable_pesquisa.setSelectionBackground(new java.awt.Color(255, 255, 255));
        jTable_pesquisa.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jScrollPane_pesquisa.setViewportView(jTable_pesquisa);

        getContentPane().add(jScrollPane_pesquisa);
        jScrollPane_pesquisa.setBounds(10, 120, 570, 110);
        getContentPane().add(jTextField_pesquisa);
        jTextField_pesquisa.setBounds(130, 70, 180, 30);

        jButton_alterar.setBackground(new java.awt.Color(187, 222, 242));
        jButton_alterar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton_alterar.setForeground(new java.awt.Color(0, 0, 255));
        jButton_alterar.setText("Alterar");
        jButton_alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_alterarActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_alterar);
        jButton_alterar.setBounds(160, 260, 130, 30);

        jButton_voltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icone_voltar.jpg"))); // NOI18N
        jButton_voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_voltarActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_voltar);
        jButton_voltar.setBounds(520, 10, 60, 60);

        jButton_Atualizar.setBackground(new java.awt.Color(187, 222, 242));
        jButton_Atualizar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton_Atualizar.setForeground(new java.awt.Color(0, 0, 255));
        jButton_Atualizar.setText("Atualizar");
        jButton_Atualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_AtualizarActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_Atualizar);
        jButton_Atualizar.setBounds(450, 70, 110, 30);

        jLabel_pesquisar_por3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel_pesquisar_por3.setForeground(new java.awt.Color(0, 0, 255));
        jLabel_pesquisar_por3.setText("Pesquisar por:");
        getContentPane().add(jLabel_pesquisar_por3);
        jLabel_pesquisar_por3.setBounds(240, 10, 120, 22);

        jButton_pesquisar.setBackground(new java.awt.Color(187, 222, 242));
        jButton_pesquisar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton_pesquisar.setForeground(new java.awt.Color(0, 0, 255));
        jButton_pesquisar.setText("Pesquisar");
        jButton_pesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_pesquisarActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_pesquisar);
        jButton_pesquisar.setBounds(320, 70, 120, 30);

        jLabel_backgroud.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/tela3.png"))); // NOI18N
        getContentPane().add(jLabel_backgroud);
        jLabel_backgroud.setBounds(0, -10, 590, 360);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void listarProduto(){
        
                try {
        Fachada fachada = new Fachada();
        Produto produto = new Produto();
        produto.setTipoProduto(jTextField_pesquisa.getText());
        arrayProduto = fachada.listarProduto();
        if (arrayProduto.size() == 0){
            JOptionPane.showMessageDialog(null, "Não existe este produto");
        }
        else{
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(new String[]{"Código:","Tipo:","Cor:","Discrição:", "Tamanho:", "Preço unitário:"});
        for(Produto p : arrayProduto){
            model.addRow(new String[] {String.valueOf(p.getCodProduto()),p.getTipoProduto(),p.getCorProduto() , p.getDescricaoProduto(), p.getTamanhoProduto(), String.valueOf(p.getValorUnitarioProduto())});            
        }
        jTable_pesquisa.setModel(model);
        }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
    
        }
        
    }
    private void jButton_voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_voltarActionPerformed
        
        this.dispose();
        
    }//GEN-LAST:event_jButton_voltarActionPerformed

    private void jButton_deletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_deletarActionPerformed
       
        try {
            if(jTable_pesquisa.getSelectedRow() > -1 ){
                Fachada fachada = new Fachada();
                Produto p = new Produto();
                p = arrayProduto.get(jTable_pesquisa.getSelectedRow());
                fachada.deletarProduto(p);
                JOptionPane.showMessageDialog(null, "Deletado com Sucesso");
            }
            else {
                JOptionPane.showMessageDialog(null, "Selecione uma linha");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Deletado com Sucesso");
        }
        
    }//GEN-LAST:event_jButton_deletarActionPerformed

    private void jButton_alterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_alterarActionPerformed
       
      try {
            // TODO add your handling code here:
            if (jTable_pesquisa.getSelectedRow() > -1) {                
                Produto p = arrayProduto.get(jTable_pesquisa.getSelectedRow());
                jframe_tela_atu_produto atu_prod = new jframe_tela_atu_produto(p);
               atu_prod.setVisible(true);
                
            } else {
                JOptionPane.showMessageDialog(rootPane, "Por favor selecionar uma linha ");
            }
          }
          catch(Exception e ) {
                     JOptionPane.showMessageDialog(rootPane, e.getMessage());
             }     
        
    }//GEN-LAST:event_jButton_alterarActionPerformed

    private void jButton_AtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_AtualizarActionPerformed
        listarProduto();

    }//GEN-LAST:event_jButton_AtualizarActionPerformed

    private void jButton_pesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_pesquisarActionPerformed
        
        
        try {
        Fachada fachada = new Fachada();
        Produto produto = new Produto();
        produto.setTipoProduto(jTextField_pesquisa.getText());
        arrayProduto = fachada.pesquisarProduto(produto);
        if (arrayProduto.size() == 0){
            JOptionPane.showMessageDialog(null, "Não existe este produto");
        }
        else{
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(new String[]{"Código:","Tipo:","Cor:","Discrição:", "Tamanho:", "Preço unitário:"});
        for(Produto p : arrayProduto){
            model.addRow(new String[] {String.valueOf(p.getCodProduto()),p.getTipoProduto(),p.getCorProduto() , p.getDescricaoProduto(), p.getTamanhoProduto(), String.valueOf(p.getValorUnitarioProduto())});            
        }
        jTable_pesquisa.setModel(model);
        }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
    
        }
        
        
    }//GEN-LAST:event_jButton_pesquisarActionPerformed

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
            java.util.logging.Logger.getLogger(jframe_pesquisa_produto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jframe_pesquisa_produto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jframe_pesquisa_produto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jframe_pesquisa_produto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jframe_pesquisa_produto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Atualizar;
    private javax.swing.JButton jButton_alterar;
    private javax.swing.JButton jButton_deletar;
    private javax.swing.JButton jButton_pesquisar;
    private javax.swing.JButton jButton_voltar;
    private javax.swing.JLabel jLabel_backgroud;
    private javax.swing.JLabel jLabel_pesquisar_por2;
    private javax.swing.JLabel jLabel_pesquisar_por3;
    private javax.swing.JScrollPane jScrollPane_pesquisa;
    private javax.swing.JTable jTable_pesquisa;
    private javax.swing.JTextField jTextField_pesquisa;
    // End of variables declaration//GEN-END:variables
}
