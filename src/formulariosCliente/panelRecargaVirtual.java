package formulariosCliente;

import configuracion.Metropolitano;
import entidades.MovimientoTarjeta;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

public class panelRecargaVirtual extends javax.swing.JPanel {

    public panelRecargaVirtual() {
        initComponents();
        this.cargarTarjetas();
        this.cargarSaldoActual();
    }

    private void cargarSaldoActual() {
        double saldo = Metropolitano.tarjetaActual.getSaldo();
        this.lblSaldoActual.setText(String.valueOf(saldo));
    }

    private void cargarTarjetas() {
        String[] tarjetas = Metropolitano.clienteActual.getTarjetas();
        for (String tarjeta : tarjetas) {
            this.cboTarjetas.addItem(tarjeta);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnRecargar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cboMonto = new javax.swing.JComboBox<>();
        cboTarjetas = new javax.swing.JComboBox<>();
        lblSaldoActual = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 102, 102));
        setPreferredSize(new java.awt.Dimension(422, 440));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnRecargar.setBackground(new java.awt.Color(0, 102, 0));
        btnRecargar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnRecargar.setForeground(new java.awt.Color(0, 0, 0));
        btnRecargar.setText("RECARGAR");
        btnRecargar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnRecargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecargarActionPerformed(evt);
            }
        });
        add(btnRecargar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 300, 200, 70));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("RECARGA VIRTUAL");
        jLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 80));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("SALDO ACTUAL:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 110, 40));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("MONTO:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 100, 40));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("TARJETA:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 100, 40));

        cboMonto.setBackground(new java.awt.Color(102, 102, 0));
        cboMonto.setForeground(new java.awt.Color(0, 0, 0));
        cboMonto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "S/. 5.00", "S/. 10.00", "S/. 20.00", "S/. 50.00" }));
        add(cboMonto, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 170, 40));

        cboTarjetas.setBackground(new java.awt.Color(102, 102, 0));
        cboTarjetas.setForeground(new java.awt.Color(0, 0, 0));
        cboTarjetas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboTarjetasActionPerformed(evt);
            }
        });
        add(cboTarjetas, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, 170, 40));

        lblSaldoActual.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblSaldoActual.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSaldoActual.setText("0.00");
        add(lblSaldoActual, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, 170, 40));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cell_phone_100px.png"))); // NOI18N
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 100, 100));
    }// </editor-fold>//GEN-END:initComponents

    private void btnRecargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecargarActionPerformed

        double monto = 0.0;
        int index = cboMonto.getSelectedIndex();
        switch (index) {
            case 0:
                monto = 5.0;
                break;
            case 1:
                monto = 10.0;
                break;
            case 2:
                monto = 20.0;
                break;
            case 3:
                monto = 50.0;
                break;
        }
        Date sistFecha = new Date();
        SimpleDateFormat formato = new SimpleDateFormat("dd-MM-YYYY");
        String fecha = formato.format(sistFecha);
        String nombreEstacion = Metropolitano.estacionActual.getNombre();
        MovimientoTarjeta mov
                = Metropolitano.tarjetaActual.recargar2(fecha, monto, nombreEstacion);

        if (Metropolitano.movimientosTarjeta.agregar(mov)) {
            JOptionPane.showMessageDialog(this, "Recarga exitosa");
        }
        double saldo = Metropolitano.tarjetaActual.getSaldo();

        this.lblSaldoActual.setText(String.valueOf(saldo));
    }//GEN-LAST:event_btnRecargarActionPerformed

    private void cboTarjetasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboTarjetasActionPerformed
        String codigo = this.cboTarjetas.getSelectedItem().toString();
        Metropolitano.tarjetaActual = Metropolitano.clienteActual.getTarjeta(codigo);
        cargarSaldoActual();
    }//GEN-LAST:event_cboTarjetasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRecargar;
    private javax.swing.JComboBox<String> cboMonto;
    private javax.swing.JComboBox<String> cboTarjetas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lblSaldoActual;
    // End of variables declaration//GEN-END:variables
}
