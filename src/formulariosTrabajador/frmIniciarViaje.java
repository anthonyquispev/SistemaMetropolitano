package formulariosTrabajador;

import configuracion.Metropolitano;
import javax.swing.table.DefaultTableModel;
import entidades.*;
import java.util.Date;
import javax.swing.JOptionPane;

public class frmIniciarViaje extends javax.swing.JInternalFrame {

    public frmIniciarViaje() {
        initComponents();
        this.btnIngresarEstacion.setEnabled(false);
        this.cargarEstaciones();
        this.cargarTabla();
        cargarBuses();
        cargarChoferes();
    }

    private void cargarTarjeta() {
        String[] tarjetas = Metropolitano.clienteActual.getTarjetas();
        this.cboTarjetas.removeAllItems();
        for (String tarjeta : tarjetas) {
            this.cboTarjetas.addItem(tarjeta);
        }
    }

    private void cargarBuses() {
        String[] buses = Metropolitano.bus.getBus_();
        for (String bus : buses) {
            this.cboBuses.addItem(bus);
        }
    }

    private void cargarChoferes() {
        String[] choferes = Metropolitano.personas.getChoferes();
        for (String chofer : choferes) {
            this.cboChoferes.addItem(chofer);
        }
    }

    private void cargarEstaciones() {
        String[] estaciones = Metropolitano.estaciones.getNombresSinEstVirtual();
        for (String estacion : estaciones) {
            this.cboEstacionInicial.addItem(estacion);
        }
    }

    private void cargarTabla() {
        String datos[][] = Metropolitano.personas.getDatos();
        String titulos[] = {"Nombres", "Paterno", "Materno", "DNI"};
        DefaultTableModel modelo = new DefaultTableModel(datos, titulos);
        this.tblClientes.setModel(modelo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupOpcion = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblClientes = new javax.swing.JTable();
        jRadioButtonNombre = new javax.swing.JRadioButton();
        jRadioButtonDni = new javax.swing.JRadioButton();
        txtTexto = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnIngresarEstacion = new javax.swing.JButton();
        cboEstacionInicial = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        cboTarjetas = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cboChoferes = new javax.swing.JComboBox<>();
        cboBuses = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblClientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblClientes);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 730, 290));

        buttonGroupOpcion.add(jRadioButtonNombre);
        jRadioButtonNombre.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jRadioButtonNombre.setSelected(true);
        jRadioButtonNombre.setText("NOMBRE");
        jPanel1.add(jRadioButtonNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 110, 40));

        buttonGroupOpcion.add(jRadioButtonDni);
        jRadioButtonDni.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jRadioButtonDni.setText("DNI");
        jPanel1.add(jRadioButtonDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 110, 40));

        txtTexto.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jPanel1.add(txtTexto, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, 200, 50));

        btnBuscar.setBackground(new java.awt.Color(204, 153, 0));
        btnBuscar.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(204, 0, 0));
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/search_64px.png"))); // NOI18N
        btnBuscar.setText("BUSCAR");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 120, 200, 70));

        btnIngresarEstacion.setBackground(new java.awt.Color(204, 0, 51));
        btnIngresarEstacion.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnIngresarEstacion.setForeground(new java.awt.Color(0, 0, 0));
        btnIngresarEstacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/tour_bus_80px1.png"))); // NOI18N
        btnIngresarEstacion.setText("INICIAR VIAJE");
        btnIngresarEstacion.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 0, 51), null));
        btnIngresarEstacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarEstacionActionPerformed(evt);
            }
        });
        jPanel1.add(btnIngresarEstacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 390, 250, 100));

        jPanel1.add(cboEstacionInicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 100, 170, 50));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("ESTACIÓN INICIAL:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 100, 130, 50));

        cboTarjetas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboTarjetasActionPerformed(evt);
            }
        });
        jPanel1.add(cboTarjetas, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 320, 170, 50));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("TARJETA:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 320, 100, 50));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("CHOFER:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 170, 100, 50));

        jPanel1.add(cboChoferes, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 170, 170, 50));

        jPanel1.add(cboBuses, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 250, 170, 50));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setText("TIPO BUS:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 250, 100, 50));

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Busca a los clientes y los inserta en la tabla
    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        if (this.txtTexto.getText().equals("")) return;
        String[] titulos = {"Nombre", "Apellido paterno", "Apellido materno", "DNI"};
        String[][] datos = null;
        String text = this.txtTexto.getText();
        if (this.jRadioButtonNombre.isSelected()) {
            datos = Metropolitano.personas.getDatosNombre(text);
        } else if (this.jRadioButtonDni.isSelected()) {
            datos = Metropolitano.personas.getDatosDni(text);
        }
        DefaultTableModel modelo = new DefaultTableModel(datos, titulos);
        this.tblClientes.setModel(modelo);
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnIngresarEstacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarEstacionActionPerformed

        Cliente c = Metropolitano.clienteActual;
        String fecha = String.valueOf(new Date());
        String estacionInicial = this.cboEstacionInicial.getSelectedItem().toString();
        String tipoBus = this.cboBuses.getSelectedItem().toString();
        String dniChofer = this.cboChoferes.getSelectedItem().toString();
        MovimientoViaje mov = Metropolitano.tarjetaActual.entrarBus(estacionInicial, tipoBus, dniChofer, fecha);
        if (mov != null) {
            Metropolitano.viajes.agregar(mov);
            c.setMovViaje_1(true);
            this.cargarTabla();
            JOptionPane.showMessageDialog(this, "Movimiento registrado");
        } else {
            JOptionPane.showMessageDialog(this, "Saldo insuficiente");
        }

        this.btnIngresarEstacion.setEnabled(false);

    }//GEN-LAST:event_btnIngresarEstacionActionPerformed

    private void tblClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblClientesMouseClicked
        this.btnIngresarEstacion.setEnabled(true);
        int sel = this.tblClientes.rowAtPoint(evt.getPoint());
        String dni = String.valueOf(this.tblClientes.getValueAt(sel, 3));
        Metropolitano.clienteActual = Metropolitano.personas.getCliente(dni);
        cargarTarjeta();
    }//GEN-LAST:event_tblClientesMouseClicked

    private void cboTarjetasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboTarjetasActionPerformed
        if (this.cboTarjetas.getSelectedItem() == null) return;
        String codigo = this.cboTarjetas.getSelectedItem().toString();
        Metropolitano.tarjetaActual = Metropolitano.clienteActual.getTarjeta(codigo);
    }//GEN-LAST:event_cboTarjetasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnIngresarEstacion;
    private javax.swing.ButtonGroup buttonGroupOpcion;
    private javax.swing.JComboBox<String> cboBuses;
    private javax.swing.JComboBox<String> cboChoferes;
    private javax.swing.JComboBox<String> cboEstacionInicial;
    private javax.swing.JComboBox<String> cboTarjetas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButtonDni;
    private javax.swing.JRadioButton jRadioButtonNombre;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblClientes;
    private javax.swing.JTextField txtTexto;
    // End of variables declaration//GEN-END:variables
}
