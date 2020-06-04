package view;

import javax.swing.JFrame;

/**
 *
 * @author edudeveloper
 */
public class Main extends javax.swing.JFrame {

    // Método Construtor
    
    public Main() {
        initComponents();
        // Maximinizar a janela
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktop = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jMenuBarMenu = new javax.swing.JMenuBar();
        jMenuArquivo = new javax.swing.JMenu();
        jMenuItemSeries = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuCadastrar = new javax.swing.JMenu();
        jMenuItemCadNomeSeries = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jMenuItemCadGenero = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        jMenuItemClassificacao = new javax.swing.JMenuItem();
        jMenuSobre = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela de Cadastro de Séries");
        setResizable(false);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Flix");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("JumpJump");

        jDesktop.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktop.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktop.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopLayout = new javax.swing.GroupLayout(jDesktop);
        jDesktop.setLayout(jDesktopLayout);
        jDesktopLayout.setHorizontalGroup(
            jDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopLayout.createSequentialGroup()
                .addGap(179, 179, 179)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 529, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopLayout.createSequentialGroup()
                        .addGap(247, 247, 247)
                        .addComponent(jLabel2))
                    .addGroup(jDesktopLayout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(jLabel3)))
                .addContainerGap(198, Short.MAX_VALUE))
        );
        jDesktopLayout.setVerticalGroup(
            jDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopLayout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(jDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jDesktopLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)))
                .addContainerGap(79, Short.MAX_VALUE))
        );

        jMenuArquivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/arquivo/2x/baseline_addchart_black_18dp.png"))); // NOI18N
        jMenuArquivo.setMnemonic('a');
        jMenuArquivo.setText("Arquivo");

        jMenuItemSeries.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.META_MASK));
        jMenuItemSeries.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/movie/1x/baseline_movie_black_18dp.png"))); // NOI18N
        jMenuItemSeries.setText("Séries");
        jMenuItemSeries.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSeriesActionPerformed(evt);
            }
        });
        jMenuArquivo.add(jMenuItemSeries);
        jMenuArquivo.add(jSeparator1);

        jMenuCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/plus/1x/sharp_queue_black_18dp.png"))); // NOI18N
        jMenuCadastrar.setText("Cadastrar");

        jMenuItemCadNomeSeries.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.META_MASK));
        jMenuItemCadNomeSeries.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/movie/1x/baseline_movie_black_18dp.png"))); // NOI18N
        jMenuItemCadNomeSeries.setMnemonic('c');
        jMenuItemCadNomeSeries.setText("Nome");
        jMenuItemCadNomeSeries.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadNomeSeriesActionPerformed(evt);
            }
        });
        jMenuCadastrar.add(jMenuItemCadNomeSeries);
        jMenuCadastrar.add(jSeparator2);
        jMenuCadastrar.add(jSeparator3);

        jMenuItemCadGenero.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.META_MASK));
        jMenuItemCadGenero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/gene/1x/baseline_video_settings_black_18dp.png"))); // NOI18N
        jMenuItemCadGenero.setText("Genero");
        jMenuItemCadGenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadGeneroActionPerformed(evt);
            }
        });
        jMenuCadastrar.add(jMenuItemCadGenero);
        jMenuCadastrar.add(jSeparator4);

        jMenuItemClassificacao.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.META_MASK));
        jMenuItemClassificacao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/class/1x/sharp_face_black_18dp.png"))); // NOI18N
        jMenuItemClassificacao.setText("Classificação");
        jMenuItemClassificacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemClassificacaoActionPerformed(evt);
            }
        });
        jMenuCadastrar.add(jMenuItemClassificacao);

        jMenuArquivo.add(jMenuCadastrar);

        jMenuBarMenu.add(jMenuArquivo);

        jMenuSobre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/sobre/2x/baseline_contact_support_black_18dp.png"))); // NOI18N
        jMenuSobre.setMnemonic('s');
        jMenuSobre.setText("Sobre");
        jMenuBarMenu.add(jMenuSobre);

        setJMenuBar(jMenuBarMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktop)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktop)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemSeriesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSeriesActionPerformed
        // Criando uma nova tela
        NotaView tela = new NotaView();
        jDesktop.add(tela);
        tela.setVisible(true);
    }//GEN-LAST:event_jMenuItemSeriesActionPerformed

    private void jMenuItemCadNomeSeriesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadNomeSeriesActionPerformed
         // Criando uma nova tela
        NotaView tela = new NotaView();
        jDesktop.add(tela);
        tela.setVisible(true);
    }//GEN-LAST:event_jMenuItemCadNomeSeriesActionPerformed

    private void jMenuItemCadGeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadGeneroActionPerformed
        // Criando uma nova tela
        GeneroView tela = new GeneroView();
        jDesktop.add(tela);
        tela.setVisible(true);
    }//GEN-LAST:event_jMenuItemCadGeneroActionPerformed

    private void jMenuItemClassificacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemClassificacaoActionPerformed
        // Criando uma nova tela
        ClassificacaoView tela = new ClassificacaoView();
        jDesktop.add(tela);
        tela.setVisible(true);
    }//GEN-LAST:event_jMenuItemClassificacaoActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktop;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenuArquivo;
    private javax.swing.JMenuBar jMenuBarMenu;
    private javax.swing.JMenu jMenuCadastrar;
    private javax.swing.JMenuItem jMenuItemCadGenero;
    private javax.swing.JMenuItem jMenuItemCadNomeSeries;
    private javax.swing.JMenuItem jMenuItemClassificacao;
    private javax.swing.JMenuItem jMenuItemSeries;
    private javax.swing.JMenu jMenuSobre;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    // End of variables declaration//GEN-END:variables
}
