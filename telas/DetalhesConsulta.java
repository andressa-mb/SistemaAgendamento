/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Atividade3.telas;

import Atividade3.model.ListarPaciente;
import Atividade3.model.Paciente;
import javax.swing.JOptionPane;

/**
 *
 * @author aulas
 */
public class DetalhesConsulta extends javax.swing.JFrame {

    /**
     * Creates new form DetalhesConsulta
     */
    private static String consultaRealizada;
    private static String nomePaciente;
    private int linhaSelecionada;

    public DetalhesConsulta(String nome, String consultaRealizada, int linhaSelecionada) {
        initComponents();
        this.nomePaciente = nome;
        this.consultaRealizada = consultaRealizada;
        this.linhaSelecionada = linhaSelecionada;
        lbDetalhes.setText("Detalhes da Consulta - Paciente: " + nome);

        if (consultaRealizada.equals("Não")) {
            ckConsultaRealizada.setSelected(true);
            ckConsultaRealizada.setEnabled(false);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelDetalhes = new javax.swing.JPanel();
        lbDetalhes = new javax.swing.JLabel();
        ckConsultaRealizada = new javax.swing.JCheckBox();
        lbRecObs = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaRecObs = new javax.swing.JTextArea();
        btnFinalizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbDetalhes.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbDetalhes.setText("Detalhes da Consulta");

        ckConsultaRealizada.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ckConsultaRealizada.setSelected(true);
        ckConsultaRealizada.setText("Consulta Realizada");
        ckConsultaRealizada.setEnabled(false);

        lbRecObs.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbRecObs.setText("Receita e observações:");

        txaRecObs.setColumns(20);
        txaRecObs.setRows(5);
        jScrollPane1.setViewportView(txaRecObs);

        btnFinalizar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnFinalizar.setText("Finalizar");
        btnFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelDetalhesLayout = new javax.swing.GroupLayout(panelDetalhes);
        panelDetalhes.setLayout(panelDetalhesLayout);
        panelDetalhesLayout.setHorizontalGroup(
            panelDetalhesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDetalhesLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(panelDetalhesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnFinalizar)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbRecObs)
                    .addComponent(ckConsultaRealizada)
                    .addComponent(lbDetalhes))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        panelDetalhesLayout.setVerticalGroup(
            panelDetalhesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDetalhesLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lbDetalhes)
                .addGap(18, 18, 18)
                .addComponent(ckConsultaRealizada)
                .addGap(18, 18, 18)
                .addComponent(lbRecObs)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnFinalizar)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelDetalhes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelDetalhes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarActionPerformed
        try {
            if (txaRecObs.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Por favor, insira as observações antes de finalizar.");
                return;
            }
            Paciente paciente = ListarPaciente.Listar().get(linhaSelecionada);
            paciente.setConsultaRealizada(true);

            SistemaAgendamento.atualizarTabela(linhaSelecionada, "Sim");
            JOptionPane.showMessageDialog(null, "Consulta finalizada com sucesso.");
            dispose();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao finalizar consulta. " + e);
        }
    }//GEN-LAST:event_btnFinalizarActionPerformed

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
            java.util.logging.Logger.getLogger(DetalhesConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DetalhesConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DetalhesConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DetalhesConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DetalhesConsulta("Nome", "Não", 1).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFinalizar;
    private javax.swing.JCheckBox ckConsultaRealizada;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbDetalhes;
    private javax.swing.JLabel lbRecObs;
    private javax.swing.JPanel panelDetalhes;
    private javax.swing.JTextArea txaRecObs;
    // End of variables declaration//GEN-END:variables
}
