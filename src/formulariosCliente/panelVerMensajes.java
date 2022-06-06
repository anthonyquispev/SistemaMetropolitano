package formulariosCliente;

import configuracion.Metropolitano;
import javax.swing.table.DefaultTableModel;

public class panelVerMensajes extends javax.swing.JPanel {

    public panelVerMensajes() {
        initComponents();
        this.cargarMensajes();
    }
    private void cargarMensajes() {
        String[][] datos = Metropolitano.clienteActual.mensajes();
        String[] titulos = {"Cliente","Trabajador"};
        DefaultTableModel modelo = new DefaultTableModel(datos, titulos);
        this.tblMensajes.setModel(modelo);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblMensajes = new javax.swing.JTable();
        btnActualizarTabla = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 102, 102));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblMensajes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2"
            }
        ));
        jScrollPane1.setViewportView(tblMensajes);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 420, 300));

        btnActualizarTabla.setBackground(new java.awt.Color(204, 0, 51));
        btnActualizarTabla.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnActualizarTabla.setForeground(new java.awt.Color(0, 0, 0));
        btnActualizarTabla.setText("ACTUALIZAR");
        btnActualizarTabla.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnActualizarTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarTablaActionPerformed(evt);
            }
        });
        add(btnActualizarTabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 360, 200, 60));
    }// </editor-fold>//GEN-END:initComponents

    private void btnActualizarTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarTablaActionPerformed
        this.cargarMensajes();
    }//GEN-LAST:event_btnActualizarTablaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizarTabla;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblMensajes;
    // End of variables declaration//GEN-END:variables
}
