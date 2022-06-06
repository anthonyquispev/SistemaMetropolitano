package formulariosTrabajador;

import configuracion.Metropolitano;
import entidades.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

public class frmRecargarEnTaquilla extends javax.swing.JInternalFrame {

    public frmRecargarEnTaquilla() {
        initComponents();
        cargarComboDni();
        cargarComboEstaciones();
    }

    private void cargarComboDni() {
        String[] dnis = Metropolitano.personas.getDnis(2);
        for (String dni : dnis) {
            this.cboDni.addItem(dni);
        }
    }

    private void cargarTarjetas(Cliente cliente) {
        String[] tarjetas = cliente.getTarjetas();
        this.cboTarjetas.removeAllItems();
        for (String tarjeta : tarjetas) {
            this.cboTarjetas.addItem(tarjeta);
        }
    }

    private void cargarComboEstaciones() {
        String[] estaciones = Metropolitano.estaciones.getNombresSinEstVirtual();
        for (String estacion : estaciones) {
            this.cboEstaciones.addItem(estacion);
        }
    }

    private void actualizarSaldo() {
        this.txtSaldo.setText(String.valueOf(Metropolitano.tarjetaActual.getSaldo()));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cboEstaciones = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        cboDni = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtApellidoPaterno = new javax.swing.JTextField();
        txtApellidoMaterno = new javax.swing.JTextField();
        txtTipoDeTarjeta = new javax.swing.JTextField();
        txtSaldo = new javax.swing.JTextField();
        btnAgregarSaldo = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        cboTarjetas = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("CANTIDAD:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 290, 100, 40));

        cboEstaciones.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(204, 204, 0)));
        cboEstaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboEstacionesActionPerformed(evt);
            }
        });
        jPanel1.add(cboEstaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 210, 190, 50));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("DNI:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 122, 50));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("ESTACIÓN:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 210, 100, 43));

        txtCantidad.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtCantidad.setForeground(new java.awt.Color(0, 0, 0));
        txtCantidad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCantidad.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(153, 0, 0)));
        jPanel1.add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 280, 190, 50));

        cboDni.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(204, 204, 0)));
        cboDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboDniActionPerformed(evt);
            }
        });
        jPanel1.add(cboDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 150, 150, 50));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("NOMBRE:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 120, 40));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("APELLIDO PATERNO:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, 150, 40));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("APELLIDO MATERNO:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, 150, 40));

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("TIPO DE TARJETA:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 360, 160, 40));

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("SALDO:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 410, 120, 40));

        txtNombre.setBackground(new java.awt.Color(0, 102, 102));
        txtNombre.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(0, 0, 0));
        txtNombre.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        txtNombre.setEnabled(false);
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 210, 150, 40));

        txtApellidoPaterno.setBackground(new java.awt.Color(0, 102, 102));
        txtApellidoPaterno.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtApellidoPaterno.setForeground(new java.awt.Color(0, 0, 0));
        txtApellidoPaterno.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        txtApellidoPaterno.setEnabled(false);
        jPanel1.add(txtApellidoPaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 260, 150, 40));

        txtApellidoMaterno.setBackground(new java.awt.Color(0, 102, 102));
        txtApellidoMaterno.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtApellidoMaterno.setForeground(new java.awt.Color(0, 0, 0));
        txtApellidoMaterno.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        txtApellidoMaterno.setEnabled(false);
        jPanel1.add(txtApellidoMaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 310, 150, 40));

        txtTipoDeTarjeta.setBackground(new java.awt.Color(0, 102, 102));
        txtTipoDeTarjeta.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtTipoDeTarjeta.setForeground(new java.awt.Color(0, 0, 0));
        txtTipoDeTarjeta.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        txtTipoDeTarjeta.setEnabled(false);
        jPanel1.add(txtTipoDeTarjeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 360, 150, 40));

        txtSaldo.setBackground(new java.awt.Color(0, 102, 102));
        txtSaldo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtSaldo.setForeground(new java.awt.Color(0, 0, 0));
        txtSaldo.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        txtSaldo.setEnabled(false);
        jPanel1.add(txtSaldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 410, 150, 40));

        btnAgregarSaldo.setBackground(new java.awt.Color(0, 0, 0));
        btnAgregarSaldo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnAgregarSaldo.setForeground(new java.awt.Color(204, 0, 0));
        btnAgregarSaldo.setText("AGREGAR SALDO");
        btnAgregarSaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarSaldoActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgregarSaldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 360, 220, 90));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setText("TARJETA:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 150, 100, 50));

        cboTarjetas.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(204, 204, 0)));
        cboTarjetas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboTarjetasActionPerformed(evt);
            }
        });
        jPanel1.add(cboTarjetas, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 150, 190, 50));

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("RECARGAS");
        jLabel10.setBorder(javax.swing.BorderFactory.createMatteBorder(4, 4, 4, 4, new java.awt.Color(0, 150, 77)));
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 120));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 562, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cboDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboDniActionPerformed
        String dni = this.cboDni.getSelectedItem().toString();
        Metropolitano.clienteActual = Metropolitano.personas.getCliente(dni);
        cargarTarjetas(Metropolitano.clienteActual);
        this.txtNombre.setText(Metropolitano.clienteActual.getNombres());
        this.txtApellidoPaterno.setText(Metropolitano.clienteActual.getApellidoPaterno());
        this.txtApellidoMaterno.setText(Metropolitano.clienteActual.getApellidoMaterno());
    }//GEN-LAST:event_cboDniActionPerformed

    private void btnAgregarSaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarSaldoActionPerformed
        if (this.txtCantidad.getText().equals("")) return;
        
        double cantidad = Double.parseDouble(this.txtCantidad.getText());

        Date sistFecha = new Date();
        SimpleDateFormat formato = new SimpleDateFormat("dd-MM-YYYY");
        String fecha = formato.format(sistFecha);

        String nombreEstacion = Metropolitano.estacionActual.getNombre();

        MovimientoTarjeta mov
                = Metropolitano.tarjetaActual.recargar2(fecha, cantidad, nombreEstacion);

        if (Metropolitano.movimientosTarjeta.agregar(mov)) {
            this.actualizarSaldo();;
            JOptionPane.showMessageDialog(this, "Recarga exitosa");
        }

    }//GEN-LAST:event_btnAgregarSaldoActionPerformed

    private void cboEstacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboEstacionesActionPerformed
        String nombreEstacion = this.cboEstaciones.getSelectedItem().toString();
        Metropolitano.estacionActual = Metropolitano.estaciones.getEstacion(nombreEstacion);
    }//GEN-LAST:event_cboEstacionesActionPerformed

    private void cboTarjetasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboTarjetasActionPerformed
        if (this.cboTarjetas.getSelectedItem() == null) return;
        String codigo = this.cboTarjetas.getSelectedItem().toString();
        Metropolitano.tarjetaActual = Metropolitano.clienteActual.getTarjeta(codigo);
        this.txtTipoDeTarjeta.setText(Metropolitano.tarjetaActual.getTipo().getNombre());
        this.actualizarSaldo();
    }//GEN-LAST:event_cboTarjetasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarSaldo;
    private javax.swing.JComboBox<String> cboDni;
    private javax.swing.JComboBox<String> cboEstaciones;
    private javax.swing.JComboBox<String> cboTarjetas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtApellidoMaterno;
    private javax.swing.JTextField txtApellidoPaterno;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtSaldo;
    private javax.swing.JTextField txtTipoDeTarjeta;
    // End of variables declaration//GEN-END:variables
}
