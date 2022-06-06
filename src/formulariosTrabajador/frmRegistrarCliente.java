package formulariosTrabajador;

import configuracion.Metropolitano;
import javax.swing.JOptionPane;
import entidades.*;
import enumerados.EnumTipoTarjeta;
import excepciones.MiExcepcion;

public class frmRegistrarCliente extends javax.swing.JInternalFrame {

    public frmRegistrarCliente() {
        initComponents();
        this.cargarEstaciones();
    }

    private void cargarEstaciones() {
        String[] estaciones = Metropolitano.estaciones.getNombresSinEstVirtual();
        for (String estacion : estaciones) {
            this.cboEstacion.addItem(estacion);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtNombres = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtApellidoPaterno = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtApellidoMaterno = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtDni = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtEdad = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        cboTipoTarjeta = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        jLabel10 = new javax.swing.JLabel();
        cboEstacion = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        btnRegistro = new javax.swing.JButton();

        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel2.setPreferredSize(new java.awt.Dimension(1140, 420));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("NOMBRES:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 90, 160, 50));

        txtNombres.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtNombres.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel2.add(txtNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 90, 186, 50));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("APELLIDO PATERNO:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 150, 150, 50));

        txtApellidoPaterno.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtApellidoPaterno.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel2.add(txtApellidoPaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 150, 186, 50));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setText("APELLIDO MATERNO:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 210, 160, 50));

        txtApellidoMaterno.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtApellidoMaterno.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel2.add(txtApellidoMaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 210, 186, 50));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("DNI:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 330, 150, 50));

        txtDni.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtDni.setForeground(new java.awt.Color(0, 0, 0));
        txtDni.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 153)));
        jPanel2.add(txtDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 330, 186, 50));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setText("EDAD:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 270, 150, 50));

        txtEdad.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtEdad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel2.add(txtEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 270, 186, 50));

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setText("TIPO DE TARJETA:");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 100, 150, 50));

        cboTipoTarjeta.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        cboTipoTarjeta.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ESCOLAR", "UNIVERSITARIO", "GENERAL" }));
        jPanel2.add(cboTipoTarjeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 100, 190, 50));

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("USERNAME:");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 250, 130, 50));

        txtUsername.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtUsername.setForeground(new java.awt.Color(0, 0, 0));
        txtUsername.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 153)));
        jPanel2.add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 250, 190, 50));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("PASSWORD:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 320, 140, 50));

        txtPassword.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtPassword.setForeground(new java.awt.Color(0, 0, 0));
        txtPassword.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel2.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 320, 190, 50));

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel10.setText("ESTACIÓN:");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 170, 150, 50));

        cboEstacion.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jPanel2.add(cboEstacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 170, 190, 50));

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("DATOS PERSONALES");
        jLabel11.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 0, 3, 0, new java.awt.Color(204, 0, 0)));
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, 240, 70));

        jLabel12.setBackground(new java.awt.Color(102, 51, 0));
        jLabel12.setForeground(new java.awt.Color(153, 0, 153));
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/user_account_240px.png"))); // NOI18N
        jLabel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 51), 2));
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 240, 280));

        jPanel1.add(jPanel2, java.awt.BorderLayout.CENTER);

        jLabel1.setBackground(new java.awt.Color(51, 0, 51));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("REGISTRO DE CLIENTES");
        jLabel1.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(51, 51, 0)));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1353, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(jPanel3, java.awt.BorderLayout.PAGE_START);

        btnRegistro.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        btnRegistro.setForeground(new java.awt.Color(0, 0, 0));
        btnRegistro.setText("REGISTRO");
        btnRegistro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 102, 0), 3));
        btnRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(567, 567, 567)
                .addComponent(btnRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(587, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.add(jPanel4, java.awt.BorderLayout.PAGE_END);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroActionPerformed
        try {
            String nombres = this.txtNombres.getText();
            String apellidoPaterno = this.txtApellidoPaterno.getText();
            String apellidoMaterno = this.txtApellidoMaterno.getText();
            String dni = this.txtDni.getText();
            int edad = Integer.parseInt(this.txtEdad.getText());
            String tipoTarjeta = this.cboTipoTarjeta.getSelectedItem().toString();
            String username = this.txtUsername.getText();
            String password = this.txtPassword.getText();

            Login login = new Login(username, password, 2);
            EnumTipoTarjeta tipo = null;
            double saldoInicial = 0;
            String codigo = Metropolitano.personas.validarCodigo();
            switch (tipoTarjeta) {
                case "ESCOLAR":
                    tipo = EnumTipoTarjeta.ESCOlAR;
                    break;
                case "UNIVERSITARIO":
                    tipo = EnumTipoTarjeta.UNIVERSITARIO;
                    break;
                case "GENERAL":
                    tipo = EnumTipoTarjeta.GENERAL;
                    break;
            }
            Metropolitano.estacionActual = Metropolitano.estaciones.getEstacion(this.cboEstacion.getSelectedItem().toString());
            Tarjeta t = Metropolitano.estacionActual.getTaquilla().emitirTarjeta(tipo, saldoInicial, codigo);
            Cliente cliente = new Cliente(0, nombres, apellidoPaterno,
                    apellidoMaterno, dni, edad, login);
            cliente.agregarTarjeta(t);
            if (Metropolitano.personas.agregar(cliente)) {
                JOptionPane.showMessageDialog(rootPane, " Registro satisfactorio!!!");

                System.out.println("Cuentra registrada:");
                System.out.println("\nUsername: " + username + "\nPassword: " + password);
                this.limpiarCampos();
            }
        } catch (MiExcepcion e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        } catch (NumberFormatException e) {
            if (this.txtEdad.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Rellene todos los campos");
            } else {
                JOptionPane.showMessageDialog(this, "Campo edad incorrecto");
            }
        }
    }//GEN-LAST:event_btnRegistroActionPerformed

    private void limpiarCampos() {
        this.txtNombres.setText("");
        this.txtApellidoPaterno.setText("");
        this.txtApellidoMaterno.setText("");
        this.txtDni.setText("");
        this.txtEdad.setText("");
        this.txtUsername.setText("");
        this.txtPassword.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistro;
    private javax.swing.JComboBox<String> cboEstacion;
    private javax.swing.JComboBox cboTipoTarjeta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField txtApellidoMaterno;
    private javax.swing.JTextField txtApellidoPaterno;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtNombres;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
