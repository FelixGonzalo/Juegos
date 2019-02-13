package Interfaces;

import java.applet.AudioClip;
import java.awt.Color;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
//Elaborado por tuamigofekilo.blogspot.com
public class TresEnRaya_Fekilo extends javax.swing.JFrame {
    private int[][] tablero = new int[3][3];
    private int ficha = 1;/*X = 1 and O = 2*/
    private int[] jugadores = new int[2];
    AudioClip sonido;
    Icon mensaje = new ImageIcon(getClass().getResource("/Imagenes/personaMensajes.png"));
    
    public TresEnRaya_Fekilo() {
        initComponents();
        this.setLocationRelativeTo(null);
        panTable.setVisible(false);
        btn00.setVisible(false);
        btn01.setVisible(false);
        btn02.setVisible(false);
        btn10.setVisible(false);
        btn11.setVisible(false);
        btn12.setVisible(false);
        btn20.setVisible(false);
        btn21.setVisible(false);
        btn22.setVisible(false);
        lbFlecha1.setVisible(false);
        lbFlecha2.setVisible(false);
        lbFlecha3.setVisible(false);
        lbFlecha4.setVisible(false);
        lbFlecha5.setVisible(false);
        lbFlecha6.setVisible(false);
        lbFlecha7.setVisible(false);
        lbFlecha8.setVisible(false);
        sonido = java.applet.Applet.newAudioClip(getClass().getResource("/Audios/colocarFicha.wav"));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lbBlog = new javax.swing.JLabel();
        lbFlecha8 = new javax.swing.JLabel();
        lbFlecha7 = new javax.swing.JLabel();
        lbFlecha6 = new javax.swing.JLabel();
        lbFlecha5 = new javax.swing.JLabel();
        lbFlecha4 = new javax.swing.JLabel();
        lbFlecha3 = new javax.swing.JLabel();
        lbFlecha2 = new javax.swing.JLabel();
        lbFlecha1 = new javax.swing.JLabel();
        lbJugador1 = new javax.swing.JLabel();
        lbJugador2 = new javax.swing.JLabel();
        lbO = new javax.swing.JLabel();
        lbX = new javax.swing.JLabel();
        btnStart = new javax.swing.JButton();
        panTable = new javax.swing.JPanel();
        btn22 = new javax.swing.JButton();
        btn12 = new javax.swing.JButton();
        btn02 = new javax.swing.JButton();
        btn01 = new javax.swing.JButton();
        btn11 = new javax.swing.JButton();
        btn21 = new javax.swing.JButton();
        btn00 = new javax.swing.JButton();
        btn10 = new javax.swing.JButton();
        btn20 = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(204, 153, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbBlog.setFont(new java.awt.Font("Tekton Pro Cond", 0, 24)); // NOI18N
        lbBlog.setForeground(new java.awt.Color(51, 51, 51));
        lbBlog.setText("tuamigofekilo.blogspot.com");
        jPanel2.add(lbBlog, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 570, 220, 40));

        lbFlecha8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbFlecha8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/flecha 8.png"))); // NOI18N
        jPanel2.add(lbFlecha8, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 520, 590));

        lbFlecha7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbFlecha7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/flecha 7.png"))); // NOI18N
        jPanel2.add(lbFlecha7, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, 540, 570));

        lbFlecha6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbFlecha6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/flecha 6.png"))); // NOI18N
        jPanel2.add(lbFlecha6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 380, 570, 170));

        lbFlecha5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbFlecha5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/flecha 5.png"))); // NOI18N
        jPanel2.add(lbFlecha5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, 550, 160));

        lbFlecha4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbFlecha4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/flecha 4.png"))); // NOI18N
        jPanel2.add(lbFlecha4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, 550, 180));

        lbFlecha3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbFlecha3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/flecha 3.png"))); // NOI18N
        jPanel2.add(lbFlecha3, new org.netbeans.lib.awtextra.AbsoluteConstraints(524, 20, 150, 590));

        lbFlecha2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbFlecha2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/flecha 2.png"))); // NOI18N
        jPanel2.add(lbFlecha2, new org.netbeans.lib.awtextra.AbsoluteConstraints(384, 20, -1, 590));

        lbFlecha1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbFlecha1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/flecha1.png"))); // NOI18N
        jPanel2.add(lbFlecha1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, 160, 590));

        lbJugador1.setBackground(new java.awt.Color(255, 255, 255));
        lbJugador1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lbJugador1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbJugador1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.add(lbJugador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 60, 50));

        lbJugador2.setBackground(new java.awt.Color(255, 255, 255));
        lbJugador2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lbJugador2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbJugador2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.add(lbJugador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 60, 50));

        lbO.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lbO.setForeground(new java.awt.Color(153, 0, 0));
        lbO.setText("O");
        jPanel2.add(lbO, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 40, 50));

        lbX.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lbX.setForeground(new java.awt.Color(0, 51, 255));
        lbX.setText("X");
        jPanel2.add(lbX, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 40, 50));

        btnStart.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnStart.setText("START");
        btnStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartActionPerformed(evt);
            }
        });
        jPanel2.add(btnStart, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, -1, -1));

        panTable.setBackground(new java.awt.Color(0, 0, 0));
        panTable.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panTable.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn22.setBackground(new java.awt.Color(229, 223, 48));
        btn22.setFont(new java.awt.Font("Tahoma", 0, 100)); // NOI18N
        btn22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn22ActionPerformed(evt);
            }
        });
        panTable.add(btn22, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 330, 140, 150));

        btn12.setBackground(new java.awt.Color(229, 223, 48));
        btn12.setFont(new java.awt.Font("Tahoma", 0, 100)); // NOI18N
        btn12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn12ActionPerformed(evt);
            }
        });
        panTable.add(btn12, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 170, 140, 150));

        btn02.setBackground(new java.awt.Color(229, 223, 48));
        btn02.setFont(new java.awt.Font("Tahoma", 0, 100)); // NOI18N
        btn02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn02ActionPerformed(evt);
            }
        });
        panTable.add(btn02, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 140, 150));

        btn01.setBackground(new java.awt.Color(229, 223, 48));
        btn01.setFont(new java.awt.Font("Tahoma", 0, 100)); // NOI18N
        btn01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn01ActionPerformed(evt);
            }
        });
        panTable.add(btn01, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 140, 150));

        btn11.setBackground(new java.awt.Color(229, 223, 48));
        btn11.setFont(new java.awt.Font("Tahoma", 0, 100)); // NOI18N
        btn11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn11ActionPerformed(evt);
            }
        });
        panTable.add(btn11, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 140, 150));

        btn21.setBackground(new java.awt.Color(229, 223, 48));
        btn21.setFont(new java.awt.Font("Tahoma", 0, 100)); // NOI18N
        btn21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn21ActionPerformed(evt);
            }
        });
        panTable.add(btn21, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 330, 140, 150));

        btn00.setBackground(new java.awt.Color(229, 223, 48));
        btn00.setFont(new java.awt.Font("Tahoma", 0, 100)); // NOI18N
        btn00.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn00ActionPerformed(evt);
            }
        });
        panTable.add(btn00, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 140, 150));

        btn10.setBackground(new java.awt.Color(229, 223, 48));
        btn10.setFont(new java.awt.Font("Tahoma", 0, 100)); // NOI18N
        btn10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn10ActionPerformed(evt);
            }
        });
        panTable.add(btn10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 140, 150));

        btn20.setBackground(new java.awt.Color(229, 223, 48));
        btn20.setFont(new java.awt.Font("Tahoma", 0, 100)); // NOI18N
        btn20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn20ActionPerformed(evt);
            }
        });
        panTable.add(btn20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 140, 150));

        jPanel2.add(panTable, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 60, 460, 490));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/tableGame.png"))); // NOI18N
        jPanel2.add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 710, 610));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 744, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 639, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn00ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn00ActionPerformed
        if (tablero[0][0] != 1 && tablero[0][0] != 2) {
            sonido.play();
            tablero[0][0] = ficha;
            cambioFicha();
            if (ficha == 1) {
                btn00.setForeground(Color.blue);
            } else {
                btn00.setForeground(Color.red);
            }
            btn00.setText(colocarFicha());
            sumarPunto();
        }
    }//GEN-LAST:event_btn00ActionPerformed

    private void btn01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn01ActionPerformed
        if (tablero[0][1] != 1 && tablero[0][1] != 2) {
            sonido.play();
            tablero[0][1] = ficha;
            cambioFicha();
            if (ficha == 1) {
                btn01.setForeground(Color.blue);
            } else {
                btn01.setForeground(Color.red);
            }
            btn01.setText(colocarFicha());
            sumarPunto();
        }

    }//GEN-LAST:event_btn01ActionPerformed

    private void btn02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn02ActionPerformed
        if (tablero[0][2] != 1 && tablero[0][2] != 2) {
            sonido.play();
            tablero[0][2] = ficha;
            cambioFicha();
            if (ficha == 1) {
                btn02.setForeground(Color.blue);
            } else {
                btn02.setForeground(Color.red);
            }
            btn02.setText(colocarFicha());
            sumarPunto();
        }

    }//GEN-LAST:event_btn02ActionPerformed

    private void btn10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn10ActionPerformed
        if (tablero[1][0] != 1 && tablero[1][0] != 2) {
            sonido.play();
            tablero[1][0] = ficha;
            cambioFicha();
            if (ficha == 1) {
                btn10.setForeground(Color.blue);
            } else {
                btn10.setForeground(Color.red);
            }
            btn10.setText(colocarFicha());
            sumarPunto();
        }

    }//GEN-LAST:event_btn10ActionPerformed

    private void btn11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn11ActionPerformed
        if (tablero[1][1] != 1 && tablero[1][1] != 2) {
            sonido.play();
            tablero[1][1] = ficha;
            cambioFicha();
            if (ficha == 1) {
                btn11.setForeground(Color.blue);
            } else {
                btn11.setForeground(Color.red);
            }
            btn11.setText(colocarFicha());
            sumarPunto();
        }

    }//GEN-LAST:event_btn11ActionPerformed

    private void btn12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn12ActionPerformed
        if (tablero[1][2] != 1 && tablero[1][2] != 2) {
            sonido.play();
            tablero[1][2] = ficha;
            cambioFicha();
            if (ficha == 1) {
                btn12.setForeground(Color.blue);
            } else {
                btn12.setForeground(Color.red);
            }
            btn12.setText(colocarFicha());
            sumarPunto();
        }

    }//GEN-LAST:event_btn12ActionPerformed

    private void btn20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn20ActionPerformed
        if (tablero[2][0] != 1 && tablero[2][0] != 2) {
            sonido.play();
            tablero[2][0] = ficha;
            cambioFicha();
            if (ficha == 1) {
                btn20.setForeground(Color.blue);
            } else {
                btn20.setForeground(Color.red);
            }
            btn20.setText(colocarFicha());
            sumarPunto();
        }

    }//GEN-LAST:event_btn20ActionPerformed

    private void btn21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn21ActionPerformed
        if (tablero[2][1] != 1 && tablero[2][1] != 2) {
            sonido.play();
            tablero[2][1] = ficha;
            cambioFicha();
            if (ficha == 1) {
                btn21.setForeground(Color.blue);
            } else {
                btn21.setForeground(Color.red);
            }
            btn21.setText(colocarFicha());
            sumarPunto();
        }

    }//GEN-LAST:event_btn21ActionPerformed

    private void btn22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn22ActionPerformed
        if (tablero[2][2] != 1 && tablero[2][2] != 2) {
            sonido.play();
            tablero[2][2] = ficha;
            cambioFicha();
            if (ficha == 1) {
                btn22.setForeground(Color.blue);
            } else {
                btn22.setForeground(Color.red);
            }
            btn22.setText(colocarFicha());
            sumarPunto();
        }

    }//GEN-LAST:event_btn22ActionPerformed

    private void btnStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartActionPerformed
        sonido = java.applet.Applet.newAudioClip(getClass().getResource("/Audios/clickButton.wav"));
        sonido.play();
        limpiarTablero();
        sonido = java.applet.Applet.newAudioClip(getClass().getResource("/Audios/colocarFicha.wav"));

    }//GEN-LAST:event_btnStartActionPerformed

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
            java.util.logging.Logger.getLogger(TresEnRaya_Fekilo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TresEnRaya_Fekilo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TresEnRaya_Fekilo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TresEnRaya_Fekilo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TresEnRaya_Fekilo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn00;
    private javax.swing.JButton btn01;
    private javax.swing.JButton btn02;
    private javax.swing.JButton btn10;
    private javax.swing.JButton btn11;
    private javax.swing.JButton btn12;
    private javax.swing.JButton btn20;
    private javax.swing.JButton btn21;
    private javax.swing.JButton btn22;
    private javax.swing.JButton btnStart;
    private javax.swing.JLabel fondo;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbBlog;
    private javax.swing.JLabel lbFlecha1;
    private javax.swing.JLabel lbFlecha2;
    private javax.swing.JLabel lbFlecha3;
    private javax.swing.JLabel lbFlecha4;
    private javax.swing.JLabel lbFlecha5;
    private javax.swing.JLabel lbFlecha6;
    private javax.swing.JLabel lbFlecha7;
    private javax.swing.JLabel lbFlecha8;
    private javax.swing.JLabel lbJugador1;
    private javax.swing.JLabel lbJugador2;
    private javax.swing.JLabel lbO;
    private javax.swing.JLabel lbX;
    private javax.swing.JPanel panTable;
    // End of variables declaration//GEN-END:variables

    private void limpiarTablero() {
        int cont = 10;
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[0].length; j++) {
                tablero[i][j] = cont;
                cont++;
            }
        }
        btn00.setText("");
        btn01.setText("");
        btn02.setText("");
        btn10.setText("");
        btn11.setText("");
        btn12.setText("");
        btn20.setText("");
        btn21.setText("");
        btn22.setText("");
        panTable.setVisible(true);
        btn00.setVisible(true);
        btn01.setVisible(true);
        btn02.setVisible(true);
        btn10.setVisible(true);
        btn11.setVisible(true);
        btn12.setVisible(true);
        btn20.setVisible(true);
        btn21.setVisible(true);
        btn22.setVisible(true);
        btn00.setEnabled(true);
        btn01.setEnabled(true);
        btn02.setEnabled(true);
        btn10.setEnabled(true);
        btn11.setEnabled(true);
        btn12.setEnabled(true);
        btn20.setEnabled(true);
        btn21.setEnabled(true);
        btn22.setEnabled(true);
        lbFlecha1.setVisible(false);
        lbFlecha2.setVisible(false);
        lbFlecha3.setVisible(false);
        lbFlecha4.setVisible(false);
        lbFlecha5.setVisible(false);
        lbFlecha6.setVisible(false);
        lbFlecha7.setVisible(false);
        lbFlecha8.setVisible(false);
    }

    private String colocarFicha() {
        if (this.ficha == 1) {
            return "X";
        } else {
            return "O";
        }
    }

    private void cambioFicha() {
        if (this.ficha == 1) {
            this.ficha = 2;
        } else {
            if (this.ficha == 2) {
                this.ficha = 1;
            }
        }
    }

    private int verificarRaya() {
        int valorFicha = 0;
        if (tablero[0][0] == tablero[1][0] && tablero[0][0] == tablero[2][0]) {
            valorFicha = tablero[0][0];
            JOptionPane.showMessageDialog(null, "Punto Corazón ‼","Tres en Raya",JOptionPane.INFORMATION_MESSAGE,mensaje);
            lbFlecha1.setVisible(true);
        } else if (tablero[0][1] == tablero[1][1] && tablero[0][1] == tablero[2][1]) {
            valorFicha = tablero[0][1];
            JOptionPane.showMessageDialog(null, "Punto Boxeo","Tres en Raya",JOptionPane.INFORMATION_MESSAGE,mensaje);
            lbFlecha2.setVisible(true);
        } else if (tablero[0][2] == tablero[1][2] && tablero[0][2] == tablero[2][2]) {
            valorFicha = tablero[0][2];
            JOptionPane.showMessageDialog(null, "Punto Fútbol","Tres en Raya",JOptionPane.INFORMATION_MESSAGE,mensaje);
            lbFlecha3.setVisible(true);
        } else {
            if (tablero[0][0] == tablero[0][1] && tablero[0][0] == tablero[0][2]) {
                valorFicha = tablero[0][0];
                JOptionPane.showMessageDialog(null, "Punto Emoticon","Tres en Raya",JOptionPane.INFORMATION_MESSAGE,mensaje);
                lbFlecha4.setVisible(true);

            } else if (tablero[1][0] == tablero[1][1] && tablero[1][0] == tablero[1][2]) {
                valorFicha = tablero[1][0];
                JOptionPane.showMessageDialog(null, "Punto Diamante","Tres en Raya",JOptionPane.INFORMATION_MESSAGE,mensaje);
                lbFlecha5.setVisible(true);

            } else if (tablero[2][0] == tablero[2][1] && tablero[2][0] == tablero[2][2]) {
                valorFicha = tablero[2][0];
                JOptionPane.showMessageDialog(null, "Punto Estrella","Tres en Raya",JOptionPane.INFORMATION_MESSAGE,mensaje);
                lbFlecha6.setVisible(true);

            } else {
                if (tablero[0][0] == tablero[1][1] && tablero[0][0] == tablero[2][2]) {
                    valorFicha = tablero[0][0];
                    JOptionPane.showMessageDialog(null, "Punto Me Gusta","Tres en Raya",JOptionPane.INFORMATION_MESSAGE,mensaje);
                    lbFlecha7.setVisible(true);

                } else if (tablero[0][2] == tablero[1][1] && tablero[0][2] == tablero[2][0]) {
                    valorFicha = tablero[0][2];
                    JOptionPane.showMessageDialog(null, "Punto Bomba","Tres en Raya",JOptionPane.INFORMATION_MESSAGE,mensaje);
                    lbFlecha8.setVisible(true);
                }
            }
        }
        return valorFicha;
    }

    private void sumarPunto() {
        sonido = java.applet.Applet.newAudioClip(getClass().getResource("/Audios/ganador.wav"));
        switch (verificarRaya()) {
            case 1:
                jugadores[0] += 1;
                lbJugador1.setText(Integer.toString(jugadores[0]));
                desabilitarBotones();
                sonido.play();
                break;
            case 2:
                jugadores[1] += 1;
                lbJugador2.setText(Integer.toString(jugadores[1]));
                desabilitarBotones();
                sonido.play();
                break;
            default:
                break;
        }
        sonido = java.applet.Applet.newAudioClip(getClass().getResource("/Audios/colocarFicha.wav"));
    }

    private void desabilitarBotones() {
        btn00.setEnabled(false);
        btn01.setEnabled(false);
        btn02.setEnabled(false);
        btn10.setEnabled(false);
        btn11.setEnabled(false);
        btn12.setEnabled(false);
        btn20.setEnabled(false);
        btn21.setEnabled(false);
        btn22.setEnabled(false);
    }
}
//Elaborado por tuamigofekilo.blogspot.com