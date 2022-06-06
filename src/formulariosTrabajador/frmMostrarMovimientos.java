package formulariosTrabajador;

import configuracion.Metropolitano;
import entidades.*;
import java.awt.CardLayout;
import javax.swing.table.DefaultTableModel;

public class frmMostrarMovimientos extends javax.swing.JInternalFrame {

    private String estInicial = "Naranjal";
    private String estFinal = "Naranjal";

    public frmMostrarMovimientos() {
        initComponents();
        cargarComboEstacionInicial();
        cargarComboEstacionFinal();
    }

    private void cargarComboEstacionInicial() {
        String[] estaciones = Metropolitano.estaciones.getNombresConEstVirtual();
        for (String estacion : estaciones) {
            this.cboEstacionInicial.addItem(estacion);
        }
    }

    private void cargarComboEstacionFinal() {
        String[] estaciones = Metropolitano.estaciones.getNombresSinEstVirtual();
        for (String estacion : estaciones) {
            this.cboEstacionFinal.addItem(estacion);
        }
    }

    private void cargarTabla() {
        String[] titulos = {"Nombre", "Tarjeta", "Fecha", "Monto"};
        String[][] datos = Metropolitano.movimientosTarjeta.getDatos(this.estInicial);
        DefaultTableModel modelo = new DefaultTableModel(datos, titulos);
        this.tblRecargas.setModel(modelo);
    }

    private void cargarTablaViajes() {
        String[] titulos = {"E.Inicial", "HoraSubida", "E.Final", "HoraSalida", "Nombres", "Tarjeta"};
        String[][] datos = Metropolitano.viajes.getDatos(this.estInicial, this.estFinal);
        DefaultTableModel modelo = new DefaultTableModel(datos, titulos);
        this.tblViajes.setModel(modelo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        cboEstacionInicial = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        txtNumeroDeRecargas = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtMontoRecaudado = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtNumeroDeViajes = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtMontoRecaudado2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtMontoRecaudado3 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        cboEstacionFinal = new javax.swing.JComboBox<>();
        pnlMovimientos = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRecargas = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblViajes = new javax.swing.JTable();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("ESTACIÓN INICIAL:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 130, 50));

        cboEstacionInicial.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        cboEstacionInicial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboEstacionInicialActionPerformed(evt);
            }
        });
        jPanel1.add(cboEstacionInicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 120, 160, 50));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel1.setText("Número de recargas:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 140, 50));

        txtNumeroDeRecargas.setFont(new java.awt.Font("Dialog", 1, 17)); // NOI18N
        txtNumeroDeRecargas.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNumeroDeRecargas.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), new java.awt.Color(51, 0, 51)));
        txtNumeroDeRecargas.setEnabled(false);
        jPanel1.add(txtNumeroDeRecargas, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, 96, 50));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel2.setText("Monto recaudado:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 130, 50));

        txtMontoRecaudado.setFont(new java.awt.Font("Dialog", 1, 17)); // NOI18N
        txtMontoRecaudado.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMontoRecaudado.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), new java.awt.Color(51, 0, 51)));
        txtMontoRecaudado.setEnabled(false);
        jPanel1.add(txtMontoRecaudado, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 270, 96, 50));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel4.setText("Número de viajes:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 120, 50));

        txtNumeroDeViajes.setFont(new java.awt.Font("Dialog", 1, 17)); // NOI18N
        txtNumeroDeViajes.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNumeroDeViajes.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), new java.awt.Color(51, 0, 51)));
        txtNumeroDeViajes.setEnabled(false);
        jPanel1.add(txtNumeroDeViajes, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 340, 96, 50));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel5.setText("Monto recaudado:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 120, 50));

        txtMontoRecaudado2.setFont(new java.awt.Font("Dialog", 1, 17)); // NOI18N
        txtMontoRecaudado2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMontoRecaudado2.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), new java.awt.Color(51, 0, 51)));
        txtMontoRecaudado2.setEnabled(false);
        jPanel1.add(txtMontoRecaudado2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 410, 96, 50));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel6.setText("Monto total:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 480, 108, 50));

        txtMontoRecaudado3.setFont(new java.awt.Font("Dialog", 1, 17)); // NOI18N
        txtMontoRecaudado3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMontoRecaudado3.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), new java.awt.Color(51, 0, 51)));
        txtMontoRecaudado3.setEnabled(false);
        jPanel1.add(txtMontoRecaudado3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 480, 96, 50));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setText("ESTACIÓN FINAL:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 60, 130, 50));

        cboEstacionFinal.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        cboEstacionFinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboEstacionFinalActionPerformed(evt);
            }
        });
        jPanel1.add(cboEstacionFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(262, 120, 160, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 570));

        pnlMovimientos.setLayout(new java.awt.CardLayout());

        jPanel3.setLayout(new java.awt.BorderLayout());

        tblRecargas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblRecargas);

        jPanel3.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        pnlMovimientos.add(jPanel3, "Recargas");

        jPanel4.setLayout(new java.awt.BorderLayout());

        tblViajes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tblViajes);

        jPanel4.add(jScrollPane2, java.awt.BorderLayout.CENTER);

        pnlMovimientos.add(jPanel4, "Viajes");

        getContentPane().add(pnlMovimientos, new org.netbeans.lib.awtextra.AbsoluteConstraints(467, 129, 890, -1));

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jRadioButton1.setSelected(true);
        jRadioButton1.setText("Recargas");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 50, 130, 60));

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jRadioButton2.setText("Viajes");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 50, 120, 60));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cargarDatos() {
        Estacion tempEstacion = Metropolitano.estaciones.getEstacion(estInicial);
        Taquilla taq = tempEstacion.getTaquilla();
        this.txtNumeroDeRecargas.setText(String.valueOf(taq.getnRecargas()));
        this.txtMontoRecaudado.setText(String.valueOf(taq.getMontoRecaudado()));
        this.txtNumeroDeViajes.setText(String.valueOf(taq.getnViajes()));
        this.txtMontoRecaudado2.setText(String.valueOf(taq.getMontoViajes()));
        this.txtMontoRecaudado3.setText(String.valueOf(taq.getMontoRecaudado() + taq.getMontoViajes()));
    }
    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        ((CardLayout) pnlMovimientos.getLayout()).show(pnlMovimientos, "Recargas");
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        ((CardLayout) pnlMovimientos.getLayout()).show(pnlMovimientos, "Viajes");
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void cboEstacionFinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboEstacionFinalActionPerformed
        this.estFinal = this.cboEstacionFinal.getSelectedItem().toString();
        this.cargarTablaViajes();
    }//GEN-LAST:event_cboEstacionFinalActionPerformed

    private void cboEstacionInicialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboEstacionInicialActionPerformed
        this.estInicial = this.cboEstacionInicial.getSelectedItem().toString();
        this.cargarDatos();
        this.cargarTabla();
        this.cargarTablaViajes();
    }//GEN-LAST:event_cboEstacionInicialActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cboEstacionFinal;
    private javax.swing.JComboBox<String> cboEstacionInicial;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel pnlMovimientos;
    private javax.swing.JTable tblRecargas;
    private javax.swing.JTable tblViajes;
    private javax.swing.JTextField txtMontoRecaudado;
    private javax.swing.JTextField txtMontoRecaudado2;
    private javax.swing.JTextField txtMontoRecaudado3;
    private javax.swing.JTextField txtNumeroDeRecargas;
    private javax.swing.JTextField txtNumeroDeViajes;
    // End of variables declaration//GEN-END:variables
}
