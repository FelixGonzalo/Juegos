
package Interfaces;

import java.applet.AudioClip;
//tuamigofekilo.blogspot.com
public class MenuPrincipal extends javax.swing.JFrame {
    AudioClip sonido;
    
    public MenuPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);
        AudioClip sonido;
        sonido = java.applet.Applet.newAudioClip(getClass().getResource("/Audios/musicaMenu.wav"));
        sonido.play();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbBlog = new javax.swing.JLabel();
        btnJugar = new javax.swing.JButton();
        lbFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 153, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbBlog.setFont(new java.awt.Font("Tekton Pro Cond", 0, 24)); // NOI18N
        lbBlog.setForeground(new java.awt.Color(51, 51, 51));
        lbBlog.setText("tuamigofekilo.blogspot.com");
        jPanel1.add(lbBlog, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 570, 220, 40));

        btnJugar.setBackground(new java.awt.Color(255, 255, 255));
        btnJugar.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 36)); // NOI18N
        btnJugar.setText("JUGAR");
        btnJugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJugarActionPerformed(evt);
            }
        });
        jPanel1.add(btnJugar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 330, 180, 60));

        lbFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo juego.png"))); // NOI18N
        jPanel1.add(lbFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 710, 610));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 730, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 634, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnJugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJugarActionPerformed
        sonido = java.applet.Applet.newAudioClip(getClass().getResource("/Audios/clickButton.wav"));
        sonido.play();
        TresEnRaya_Fekilo ventana = new TresEnRaya_Fekilo();
        ventana.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnJugarActionPerformed

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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnJugar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbBlog;
    private javax.swing.JLabel lbFondo;
    // End of variables declaration//GEN-END:variables
}
//Elaborado tuamigofekilo.blogspot.com