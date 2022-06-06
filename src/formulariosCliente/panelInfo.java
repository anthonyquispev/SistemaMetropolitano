
package formulariosCliente;

import configuracion.Metropolitano;

public class panelInfo extends javax.swing.JPanel {

    public panelInfo() {
        initComponents();
        this.cargarDatos();
    }

    private void cargarDatos(){
        this.lblNombre.setText(Metropolitano.clienteActual.getNombres());
        this.lblApellidoPaterno.setText(Metropolitano.clienteActual.getApellidoPaterno());
        this.lblApellidoMaterno.setText(Metropolitano.clienteActual.getApellidoMaterno());
        this.lblEdad.setText(String.valueOf(Metropolitano.clienteActual.getEdad()));
        this.lblDni.setText(Metropolitano.clienteActual.getDni());
        this.lblNumeroDeTarjetas.setText(String.valueOf(Metropolitano.clienteActual.getNumeroTarjetas()));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblApellidoPaterno = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblApellidoMaterno = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lblEdad = new javax.swing.JLabel();
        lblNumeroDeTarjetas = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lblDni = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 102, 102));
        setPreferredSize(new java.awt.Dimension(422, 440));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("INFORMACIÓN DEL CLIENTE");
        jLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 70));

        lblNombre.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        lblNombre.setText("____");
        add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, 160, 30));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("NOMBRE:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 160, 30));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("APELLIDO PATERNO:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 160, 30));

        lblApellidoPaterno.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        lblApellidoPaterno.setText("________");
        add(lblApellidoPaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, 160, 30));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("APELLIDO MATERNO");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, 160, 30));

        lblApellidoMaterno.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        lblApellidoMaterno.setText("_____");
        add(lblApellidoMaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 210, 160, 30));

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("EDAD:");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, 160, 30));

        lblEdad.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        lblEdad.setText("_____________");
        add(lblEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 260, 160, 30));

        lblNumeroDeTarjetas.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        lblNumeroDeTarjetas.setText("_______");
        add(lblNumeroDeTarjetas, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 360, 160, 30));

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("NÚMERO DE TARJETAS:");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, 170, 30));

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("DNI:");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, 160, 30));

        lblDni.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        lblDni.setText("_____________");
        add(lblDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 310, 160, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cv_80px.png"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, 80, 90));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblApellidoMaterno;
    private javax.swing.JLabel lblApellidoPaterno;
    private javax.swing.JLabel lblDni;
    private javax.swing.JLabel lblEdad;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNumeroDeTarjetas;
    // End of variables declaration//GEN-END:variables
}
