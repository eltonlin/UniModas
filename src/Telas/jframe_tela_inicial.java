package Telas;


import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class jframe_tela_inicial extends javax.swing.JFrame {

    /**
     * Creates new form jframe_tela_inicial
     */
    public jframe_tela_inicial() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton_logar = new javax.swing.JButton();
        jLabel_gif = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(908, 720));
        setPreferredSize(new java.awt.Dimension(908, 720));
        getContentPane().setLayout(null);

        jButton_logar.setBackground(new java.awt.Color(187, 222, 242));
        jButton_logar.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton_logar.setForeground(new java.awt.Color(0, 0, 255));
        jButton_logar.setText("Login");
        jButton_logar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_logarActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_logar);
        jButton_logar.setBounds(350, 270, 170, 40);

        jLabel_gif.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/gif_tela1.gif"))); // NOI18N
        getContentPane().add(jLabel_gif);
        jLabel_gif.setBounds(180, 350, 520, 320);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/tela1.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, -10, 890, 690);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_logarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_logarActionPerformed
       
        jframe_tela_menu1 menu_1 = new jframe_tela_menu1();
        menu_1.setLocationRelativeTo(null);
        menu_1.setVisible(true);
        dispose();
        
        
    }//GEN-LAST:event_jButton_logarActionPerformed

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
            java.util.logging.Logger.getLogger(jframe_tela_inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jframe_tela_inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jframe_tela_inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jframe_tela_inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {                
                jframe_tela_inicial jframe_tela_inicial = new jframe_tela_inicial();
                jframe_tela_inicial.setLocationRelativeTo(null);
                jframe_tela_inicial.setVisible(true);               

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_logar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel_gif;
    // End of variables declaration//GEN-END:variables
}
