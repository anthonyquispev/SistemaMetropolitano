package formulariosTrabajador;

import configuracion.Metropolitano;
import javax.swing.table.DefaultTableModel;

public class frmMostrarViajes extends javax.swing.JInternalFrame {

    public frmMostrarViajes() {
        initComponents();
        cargarTabla();
    }

    private void cargarTabla() {
        String[][] datos = Metropolitano.viajes.getDatos3();
        if (datos == null) return;
        String[] titulos = {"Nombres", "ApellidoPaterno", "ApellidoMaterno", "DNI", "EstacionInicial", "Inicio",
            "TipoBus", "Chofer", "EstacionFinal", "Fin"};

        DefaultTableModel modelo = new DefaultTableModel(datos, titulos);
        this.tblMovimientosViajes.setModel(modelo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMovimientosViajes = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new java.awt.BorderLayout());

        tblMovimientosViajes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblMovimientosViajes);

        jPanel1.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 1340, 370));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("VIAJES COMPLETADOS");
        jLabel1.setToolTipText("");
        jLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 0, 51), new java.awt.Color(153, 153, 0)));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 10, 310, 160));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/bus_200px.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 0, 190, 170));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblMovimientosViajes;
    // End of variables declaration//GEN-END:variables
}
