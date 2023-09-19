/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package JFrame;

import ContaSrc.Cliente;
import ContaSrc.Conta;
import Crud.CRUD;
import static Crud.CRUD.listaContas;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author LabII-06
 */
public class AtualizarConta extends javax.swing.JFrame {

    /**
     * Creates new form ExcluirConta
     */
    public AtualizarConta() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tbContas = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        btnListar = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        btnAtualizar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(java.awt.Color.black);
        setMaximizedBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setMinimumSize(null);
        setSize(new java.awt.Dimension(640, 360));
        getContentPane().setLayout(null);

        tbContas.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        tbContas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nome", "Cpf", "Número", "Tipo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbContas.setSelectionForeground(new java.awt.Color(153, 153, 153));
        jScrollPane1.setViewportView(tbContas);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(40, 112, 560, 180);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/JFrame/x3-recycle-bin.png"))); // NOI18N
        jButton1.setPreferredSize(new java.awt.Dimension(28, 38));
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(40, 70, 30, 30);

        btnListar.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        btnListar.setForeground(new java.awt.Color(0, 102, 153));
        btnListar.setText("Listar");
        btnListar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnListarMouseClicked(evt);
            }
        });
        btnListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarActionPerformed(evt);
            }
        });
        getContentPane().add(btnListar);
        btnListar.setBounds(180, 300, 80, 22);

        btnSair.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        btnSair.setForeground(new java.awt.Color(0, 102, 153));
        btnSair.setText("Sair");
        btnSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSairMouseClicked(evt);
            }
        });
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });
        getContentPane().add(btnSair);
        btnSair.setBounds(380, 300, 75, 22);

        btnAtualizar.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        btnAtualizar.setForeground(new java.awt.Color(0, 102, 153));
        btnAtualizar.setText("Atualizar");
        btnAtualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAtualizarMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnAtualizarMousePressed(evt);
            }
        });
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAtualizar);
        btnAtualizar.setBounds(277, 300, 76, 22);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/JFrame/x1.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 640, 360);

        setSize(new java.awt.Dimension(656, 398));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAtualizarActionPerformed

    private void btnListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_btnListarActionPerformed

    private void btnListarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnListarMouseClicked
        // TODO add your handling code here:
        DefaultTableModel modelo = (DefaultTableModel) tbContas.getModel();

        modelo.setNumRows(0);

        Cliente client;

        for (Conta conta : CRUD.listaContas) {
            client = conta.getCliente();
            modelo.addRow(new Object[]{
                client.getNome(),
                client.getCPF(),
                conta.getNumero(),
                conta.tipo()
            });

            modelo.addRow(new Object[]{
                "",
                "",
                "",
                ""
            });

        }


    }//GEN-LAST:event_btnListarMouseClicked

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSairMouseClicked
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_btnSairMouseClicked

    private void btnAtualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAtualizarMouseClicked
        // TODO add your handling code here:

        int posicao = tbContas.getSelectedRow();
        Object c = tbContas.getValueAt(posicao, 2);
        int elemento = Integer.parseInt(c.toString());

        DefaultTableModel modelo = (DefaultTableModel) tbContas.getModel();

        modelo.setNumRows(0);

        Cliente client;

        for (Conta conta : listaContas) {
            client = conta.getCliente();
            modelo.addRow(new Object[]{
                client.getNome(),
                client.getCPF(),
                conta.getNumero(),
                conta.tipo()
            });
        }
        CRUD.deletarContaPorNumero(elemento);

        CriarConta criarConta = new CriarConta();

        criarConta.setVisible(true);

    }//GEN-LAST:event_btnAtualizarMouseClicked

    private void btnAtualizarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAtualizarMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAtualizarMousePressed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        DefaultTableModel modelo = (DefaultTableModel) tbContas.getModel();
        modelo.setNumRows(0);

    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(AtualizarConta.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AtualizarConta.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AtualizarConta.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AtualizarConta.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AtualizarConta().setVisible(true);
            }

        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnListar;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbContas;
    // End of variables declaration//GEN-END:variables
}