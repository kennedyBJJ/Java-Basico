/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package JFrame;

import ContaSrc.Conta;
import Crud.CRUD;
import java.text.ParseException;
import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Programa
     */
    public Menu() {
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

        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(640, 360));
        setPreferredSize(new java.awt.Dimension(640, 360));
        getContentPane().setLayout(null);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/JFrame/x4-uespi-logo.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(580, 290, 30, 40);

        jLabel4.setFont(new java.awt.Font("Montserrat", 1, 10)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 153, 153));
        jLabel4.setText("v.1.0.0.0");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(40, 310, 230, 13);

        jLabel2.setFont(new java.awt.Font("Montserrat", 1, 10)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 153));
        jLabel2.setText("Criado por João Vinicius e Willian Kennedy.");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(340, 310, 230, 13);

        jButton2.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 51, 153));
        jButton2.setText("Criar Conta");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(250, 130, 130, 22);

        jButton3.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 51, 153));
        jButton3.setText("Acessar Conta");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(250, 210, 130, 22);

        jButton4.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 51, 153));
        jButton4.setText("Listar Contas");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(250, 250, 130, 22);

        jButton5.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        jButton5.setForeground(new java.awt.Color(0, 51, 153));
        jButton5.setText("Excluir Conta");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(250, 170, 130, 22);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/JFrame/x1.png"))); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(640, 640));
        jLabel1.setMinimumSize(new java.awt.Dimension(640, 640));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 640, 360);

        setSize(new java.awt.Dimension(656, 398));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        CriarConta criarConta = new CriarConta();
        criarConta.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        ExcluirConta excluirConta = new ExcluirConta();
        excluirConta.setVisible(true);

    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:

        String c;
        int numero = 0;
        boolean repete;
        /*essa estrutura de repetição impede que o programa leia uma letra
          ou um número que não seja inteiro
         */
        do {
            try {
                c = JOptionPane.showInputDialog(null, "Digite o número da conta: ");
                numero = Integer.parseInt(c);
                repete = false;
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Digite um número válido!");
                repete = true;
            }
        } while (repete);

        /*o programa busca a conta a ser acessada,
          caso a encontre, abre a janela para realizar as operações
          caso não a encontre, informa ao usuário que a conta não foi encontrada
         */
        AcessarConta acessarConta;
        Conta conta = CRUD.acessarContaPorNumero(numero);
        if (conta != null) {

            try {
                acessarConta = new AcessarConta(conta);
                acessarConta.setVisible(true);
            } catch (ParseException ex) {
                JOptionPane.showMessageDialog(null, ex.toString());
            }

        } else {
            JOptionPane.showMessageDialog(null, "Conta não encontrada");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        AtualizarConta atualizarConta = new AtualizarConta();
        atualizarConta.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}