package view;

import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author edudeveloper
 */

// Classe abstrata
abstract public class JIFrameDefault extends javax.swing.JInternalFrame {
    
    // Métodos abstratos que serão implementados pelas classes filhas
    abstract public void initializeComponents(); // Assinatura de método
    abstract public void saveView();
    
    
    // Variáveis Componentes
    JLabel jlConsult;
    JTextField jTextFieldConsult;

    // Método Constructor
    public JIFrameDefault() {
        initComponents();
        // Setando buttons se New
        habilitaButtons(true);
        habilitaFields(false);
        initializeComponents(); // Inicializando os campos de cada formulário
        
        // Desabilitando os campos ID e Descrição
        jTextFieldID.setEnabled(false);
        jTextFieldDesc.setEnabled(false);
        
         // Componente Consulta jLabel e jTextField
        jlConsult = new JLabel("Consultar"); // Objeto que insere o título
        jlConsult.setBounds(30, 15, 60, 30); // Coluna, linha, largura e altura
        jPanelConsult.add(jlConsult);        // Adicona o componente no Panel
        
        jTextFieldConsult = new JTextField();
        jTextFieldConsult.setBounds(100, 15, 700, 30);
        jPanelConsult.add(jTextFieldConsult);
        
        habilitaFields(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelButton = new javax.swing.JPanel();
        jbNew = new javax.swing.JButton();
        jbUpdate = new javax.swing.JButton();
        jbDelete = new javax.swing.JButton();
        jbSave = new javax.swing.JButton();
        jbCancel = new javax.swing.JButton();
        jbClose = new javax.swing.JButton();
        jPanelForm = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldID = new javax.swing.JTextField();
        jTextFieldDesc = new javax.swing.JTextField();
        jPanelConsult = new javax.swing.JPanel();

        jbNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/new/2x/sharp_create_new_folder_black_18dp.png"))); // NOI18N
        jbNew.setMnemonic('n');
        jbNew.setText("Novo");
        jbNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNewActionPerformed(evt);
            }
        });

        jbUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/alterar/2x/sharp_settings_applications_black_18dp.png"))); // NOI18N
        jbUpdate.setText("Alterar");
        jbUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbUpdateActionPerformed(evt);
            }
        });

        jbDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/delete/2x/sharp_delete_sweep_black_18dp.png"))); // NOI18N
        jbDelete.setText("Excluir");

        jbSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/save/2x/sharp_save_black_18dp.png"))); // NOI18N
        jbSave.setText("Salvar");
        jbSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSaveActionPerformed(evt);
            }
        });

        jbCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cancel/2x/sharp_cancel_black_18dp.png"))); // NOI18N
        jbCancel.setText("Cancelar");
        jbCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelActionPerformed(evt);
            }
        });

        jbClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/close/2x/sharp_close_black_18dp.png"))); // NOI18N
        jbClose.setText("Fechar");
        jbClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCloseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelButtonLayout = new javax.swing.GroupLayout(jPanelButton);
        jPanelButton.setLayout(jPanelButtonLayout);
        jPanelButtonLayout.setHorizontalGroup(
            jPanelButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelButtonLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jbNew, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbSave, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbClose, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
        );
        jPanelButtonLayout.setVerticalGroup(
            jPanelButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelButtonLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbNew)
                    .addComponent(jbUpdate)
                    .addComponent(jbDelete)
                    .addComponent(jbSave)
                    .addComponent(jbCancel)
                    .addComponent(jbClose))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("ID");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setText("Descrição");

        jTextFieldID.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N

        jTextFieldDesc.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N

        javax.swing.GroupLayout jPanelFormLayout = new javax.swing.GroupLayout(jPanelForm);
        jPanelForm.setLayout(jPanelFormLayout);
        jPanelFormLayout.setHorizontalGroup(
            jPanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFormLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(jPanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 789, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelFormLayout.setVerticalGroup(
            jPanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFormLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldDesc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(185, Short.MAX_VALUE))
        );

        jPanelConsult.setBackground(new java.awt.Color(0, 102, 102));

        javax.swing.GroupLayout jPanelConsultLayout = new javax.swing.GroupLayout(jPanelConsult);
        jPanelConsult.setLayout(jPanelConsultLayout);
        jPanelConsultLayout.setHorizontalGroup(
            jPanelConsultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanelConsultLayout.setVerticalGroup(
            jPanelConsultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 328, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanelConsult, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelForm, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanelForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelConsult, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCloseActionPerformed
        // Fechando a tela default
        dispose();
        
    }//GEN-LAST:event_jbCloseActionPerformed

    private void jbNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNewActionPerformed
        
        habilitaButtons(false);          // Setando buttons se New        
        habilitaFields(true);            // Habilitando o campo Descrição ao criar um novo
        cleanFields();                   // Limpando o campo
        jTextFieldDesc.requestFocus();   // Setando o foco no campo ao abrir a tela
        
    }//GEN-LAST:event_jbNewActionPerformed

    private void jbUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbUpdateActionPerformed
        
        habilitaButtons(false);          // Setando buttons se Update
        habilitaFields(true);            // Habilitando o campo Descrição ao editar
        jTextFieldDesc.requestFocus();   // Setando o foco no campo ao abrir a tela
    }//GEN-LAST:event_jbUpdateActionPerformed

    private void jbSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSaveActionPerformed

        habilitaButtons(true);           // Setando buttons se Save
        habilitaFields(false);           // Desabilita o campo Descrição ao salvar
        saveView();
    }//GEN-LAST:event_jbSaveActionPerformed

    private void jbCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelActionPerformed
         
        habilitaButtons(true);           // Setando buttons se Cancel
        habilitaFields(false);           // Desabilita o campo Descrição ao Cancelar
        
        
    }//GEN-LAST:event_jbCancelActionPerformed
    
    // Método para habilitar ou desabilitar botões
    public void habilitaButtons(boolean state){
        jbNew.setEnabled(state);
        jbUpdate.setEnabled(state);
        jbUpdate.setEnabled(state);
        jbSave.setEnabled(!state);
        jbCancel.setEnabled(!state);
    }
    
    // Método para habilitar ou desabilitar acessos aos campos de edição
    public void habilitaFields(boolean state){   
        jTextFieldDesc.setEnabled(state);
    }
    
    // Método para limpar os campos do formulário
    public void cleanFields(){
        jTextFieldDesc.setText("");
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanelButton;
    public javax.swing.JPanel jPanelConsult;
    public javax.swing.JPanel jPanelForm;
    public javax.swing.JTextField jTextFieldDesc;
    public javax.swing.JTextField jTextFieldID;
    private javax.swing.JButton jbCancel;
    private javax.swing.JButton jbClose;
    private javax.swing.JButton jbDelete;
    private javax.swing.JButton jbNew;
    private javax.swing.JButton jbSave;
    private javax.swing.JButton jbUpdate;
    // End of variables declaration//GEN-END:variables
}
