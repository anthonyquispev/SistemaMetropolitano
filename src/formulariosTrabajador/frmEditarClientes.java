
package formulariosTrabajador;

import configuracion.Metropolitano;
import entidades.*;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class frmEditarClientes extends javax.swing.JInternalFrame {

    public frmEditarClientes() {
        initComponents();
        this.deshabilitarComponentes();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        txtTexto = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel4 = new javax.swing.JPanel();
        pnlContenedor1 = new javax.swing.JPanel();
        pnlBotonOpciones = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblNumeroDeResultados = new javax.swing.JLabel();
        pnlCheckBox = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jRadioButtonDni = new javax.swing.JRadioButton();
        jRadioButtonTodos2 = new javax.swing.JRadioButton();
        jRadioButtonApellidoPaterno = new javax.swing.JRadioButton();
        jRadioButtonApellidoMaterno = new javax.swing.JRadioButton();
        jRadioButtonTodos1 = new javax.swing.JRadioButton();
        jRadioButtonNombres = new javax.swing.JRadioButton();
        jRadioButtonTrabajadores = new javax.swing.JRadioButton();
        jRadioButtonClientes = new javax.swing.JRadioButton();
        jRadioButtonChoferes = new javax.swing.JRadioButton();
        pnlContenedor2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblPersonas = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        btnMostrarTodos = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtEdad = new javax.swing.JTextField();
        txtDni = new javax.swing.JTextField();
        txtNombres = new javax.swing.JTextField();
        txtApellidoPaterno = new javax.swing.JTextField();
        txtApellidoMaterno = new javax.swing.JTextField();

        setPreferredSize(new java.awt.Dimension(1332, 682));
        setRequestFocusEnabled(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtTexto.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jPanel2.add(txtTexto, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 240, 60));

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlContenedor1.setLayout(new java.awt.CardLayout());

        jButton1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton1.setText("OPCIONES DE BÚSQUEDA");
        jButton1.setBorder(null);
        buttonGroup1.add(jButton1);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel1.setText("Resultados encontrados:");

        lblNumeroDeResultados.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        lblNumeroDeResultados.setForeground(new java.awt.Color(255, 0, 0));
        lblNumeroDeResultados.setOpaque(true);

        javax.swing.GroupLayout pnlBotonOpcionesLayout = new javax.swing.GroupLayout(pnlBotonOpciones);
        pnlBotonOpciones.setLayout(pnlBotonOpcionesLayout);
        pnlBotonOpcionesLayout.setHorizontalGroup(
            pnlBotonOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBotonOpcionesLayout.createSequentialGroup()
                .addContainerGap(7, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlBotonOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBotonOpcionesLayout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))
                    .addGroup(pnlBotonOpcionesLayout.createSequentialGroup()
                        .addComponent(lblNumeroDeResultados, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        pnlBotonOpcionesLayout.setVerticalGroup(
            pnlBotonOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBotonOpcionesLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNumeroDeResultados, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBotonOpcionesLayout.createSequentialGroup()
                .addContainerGap(51, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pnlContenedor1.add(pnlBotonOpciones, "card1");

        pnlCheckBox.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton2.setText("CERRAR");
        jButton2.setBorder(null);
        buttonGroup1.add(jButton2);
        jButton2.setOpaque(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        pnlCheckBox.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 10, 110, 40));

        buttonGroup2.add(jRadioButtonDni);
        jRadioButtonDni.setText("DNI");
        pnlCheckBox.add(jRadioButtonDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        buttonGroup3.add(jRadioButtonTodos2);
        jRadioButtonTodos2.setSelected(true);
        jRadioButtonTodos2.setText("Todos");
        pnlCheckBox.add(jRadioButtonTodos2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 70, -1, -1));

        buttonGroup2.add(jRadioButtonApellidoPaterno);
        jRadioButtonApellidoPaterno.setText("Apellidos Paternos");
        pnlCheckBox.add(jRadioButtonApellidoPaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        buttonGroup2.add(jRadioButtonApellidoMaterno);
        jRadioButtonApellidoMaterno.setText("Apellidos Maternos");
        pnlCheckBox.add(jRadioButtonApellidoMaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        buttonGroup2.add(jRadioButtonTodos1);
        jRadioButtonTodos1.setSelected(true);
        jRadioButtonTodos1.setText("Todos");
        pnlCheckBox.add(jRadioButtonTodos1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        buttonGroup2.add(jRadioButtonNombres);
        jRadioButtonNombres.setText("Nombres");
        pnlCheckBox.add(jRadioButtonNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        buttonGroup3.add(jRadioButtonTrabajadores);
        jRadioButtonTrabajadores.setText("Trabajadores");
        pnlCheckBox.add(jRadioButtonTrabajadores, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, -1, -1));

        buttonGroup3.add(jRadioButtonClientes);
        jRadioButtonClientes.setText("Clientes");
        pnlCheckBox.add(jRadioButtonClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, -1, -1));

        buttonGroup3.add(jRadioButtonChoferes);
        jRadioButtonChoferes.setText("Choferes");
        pnlCheckBox.add(jRadioButtonChoferes, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 50, -1, -1));

        pnlContenedor1.add(pnlCheckBox, "card2");

        jPanel4.add(pnlContenedor1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 130));

        pnlContenedor2.setLayout(new java.awt.BorderLayout());

        tblPersonas.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tblPersonas.setModel(new javax.swing.table.DefaultTableModel(
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
        tblPersonas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPersonasMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblPersonas);

        pnlContenedor2.add(jScrollPane2, java.awt.BorderLayout.CENTER);

        jPanel4.add(pnlContenedor2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 650, 260));

        jScrollPane1.setViewportView(jPanel4);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 660, 450));

        jButton3.setBackground(new java.awt.Color(204, 0, 51));
        jButton3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 0, 0));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/search_64px.png"))); // NOI18N
        jButton3.setText("BUSCAR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 50, 160, 60));

        btnMostrarTodos.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        btnMostrarTodos.setText("MOSTRAR TODOS");
        btnMostrarTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarTodosActionPerformed(evt);
            }
        });
        jPanel2.add(btnMostrarTodos, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 50, 180, 60));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 610));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnModificar.setBackground(new java.awt.Color(153, 0, 51));
        btnModificar.setFont(new java.awt.Font("Dialog", 1, 17)); // NOI18N
        btnModificar.setForeground(new java.awt.Color(0, 0, 0));
        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/edit_file_80px.png"))); // NOI18N
        btnModificar.setText("MODIFICAR");
        btnModificar.setBorder(null);
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        jPanel3.add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 210, 80));

        btnEliminar.setBackground(new java.awt.Color(153, 0, 51));
        btnEliminar.setFont(new java.awt.Font("Dialog", 1, 17)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(0, 0, 0));
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/remove_80px.png"))); // NOI18N
        btnEliminar.setText("ELIMINAR");
        btnEliminar.setBorder(null);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel3.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 210, 80));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("NOMBRES:");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 160, 40));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setText("APELLIDO PATERNO:");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, 160, 40));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setText("APELLIDO MATERNO:");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 440, 160, 40));

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setText("EDAD:");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 500, 150, 40));

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel9.setText("DNI:");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 160, 40));

        txtEdad.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        txtEdad.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), new java.awt.Color(102, 0, 51)));
        jPanel3.add(txtEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 500, 200, 40));

        txtDni.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        txtDni.setEnabled(false);
        jPanel3.add(txtDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 260, 200, 40));

        txtNombres.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        txtNombres.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), new java.awt.Color(102, 0, 51)));
        jPanel3.add(txtNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 320, 200, 40));

        txtApellidoPaterno.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        txtApellidoPaterno.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), new java.awt.Color(102, 0, 51)));
        jPanel3.add(txtApellidoPaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 380, 200, 40));

        txtApellidoMaterno.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        txtApellidoMaterno.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), new java.awt.Color(102, 0, 51)));
        jPanel3.add(txtApellidoMaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 440, 200, 40));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 0, 450, 580));

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ((CardLayout) pnlContenedor1.getLayout()).show(pnlContenedor1, "card2");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        ((CardLayout) pnlContenedor1.getLayout()).show(pnlContenedor1, "card1");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String texto = this.txtTexto.getText();
        texto = texto.toUpperCase();
        String[][] s = null;
        if (texto.equals("")) {
            if (this.jRadioButtonTrabajadores.isSelected()) {
                s = Metropolitano.personas.getPersonasTrabajadores();
            }
            if (this.jRadioButtonClientes.isSelected()) {
                s = Metropolitano.personas.getPersonasClientes();
            }
            if (this.jRadioButtonChoferes.isSelected()) {
                s = Metropolitano.personas.getPersonasChoferes();
            }
            if (this.jRadioButtonTodos2.isSelected()) {
                s = Metropolitano.personas.getPersonasAll();
            }
        } else {
            if (this.jRadioButtonDni.isSelected()) {
                if (this.jRadioButtonTrabajadores.isSelected()) {
                    s = Metropolitano.personas.getDatosDni2(texto, 1);
                }
                if (this.jRadioButtonClientes.isSelected()) {
                    s = Metropolitano.personas.getDatosDni2(texto, 2);
                }
                if (this.jRadioButtonChoferes.isSelected()) {
                    s = Metropolitano.personas.getDatosDni2(texto, 3);
                }
                if (this.jRadioButtonTodos2.isSelected()) {
                    s = Metropolitano.personas.getDatosDni2(texto, 4);
                }
            } else if (this.jRadioButtonNombres.isSelected()) {
                if (this.jRadioButtonTrabajadores.isSelected()) {
                    s = Metropolitano.personas.getDatosNombres2(texto, 1);
                }
                if (this.jRadioButtonClientes.isSelected()) {
                    s = Metropolitano.personas.getDatosNombres2(texto, 2);
                }
                if (this.jRadioButtonChoferes.isSelected()) {
                    s = Metropolitano.personas.getDatosNombres2(texto, 3);
                }
                if (this.jRadioButtonTodos2.isSelected()) {
                    s = Metropolitano.personas.getDatosNombres2(texto, 4);
                }
            } else if (this.jRadioButtonApellidoPaterno.isSelected()) {
                if (this.jRadioButtonTrabajadores.isSelected()) {
                    s = Metropolitano.personas.getDatosApellidosPaternos2(texto, 1);
                }
                if (this.jRadioButtonClientes.isSelected()) {
                    s = Metropolitano.personas.getDatosApellidosPaternos2(texto, 2);
                }
                if (this.jRadioButtonChoferes.isSelected()) {
                    s = Metropolitano.personas.getDatosApellidosPaternos2(texto, 3);
                }
                if (this.jRadioButtonTodos2.isSelected()) {
                    s = Metropolitano.personas.getDatosApellidosPaternos2(texto, 4);
                }
            } else if (this.jRadioButtonApellidoMaterno.isSelected()) {
                if (this.jRadioButtonTrabajadores.isSelected()) {
                    s = Metropolitano.personas.getDatosApellidosMaternos2(texto, 1);
                }
                if (this.jRadioButtonClientes.isSelected()) {
                    s = Metropolitano.personas.getDatosApellidosMaternos2(texto, 2);
                }
                if (this.jRadioButtonChoferes.isSelected()) {
                    s = Metropolitano.personas.getDatosApellidosMaternos2(texto, 3);
                }
                if (this.jRadioButtonTodos2.isSelected()) {
                    s = Metropolitano.personas.getDatosApellidosMaternos2(texto, 4);
                }
            } else if (this.jRadioButtonTodos1.isSelected()) {
                if (this.jRadioButtonTrabajadores.isSelected()) {
                    s = Metropolitano.personas.getDatos2(texto, 1);
                }
                if (this.jRadioButtonClientes.isSelected()) {
                    s = Metropolitano.personas.getDatos2(texto, 2);
                }
                if (this.jRadioButtonChoferes.isSelected()) {
                    s = Metropolitano.personas.getDatos2(texto, 3);
                }
                if (this.jRadioButtonTodos2.isSelected()) {
                    s = Metropolitano.personas.getDatos2(texto, 4);
                }
            }
        }
        this.cargarTabla(s);
        this.numeroResultados(s);
        this.deshabilitarComponentes();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void deshabilitarComponentes() {
        this.btnModificar.setEnabled(false);
        this.btnEliminar.setEnabled(false);
        this.txtDni.setText("");
        this.txtDni.setEnabled(false);
        this.txtNombres.setText("");
        this.txtNombres.setEnabled(false);
        this.txtApellidoPaterno.setText("");
        this.txtApellidoPaterno.setEnabled(false);
        this.txtApellidoMaterno.setText("");
        this.txtApellidoMaterno.setEnabled(false);
        this.txtEdad.setText("");
        this.txtEdad.setEnabled(false);
    }

    private void habilitarComponentes() {
        this.btnModificar.setEnabled(true);
        this.btnEliminar.setEnabled(true);
        this.txtNombres.setEnabled(true);
        this.txtApellidoPaterno.setEnabled(true);
        this.txtApellidoMaterno.setEnabled(true);
        this.txtEdad.setEnabled(true);
    }
    private void tblPersonasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPersonasMouseClicked
        int sel = this.tblPersonas.rowAtPoint(evt.getPoint());
        String dni = String.valueOf(this.tblPersonas.getValueAt(sel, 4));
        Metropolitano.personaActual = Metropolitano.personas.getPersona(dni);
        this.habilitarComponentes();
        this.cargarDatos();
        if(Metropolitano.personaActual instanceof Trabajador){
            this.btnEliminar.setEnabled(false);
        }
    }//GEN-LAST:event_tblPersonasMouseClicked

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        String nombres = this.txtNombres.getText();
        String aPaternos = this.txtApellidoPaterno.getText();
        String aMaternos = this.txtApellidoMaterno.getText();
        int edad = Integer.parseInt(this.txtEdad.getText());
        Persona tempPersona = new Persona(nombres, aPaternos, aMaternos, edad);
        if (Metropolitano.personas.modificar(Metropolitano.personaActual, tempPersona)) {
            this.jButton3ActionPerformed(evt);
            this.deshabilitarComponentes();
            JOptionPane.showMessageDialog(this, "Modificado correctamente");
        }

    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if (Metropolitano.personas.eliminar(Metropolitano.personaActual)) {
            this.jButton3ActionPerformed(evt);
            this.deshabilitarComponentes();
            JOptionPane.showMessageDialog(this, "Eliminado correctamente");
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnMostrarTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarTodosActionPerformed
        this.txtTexto.setText("");
        String[][] s = Metropolitano.personas.getPersonasAll();
        this.cargarTabla(s);
        this.numeroResultados(s);
    }//GEN-LAST:event_btnMostrarTodosActionPerformed
    private void cargarTabla(String[][] s) {
        String[] titulos = {"Nombres", "A.Paternos", "A.Maternos", "Edad", "DNI", "Tipo"};
        DefaultTableModel modelo = new DefaultTableModel(s, titulos);
        this.tblPersonas.setModel(modelo);
    }

    private void cargarDatos() {
        this.txtDni.setText(Metropolitano.personaActual.getDni());
        this.txtNombres.setText(Metropolitano.personaActual.getNombres());
        this.txtApellidoPaterno.setText(Metropolitano.personaActual.getApellidoPaterno());
        this.txtApellidoMaterno.setText(Metropolitano.personaActual.getApellidoMaterno());
        this.txtEdad.setText(String.valueOf(Metropolitano.personaActual.getEdad()));
    }

    private void numeroResultados(String[][] s) {
        if (s == null) {
            this.lblNumeroDeResultados.setForeground(Color.RED);
            this.lblNumeroDeResultados.setText("No se encontró ningún resultado");
        } else {
            int n = s.length;

            if (n >= 1 && n <= 15) {
                this.lblNumeroDeResultados.setForeground(Color.BLACK);
                this.lblNumeroDeResultados.setText("" + n);
            } else if (n >= 16) {
                this.lblNumeroDeResultados.setForeground(Color.GREEN);
                this.lblNumeroDeResultados.setText("" + n);
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnMostrarTodos;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JRadioButton jRadioButtonApellidoMaterno;
    private javax.swing.JRadioButton jRadioButtonApellidoPaterno;
    private javax.swing.JRadioButton jRadioButtonChoferes;
    private javax.swing.JRadioButton jRadioButtonClientes;
    private javax.swing.JRadioButton jRadioButtonDni;
    private javax.swing.JRadioButton jRadioButtonNombres;
    private javax.swing.JRadioButton jRadioButtonTodos1;
    private javax.swing.JRadioButton jRadioButtonTodos2;
    private javax.swing.JRadioButton jRadioButtonTrabajadores;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblNumeroDeResultados;
    private javax.swing.JPanel pnlBotonOpciones;
    private javax.swing.JPanel pnlCheckBox;
    private javax.swing.JPanel pnlContenedor1;
    private javax.swing.JPanel pnlContenedor2;
    private javax.swing.JTable tblPersonas;
    private javax.swing.JTextField txtApellidoMaterno;
    private javax.swing.JTextField txtApellidoPaterno;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtNombres;
    private javax.swing.JTextField txtTexto;
    // End of variables declaration//GEN-END:variables

}
