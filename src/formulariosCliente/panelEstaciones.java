package formulariosCliente;

import configuracion.Metropolitano;
import entidades.Rutas;

public class panelEstaciones extends javax.swing.JPanel {

    public panelEstaciones() {
        initComponents();
        this.cargarEstacionInicial();
        this.cargarEstacionFinal();
    }

    private void cargarEstacionInicial() {
        String[] estaciones = Metropolitano.estaciones.getNombresSinEstVirtual();
        for (String estacion : estaciones) {
            this.cboEstacionInicial.addItem(estacion);
        }
    }
    private void cargarEstacionFinal() {
        String[] estaciones = Metropolitano.estaciones.getNombresSinEstVirtual();
        for (String estacion : estaciones) {
            this.cboEstacionFinal.addItem(estacion);
        }
    }

@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        cboEstacionInicial = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        cboEstacionFinal = new javax.swing.JComboBox<>();
        btnBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtBuses = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 102, 102));
        setPreferredSize(new java.awt.Dimension(422, 440));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Origen:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 80, 40));

        cboEstacionInicial.setBackground(new java.awt.Color(102, 102, 0));
        cboEstacionInicial.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        add(cboEstacionInicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 190, 40));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setText("Destino:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 80, 40));

        cboEstacionFinal.setBackground(new java.awt.Color(102, 102, 0));
        cboEstacionFinal.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        add(cboEstacionFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 190, 40));

        btnBuscar.setBackground(new java.awt.Color(51, 0, 51));
        btnBuscar.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(0, 153, 153));
        btnBuscar.setText("BUSCAR");
        btnBuscar.setBorder(null);
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, 150, 50));

        txtBuses.setBackground(new java.awt.Color(0, 204, 204));
        txtBuses.setColumns(20);
        txtBuses.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtBuses.setRows(5);
        jScrollPane1.setViewportView(txtBuses);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, 260, 200));

        jLabel3.setBackground(new java.awt.Color(153, 0, 51));
        jLabel3.setForeground(new java.awt.Color(204, 0, 51));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/route_64px.png"))); // NOI18N
        jLabel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 70, 90, 90));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        jLabel4.setText("BUSES DISPONIBLES");
        jLabel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 60));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        this.txtBuses.setText("");
        Rutas tempRutas = new Rutas();
        boolean[][][][] matriz = tempRutas.getMatriz();
        String est1 = this.cboEstacionInicial.getSelectedItem().toString();
        String est2 = this.cboEstacionFinal.getSelectedItem().toString();
        String datos[] = Metropolitano.bus.busesDisponibles(matriz, est1, est2);
        String reporte = "";
        if (datos != null) {
            for (String dato : datos) {
                reporte += "  " + dato + "\n";
            }
        }
        this.txtBuses.setText(reporte);
    }//GEN-LAST:event_btnBuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JComboBox<String> cboEstacionFinal;
    private javax.swing.JComboBox<String> cboEstacionInicial;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtBuses;
    // End of variables declaration//GEN-END:variables
}
