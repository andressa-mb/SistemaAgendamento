package Atividade3.telas;

import Atividade3.model.ListarPaciente;
import Atividade3.model.Paciente;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class CadastrarConsulta extends javax.swing.JFrame {

    public CadastrarConsulta() {

        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelCadastrarConsulta = new javax.swing.JPanel();
        panelCadastro = new javax.swing.JPanel();
        lbCadastro = new javax.swing.JLabel();
        lbTelefone = new javax.swing.JLabel();
        lbNome = new javax.swing.JLabel();
        lbCpf = new javax.swing.JLabel();
        lbData = new javax.swing.JLabel();
        ckEhPaciente = new javax.swing.JCheckBox();
        btnCadastrar = new javax.swing.JButton();
        txNome = new javax.swing.JTextField();
        txTelefone = new javax.swing.JTextField();
        txCpf = new javax.swing.JTextField();
        txData = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbCadastro.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lbCadastro.setText("Cadastrar Consulta");

        lbTelefone.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbTelefone.setText("Telefone:");

        lbNome.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbNome.setText("Nome do(a) paciente:");

        lbCpf.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbCpf.setText("CPF:");

        lbData.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbData.setText("Data da consulta:");

        ckEhPaciente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ckEhPaciente.setText("Já é paciente?");
        ckEhPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ckEhPacienteActionPerformed(evt);
            }
        });

        btnCadastrar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelCadastroLayout = new javax.swing.GroupLayout(panelCadastro);
        panelCadastro.setLayout(panelCadastroLayout);
        panelCadastroLayout.setHorizontalGroup(
            panelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCadastroLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(panelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ckEhPaciente)
                    .addComponent(lbCadastro)
                    .addGroup(panelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(panelCadastroLayout.createSequentialGroup()
                            .addComponent(btnCadastrar)
                            .addGap(250, 250, 250))
                        .addGroup(panelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(panelCadastroLayout.createSequentialGroup()
                                .addComponent(lbData)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txData, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelCadastroLayout.createSequentialGroup()
                                .addComponent(lbCpf)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelCadastroLayout.createSequentialGroup()
                                .addComponent(lbTelefone)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelCadastroLayout.createSequentialGroup()
                                .addComponent(lbNome)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txNome, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        panelCadastroLayout.setVerticalGroup(
            panelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCadastroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbCadastro)
                .addGap(12, 12, 12)
                .addGroup(panelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNome)
                    .addComponent(txNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTelefone)
                    .addComponent(txTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCpf)
                    .addComponent(txCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbData)
                    .addComponent(txData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(ckEhPaciente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(btnCadastrar)
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout panelCadastrarConsultaLayout = new javax.swing.GroupLayout(panelCadastrarConsulta);
        panelCadastrarConsulta.setLayout(panelCadastrarConsultaLayout);
        panelCadastrarConsultaLayout.setHorizontalGroup(
            panelCadastrarConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelCadastrarConsultaLayout.setVerticalGroup(
            panelCadastrarConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCadastrarConsulta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCadastrarConsulta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        try {
            if (!emptyFields()) {
                if (!formatFields()) {

                    System.out.println("Campos preenchidos");
                    Paciente paciente = new Paciente();

                    paciente.setNome(txNome.getText());
                    paciente.setTelefone(txTelefone.getText());
                    paciente.setCpf(txCpf.getText());
                    paciente.setDataConsulta(txData.getText());
                    paciente.setConsultaRealizada(consultaRealizada());
                    boolean consReal = paciente.getConsultaRealizada();

                    if (ckEhPaciente.isSelected()) {
                        paciente.setEhCliente(true);
                    } else {
                        paciente.setEhCliente(false);
                    }

                    ListarPaciente.Adicionar(paciente);

                    SistemaAgendamento.addRowTable(new Object[]{
                        txNome.getText(),
                        txCpf.getText(),
                        txTelefone.getText(),
                        txData.getText(),
                        ckEhPaciente.isSelected() ? "Sim" : "Não",
                        consReal ? "Sim" : "Não"
                    });
                    dispose();
                }

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar consulta. " + e);
        }

    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void ckEhPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckEhPacienteActionPerformed

    }//GEN-LAST:event_ckEhPacienteActionPerformed

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
            java.util.logging.Logger.getLogger(CadastrarConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastrarConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastrarConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastrarConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastrarConsulta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JCheckBox ckEhPaciente;
    private javax.swing.JLabel lbCadastro;
    private javax.swing.JLabel lbCpf;
    private javax.swing.JLabel lbData;
    private javax.swing.JLabel lbNome;
    private javax.swing.JLabel lbTelefone;
    private javax.swing.JPanel panelCadastrarConsulta;
    private javax.swing.JPanel panelCadastro;
    private javax.swing.JTextField txCpf;
    private javax.swing.JTextField txData;
    private javax.swing.JTextField txNome;
    private javax.swing.JTextField txTelefone;
    // End of variables declaration//GEN-END:variables

    public boolean emptyFields() {
        boolean empty = false;
        List<String> errosCamposVazios = new ArrayList<>();

        if (txNome.getText().isEmpty()) {
            errosCamposVazios.add("Nome");
            empty = true;
        }
        if (txTelefone.getText().isEmpty()) {
            errosCamposVazios.add("Telefone");
            empty = true;
        }
        if (txCpf.getText().isEmpty()) {
            errosCamposVazios.add("CPF");
            empty = true;
        }
        if (txData.getText().isEmpty()) {
            errosCamposVazios.add("Data");
            empty = true;
        }
        if (empty) {
            StringBuilder mensagem = new StringBuilder("Preencha os seguintes campos: \n");

            for (String erro : errosCamposVazios) {
                mensagem.append(erro).append("\n");
            }

            JOptionPane.showMessageDialog(null, mensagem.toString());
        }
        return empty;
    }

    public boolean consultaRealizada() {
        boolean consultaReal = false;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        LocalDate dataInserida = LocalDate.parse(txData.getText(), formatter);
        LocalDate dataAtual = LocalDate.now();

        consultaReal = dataInserida.isBefore(dataAtual);

        return consultaReal;
    }

    public boolean formatFields() {
        boolean format = false;

        String telefone = txTelefone.getText();
        String cpf = txCpf.getText();
        String data = txData.getText();
        boolean formatoTelefone = telefone.matches("[(][0-9]{2}[)][0-9]{5}[-][0-9]{4}");
        boolean formatoCpf = cpf.matches("[0-9]{3}[.][0-9]{3}[.][0-9]{3}[-][0-9]{2}");
        boolean formatoData = data.matches("[0-9]{2}[-][0-9]{2}[-][0-9]{4}");

        if (!formatoTelefone) {
            format = true;
            txTelefone.setText("Modelo: (xx)xxxxx-xxxx");
            JOptionPane.showMessageDialog(null, "Formato do telefone inválido.");
            return format;
        }
        if (!formatoCpf) {
            format = true;
            txCpf.setText("Modelo: xxx.xxx.xxx-xx");
            JOptionPane.showMessageDialog(null, "Formato do CPF inválido.");
            return format;
        }
        if (!formatoData) {
            format = true;
            txData.setText("Modelo: xx-xx-xxxx");
            JOptionPane.showMessageDialog(null, "Formato do data inválido.");
            return format;
        }
        return format;
    }
}
