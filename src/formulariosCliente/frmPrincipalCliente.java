package formulariosCliente;

import configuracion.Metropolitano;
import java.awt.event.ActionEvent;

public class frmPrincipalCliente extends javax.swing.JFrame {

    panelMovimientos pnl1 = new panelMovimientos();
    panelRecargaVirtual pnl2 = new panelRecargaVirtual();
    panelBuses pnlBuses = new panelBuses();
    panelEstaciones pnlBuscar = new panelEstaciones();
    panelInfo pnlInfo = new panelInfo();
    panelTarjeta pnlTarjeta = new panelTarjeta();
    panelEnviarMensajes pnlMensajes = new panelEnviarMensajes();
    panelVerMensajes pnlVerMensajes = new panelVerMensajes();

    public frmPrincipalCliente() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.pnlContenedor.add(pnl1);
        pnl1.setVisible(true);
        pnl2.setVisible(false);
        this.deshabilitarBotones();
    }

    private void deshabilitarBotones() {
        if (pnl1.isVisible()) {
            btnInicio.setEnabled(false);
            btnRecarga.setEnabled(true);
            btnBuses.setEnabled(true);
            btnBuscar.setEnabled(true);
            btnInfo.setEnabled(true);
            btnModoTarjeta.setEnabled(true);
            btnMensaje.setEnabled(true);
            btnMensaje.setEnabled(true);
            btnVerMensajes.setEnabled(true);
        } else if (pnl2.isVisible()) {
            btnInicio.setEnabled(true);
            btnRecarga.setEnabled(false);
            btnBuses.setEnabled(true);
            btnBuscar.setEnabled(true);
            btnInfo.setEnabled(true);
            btnModoTarjeta.setEnabled(true);
            btnMensaje.setEnabled(true);
            btnVerMensajes.setEnabled(true);
        } else if (pnlBuses.isVisible()) {
            btnInicio.setEnabled(true);
            btnRecarga.setEnabled(true);
            btnBuses.setEnabled(false);
            btnBuscar.setEnabled(true);
            btnInfo.setEnabled(true);
            btnModoTarjeta.setEnabled(true);
            btnMensaje.setEnabled(true);
            btnVerMensajes.setEnabled(true);
        } else if (pnlBuscar.isVisible()) {
            btnInicio.setEnabled(true);
            btnRecarga.setEnabled(true);
            btnBuses.setEnabled(true);
            btnBuscar.setEnabled(false);
            btnInfo.setEnabled(true);
            btnModoTarjeta.setEnabled(true);
            btnMensaje.setEnabled(true);
            btnVerMensajes.setEnabled(true);
        } else if (pnlInfo.isVisible()) {
            btnInicio.setEnabled(true);
            btnRecarga.setEnabled(true);
            btnBuses.setEnabled(true);
            btnBuscar.setEnabled(true);
            btnInfo.setEnabled(false);
            btnModoTarjeta.setEnabled(true);
            btnMensaje.setEnabled(true);
            btnVerMensajes.setEnabled(true);
        } else if (pnlTarjeta.isVisible()) {
            btnInicio.setEnabled(true);
            btnRecarga.setEnabled(true);
            btnBuses.setEnabled(true);
            btnBuscar.setEnabled(true);
            btnInfo.setEnabled(true);
            btnModoTarjeta.setEnabled(false);
            btnMensaje.setEnabled(true);
            btnVerMensajes.setEnabled(true);
        } else if (pnlMensajes.isVisible()) {
            btnInicio.setEnabled(true);
            btnRecarga.setEnabled(true);
            btnBuses.setEnabled(true);
            btnBuscar.setEnabled(true);
            btnInfo.setEnabled(true);
            btnModoTarjeta.setEnabled(true);
            btnMensaje.setEnabled(false);
            btnVerMensajes.setEnabled(true);
        } else if (pnlVerMensajes.isVisible()) {
            btnInicio.setEnabled(true);
            btnRecarga.setEnabled(true);
            btnBuses.setEnabled(true);
            btnBuscar.setEnabled(true);
            btnInfo.setEnabled(true);
            btnModoTarjeta.setEnabled(true);
            btnMensaje.setEnabled(true);
            btnVerMensajes.setEnabled(false);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        pnlContenedor = new javax.swing.JPanel();
        pnlBotones = new javax.swing.JPanel();
        btnInicio = new javax.swing.JButton();
        btnRecarga = new javax.swing.JButton();
        btnBuses = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnInfo = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnModoTarjeta = new javax.swing.JButton();
        btnMensaje = new javax.swing.JButton();
        btnVerMensajes = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jPanel1.setLayout(new java.awt.GridBagLayout());

        pnlContenedor.setPreferredSize(new java.awt.Dimension(422, 440));
        pnlContenedor.setLayout(new java.awt.GridBagLayout());
        jPanel1.add(pnlContenedor, new java.awt.GridBagConstraints());

        pnlBotones.setBackground(new java.awt.Color(153, 0, 153));
        pnlBotones.setPreferredSize(new java.awt.Dimension(440, 165));
        pnlBotones.setLayout(new java.awt.GridBagLayout());

        btnInicio.setBackground(new java.awt.Color(102, 51, 0));
        btnInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/home_50px.png"))); // NOI18N
        btnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 100.0;
        gridBagConstraints.weighty = 100.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pnlBotones.add(btnInicio, gridBagConstraints);

        btnRecarga.setBackground(new java.awt.Color(102, 51, 0));
        btnRecarga.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/prepaid_recharge_50px2.png"))); // NOI18N
        btnRecarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecargaActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 99.0;
        gridBagConstraints.weighty = 99.9;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pnlBotones.add(btnRecarga, gridBagConstraints);

        btnBuses.setBackground(new java.awt.Color(102, 51, 0));
        btnBuses.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/bus_50px.png"))); // NOI18N
        btnBuses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBusesActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 100.0;
        gridBagConstraints.weighty = 100.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pnlBotones.add(btnBuses, gridBagConstraints);

        btnBuscar.setBackground(new java.awt.Color(102, 51, 0));
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/schedule_50px.png"))); // NOI18N
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.weightx = 100.0;
        gridBagConstraints.weighty = 100.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pnlBotones.add(btnBuscar, gridBagConstraints);

        btnInfo.setBackground(new java.awt.Color(102, 51, 0));
        btnInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/information_50px2.png"))); // NOI18N
        btnInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInfoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 100.0;
        gridBagConstraints.weighty = 100.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pnlBotones.add(btnInfo, gridBagConstraints);

        btnSalir.setBackground(new java.awt.Color(102, 51, 0));
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/exit_sign_50px.png"))); // NOI18N
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 10;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.weightx = 100.0;
        gridBagConstraints.weighty = 100.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pnlBotones.add(btnSalir, gridBagConstraints);

        btnModoTarjeta.setBackground(new java.awt.Color(102, 51, 0));
        btnModoTarjeta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/card_payment_50px.png"))); // NOI18N
        btnModoTarjeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModoTarjetaActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 100.0;
        gridBagConstraints.weighty = 100.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pnlBotones.add(btnModoTarjeta, gridBagConstraints);

        btnMensaje.setBackground(new java.awt.Color(102, 51, 0));
        btnMensaje.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnMensaje.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/send_50px.png"))); // NOI18N
        btnMensaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMensajeActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 100.0;
        gridBagConstraints.weighty = 100.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pnlBotones.add(btnMensaje, gridBagConstraints);

        btnVerMensajes.setBackground(new java.awt.Color(102, 51, 0));
        btnVerMensajes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/open_envelope_50px.png"))); // NOI18N
        btnVerMensajes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerMensajesActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 100.0;
        gridBagConstraints.weighty = 100.0;
        pnlBotones.add(btnVerMensajes, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        jPanel1.add(pnlBotones, gridBagConstraints);

        getContentPane().add(jPanel1, new java.awt.GridBagConstraints());

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        frmIngreso frm = new frmIngreso();
        Metropolitano.usuarioActual.salir();
        frm.setLocationRelativeTo(null);
        frm.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed
        pnl2.setVisible(false);
        pnl1.setVisible(true);
        pnlBuses.setVisible(false);
        pnlBuscar.setVisible(false);
        pnlInfo.setVisible(false);
        pnlTarjeta.setVisible(false);
        pnlMensajes.setVisible(false);
        pnlVerMensajes.setVisible(false);
        this.pnlContenedor.add(pnl1);
        this.pnlContenedor.validate();
        this.deshabilitarBotones();
    }//GEN-LAST:event_btnInicioActionPerformed

    private void btnRecargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecargaActionPerformed
        pnl1.setVisible(false);
        pnl2.setVisible(true);
        pnlBuses.setVisible(false);
        pnlBuscar.setVisible(false);
        pnlInfo.setVisible(false);
        pnlTarjeta.setVisible(false);
        pnlMensajes.setVisible(false);
        pnlVerMensajes.setVisible(false);
        this.pnlContenedor.add(pnl2);
        this.pnlContenedor.validate();
        this.deshabilitarBotones();
    }//GEN-LAST:event_btnRecargaActionPerformed

    private void btnBusesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBusesActionPerformed
        pnl1.setVisible(false);
        pnl2.setVisible(false);
        pnlBuses.setVisible(true);
        pnlBuscar.setVisible(false);
        pnlInfo.setVisible(false);
        pnlTarjeta.setVisible(false);
        pnlMensajes.setVisible(false);
        pnlVerMensajes.setVisible(false);
        this.pnlContenedor.add(pnlBuses);
        this.pnlContenedor.validate();
        this.deshabilitarBotones();
    }//GEN-LAST:event_btnBusesActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        pnl1.setVisible(false);
        pnl2.setVisible(false);
        pnlBuses.setVisible(false);
        pnlBuscar.setVisible(true);
        pnlInfo.setVisible(false);
        pnlTarjeta.setVisible(false);
        pnlMensajes.setVisible(false);
        pnlVerMensajes.setVisible(false);
        this.pnlContenedor.add(pnlBuscar);
        this.pnlContenedor.validate();
        this.deshabilitarBotones();
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInfoActionPerformed
        pnl1.setVisible(false);
        pnl2.setVisible(false);
        pnlBuses.setVisible(false);
        pnlBuscar.setVisible(false);
        pnlInfo.setVisible(true);
        pnlTarjeta.setVisible(false);
        pnlMensajes.setVisible(false);
        pnlVerMensajes.setVisible(false);
        this.pnlContenedor.add(pnlInfo);
        this.pnlContenedor.validate();
        this.deshabilitarBotones();
    }//GEN-LAST:event_btnInfoActionPerformed

    private void btnModoTarjetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModoTarjetaActionPerformed
        pnl1.setVisible(false);
        pnl2.setVisible(false);
        pnlBuses.setVisible(false);
        pnlBuscar.setVisible(false);
        pnlInfo.setVisible(false);
        pnlTarjeta.setVisible(true);
        pnlMensajes.setVisible(false);
        pnlVerMensajes.setVisible(false);
        this.pnlContenedor.add(pnlTarjeta);
        this.pnlContenedor.validate();
        this.deshabilitarBotones();

    }//GEN-LAST:event_btnModoTarjetaActionPerformed

    private void btnMensajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMensajeActionPerformed
        pnl1.setVisible(false);
        pnl2.setVisible(false);
        pnlBuses.setVisible(false);
        pnlBuscar.setVisible(false);
        pnlInfo.setVisible(false);
        pnlTarjeta.setVisible(false);
        pnlMensajes.setVisible(true);
        pnlVerMensajes.setVisible(false);
        this.pnlContenedor.add(pnlMensajes);
        this.pnlContenedor.validate();
        this.deshabilitarBotones();
    }//GEN-LAST:event_btnMensajeActionPerformed

    private void btnVerMensajesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerMensajesActionPerformed
        pnl1.setVisible(false);
        pnl2.setVisible(false);
        pnlBuses.setVisible(false);
        pnlBuscar.setVisible(false);
        pnlInfo.setVisible(false);
        pnlTarjeta.setVisible(false);
        pnlMensajes.setVisible(false);
        pnlVerMensajes.setVisible(true);
        this.pnlContenedor.add(pnlVerMensajes);
        this.pnlContenedor.validate();
        this.deshabilitarBotones();
    }//GEN-LAST:event_btnVerMensajesActionPerformed

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
            java.util.logging.Logger.getLogger(frmPrincipalCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPrincipalCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPrincipalCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPrincipalCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPrincipalCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnBuses;
    private javax.swing.JButton btnInfo;
    private javax.swing.JButton btnInicio;
    private javax.swing.JButton btnMensaje;
    private javax.swing.JButton btnModoTarjeta;
    private javax.swing.JButton btnRecarga;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnVerMensajes;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel pnlBotones;
    private javax.swing.JPanel pnlContenedor;
    // End of variables declaration//GEN-END:variables

    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
