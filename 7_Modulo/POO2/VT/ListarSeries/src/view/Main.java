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
        jMenuBarMenu = new javax.swing.JMenuBar();
        jMenuArquivo = new javax.swing.JMenu();
        jMenuItemSeries = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuCadastrar = new javax.swing.JMenu();
        jMenuItemCadSeries = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenuItemCadEpisodios = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jMenuItemCadGenero = new javax.swing.JMenuItem();
        jMenuSobre = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela de Cadastro de Séries");
        setResizable(false);

        javax.swing.GroupLayout jDesktopLayout = new javax.swing.GroupLayout(jDesktop);
        jDesktop.setLayout(jDesktopLayout);
        jDesktopLayout.setHorizontalGroup(
            jDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1280, Short.MAX_VALUE)
        );
        jDesktopLayout.setVerticalGroup(
            jDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 654, Short.MAX_VALUE)
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

        jMenuItemCadSeries.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.META_MASK));
        jMenuItemCadSeries.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/movie/1x/baseline_movie_black_18dp.png"))); // NOI18N
        jMenuItemCadSeries.setMnemonic('c');
        jMenuItemCadSeries.setText("Séries");
        jMenuCadastrar.add(jMenuItemCadSeries);
        jMenuCadastrar.add(jSeparator2);

        jMenuItemCadEpisodios.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.META_MASK));
        jMenuItemCadEpisodios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/episodios/1x/baseline_play_circle_outline_black_18dp.png"))); // NOI18N
        jMenuItemCadEpisodios.setText("Episódios");
        jMenuCadastrar.add(jMenuItemCadEpisodios);
        jMenuCadastrar.add(jSeparator3);

        jMenuItemCadGenero.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.META_MASK));
        jMenuItemCadGenero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/gene/1x/baseline_video_settings_black_18dp.png"))); // NOI18N
        jMenuItemCadGenero.setText("Genero");
        jMenuCadastrar.add(jMenuItemCadGenero);

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
        JIFrameDefault tela = new JIFrameDefault();
        jDesktop.add(tela);
        tela.setVisible(true);
    }//GEN-LAST:event_jMenuItemSeriesActionPerformed

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
    private javax.swing.JMenu jMenuArquivo;
    private javax.swing.JMenuBar jMenuBarMenu;
    private javax.swing.JMenu jMenuCadastrar;
    private javax.swing.JMenuItem jMenuItemCadEpisodios;
    private javax.swing.JMenuItem jMenuItemCadGenero;
    private javax.swing.JMenuItem jMenuItemCadSeries;
    private javax.swing.JMenuItem jMenuItemSeries;
    private javax.swing.JMenu jMenuSobre;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    // End of variables declaration//GEN-END:variables
}
