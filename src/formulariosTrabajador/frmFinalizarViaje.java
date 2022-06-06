package formulariosTrabajador;

import configuracion.Metropolitano;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class frmFinalizarViaje extends javax.swing.JInternalFrame {

    public frmFinalizarViaje() {
        initComponents();
        cargarTabla();
        cargarEstacionFinal();
        this.btnRegistrarViaje2.setEnabled(false);
    }

    private void cargarEstacionFinal() {
        String[] estaciones = Metropolitano.estaciones.getNombresSinEstVirtual();
        for (String estacion : estaciones) {
            this.cboEstacionFinal.addItem(estacion);
        }
    }

    private void cargarTabla() {
        String datos[][] = Metropolitano.viajes.getDatos2();
        String titulos[] = {"Nombres", "DNI", "CodigoTarjeta", "Estacion inicial", "TipoBus", "Chofer", "Inicio"};

        DefaultTableModel modelo = new DefaultTableModel(datos, titulos);
        this.tblViajes.setModel(modelo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblViajes = new javax.swing.JTable();
        btnRegistrarViaje2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        cboEstacionFinal = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblViajes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblViajes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblViajesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblViajes);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 980, 420));

        btnRegistrarViaje2.setBackground(new java.awt.Color(204, 0, 51));
        btnRegistrarViaje2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnRegistrarViaje2.setForeground(new java.awt.Color(0, 0, 0));
        btnRegistrarViaje2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/finish_flag_48px.png"))); // NOI18N
        btnRegistrarViaje2.setText("FINALIZAR VIAJE");
        btnRegistrarViaje2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnRegistrarViaje2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarViaje2ActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegistrarViaje2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 390, 250, 120));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("ESTACIÓN FINAL:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 190, 170, 50));

        cboEstacionFinal.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jPanel1.add(cboEstacionFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 270, 240, 50));

        jLabel2.setBackground(new java.awt.Color(255, 0, 102));
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/traveler_100px.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 30, 120, 110));

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblViajesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblViajesMouseClicked
        if (this.tblViajes.rowAtPoint(evt.getPoint()) == -1) return;
        
        int sel = this.tblViajes.rowAtPoint(evt.getPoint());
        this.btnRegistrarViaje2.setEnabled(true);
        String dni = String.valueOf(this.tblViajes.getValueAt(sel, 1));
        Metropolitano.clienteActual = Metropolitano.personas.getCliente(dni);
        String codigo = String.valueOf(this.tblViajes.getValueAt(sel, 2));
        Metropolitano.tarjetaActual = Metropolitano.clienteActual.getTarjeta(codigo);
        String fecha = String.valueOf(this.tblViajes.getValueAt(sel, 6));
        Metropolitano.movimientoViajeActual = Metropolitano.viajes.getMovimientoViaje(fecha);
    }//GEN-LAST:event_tblViajesMouseClicked

    private void btnRegistrarViaje2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarViaje2ActionPerformed
        String estacionFinal = this.cboEstacionFinal.getSelectedItem().toString();
        Metropolitano.movimientoViajeActual.setEstacionFinal(estacionFinal);
        String fecha = String.valueOf(new Date());
        Metropolitano.movimientoViajeActual.setHora_2(fecha);
        Metropolitano.clienteActual.setMovViaje_1(false);
        Metropolitano.movimientoViajeActual.setEstado(false);
        this.btnRegistrarViaje2.setEnabled(false);
        cargarTabla();
        JOptionPane.showMessageDialog(this, "Viaje finalizado");
    }//GEN-LAST:event_btnRegistrarViaje2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrarViaje2;
    private javax.swing.JComboBox<String> cboEstacionFinal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable tblViajes;
    // End of variables declaration//GEN-END:variables
}
