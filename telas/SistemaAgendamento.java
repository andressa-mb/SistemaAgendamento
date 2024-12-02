package Atividade3.telas;

import javax.swing.table.DefaultTableModel;
import java.util.List;
import Atividade3.model.ListarPaciente;
import Atividade3.model.Paciente;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class SistemaAgendamento extends javax.swing.JFrame {

    public SistemaAgendamento() {
        initComponents();
        tbAgendamento.getSelectionModel().addListSelectionListener(event -> {
            int linhaSelecionada = tbAgendamento.getSelectedRow();
            if (linhaSelecionada != -1) {
                String consultaRealizada = tbAgendamento.getValueAt(linhaSelecionada, 5).toString();
                if (consultaRealizada.equals("Sim")) {
                    btnFinalizarConsulta.setEnabled(false);
                } else {
                    btnFinalizarConsulta.setEnabled(true);
                }
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelSistemaAg = new javax.swing.JPanel();
        lbTitulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbAgendamento = new javax.swing.JTable();
        btnNovaConsulta = new javax.swing.JButton();
        btnExcluirConsulta = new javax.swing.JButton();
        btnFinalizarConsulta = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbTitulo.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        lbTitulo.setText("Boas Vindas ao Sistema de Agendamento");

        String[] colunas = {"Nome", "CPF", "Telefone", "Data", "É Paciente?", "Consulta Realizada"};
        DefaultTableModel tabelaModelo = new DefaultTableModel(colunas, 0);
        List<Paciente> listaPacientes = ListarPaciente.Listar();
        for(int i = 0; i < listaPacientes.size(); i++){
            Paciente pacienteAtual = listaPacientes.get(i);
            //montamos a linha
            String[] linha = {
                pacienteAtual.getNome(),
                pacienteAtual.getCpf(),
                pacienteAtual.getTelefone(),
                pacienteAtual.getDataConsulta(),
                pacienteAtual.getEhCliente() ? "Sim" : "Não",
                pacienteAtual.getConsultaRealizada() ? "Sim" : "Não"
            };

            tabelaModelo.addRow(linha);
        }
        tbAgendamento.setModel(tabelaModelo);
        jScrollPane1.setViewportView(tbAgendamento);

        btnNovaConsulta.setText("Nova Consulta");
        btnNovaConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovaConsultaActionPerformed(evt);
            }
        });

        btnExcluirConsulta.setText("Excluir Consulta");
        btnExcluirConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirConsultaActionPerformed(evt);
            }
        });

        btnFinalizarConsulta.setText("Finalizar Consulta");
        btnFinalizarConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarConsultaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelSistemaAgLayout = new javax.swing.GroupLayout(panelSistemaAg);
        panelSistemaAg.setLayout(panelSistemaAgLayout);
        panelSistemaAgLayout.setHorizontalGroup(
            panelSistemaAgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSistemaAgLayout.createSequentialGroup()
                .addGroup(panelSistemaAgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelSistemaAgLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(panelSistemaAgLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(lbTitulo)
                        .addGap(0, 29, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(panelSistemaAgLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(btnNovaConsulta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnExcluirConsulta)
                .addGap(137, 137, 137)
                .addComponent(btnFinalizarConsulta)
                .addGap(47, 47, 47))
        );
        panelSistemaAgLayout.setVerticalGroup(
            panelSistemaAgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSistemaAgLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelSistemaAgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovaConsulta)
                    .addComponent(btnExcluirConsulta)
                    .addComponent(btnFinalizarConsulta))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelSistemaAg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelSistemaAg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNovaConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovaConsultaActionPerformed
        CadastrarConsulta cadastro = new CadastrarConsulta();
        cadastro.setVisible(true);
        cadastro.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_btnNovaConsultaActionPerformed

    private void btnExcluirConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirConsultaActionPerformed

        try {
            DefaultTableModel tabela = (DefaultTableModel) tbAgendamento.getModel();

            int linhaSelecionada = tbAgendamento.getSelectedRow();

            if (linhaSelecionada != -1) {
                ListarPaciente.Listar().remove(linhaSelecionada);

                tabela.removeRow(linhaSelecionada);
                JOptionPane.showMessageDialog(null, "Consulta excluída com sucesso.");
            } else {
                JOptionPane.showMessageDialog(null, "Selecione uma consulta para excluir.");
            }
        } catch (IllegalStateException e) {
            JOptionPane.showMessageDialog(null, "Erro ao executar a exclusão." + e);
        }

    }//GEN-LAST:event_btnExcluirConsultaActionPerformed

    private void btnFinalizarConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarConsultaActionPerformed
        try {
            DefaultTableModel tabela = (DefaultTableModel) tbAgendamento.getModel();
            int linhaSelecionada = tbAgendamento.getSelectedRow();
            if (linhaSelecionada != -1) {
                String nomePaciente = tabela.getValueAt(linhaSelecionada, 0).toString();
                String consultaRealizada = tabela.getValueAt(linhaSelecionada, 5).toString();

                DetalhesConsulta detalhesConsulta = new DetalhesConsulta(nomePaciente, consultaRealizada, linhaSelecionada);
                detalhesConsulta.setVisible(true);

            }
        } catch (IllegalStateException e) {
            JOptionPane.showMessageDialog(null, "Erro ao finalizar consulta. " + e);
        }
    }//GEN-LAST:event_btnFinalizarConsultaActionPerformed

    public static void addRowTable(Object[] dataRow) {
        DefaultTableModel tabela = (DefaultTableModel) tbAgendamento.getModel();
        tabela.addRow(dataRow);
    }

    public static void atualizarTabela(int linhaSelecionada, String consultaRealizada) {
        DefaultTableModel tabela = (DefaultTableModel) tbAgendamento.getModel();
        tabela.setValueAt(consultaRealizada, linhaSelecionada, 5);
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
            java.util.logging.Logger.getLogger(SistemaAgendamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SistemaAgendamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SistemaAgendamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SistemaAgendamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SistemaAgendamento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExcluirConsulta;
    private javax.swing.JButton btnFinalizarConsulta;
    private javax.swing.JButton btnNovaConsulta;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JPanel panelSistemaAg;
    private static javax.swing.JTable tbAgendamento;
    // End of variables declaration//GEN-END:variables

}
