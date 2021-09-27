
package tp6lp1.vistas;


import static java.lang.Long.parseLong;
import java.lang.reflect.Array;
import java.util.Map;
import tp6lp1.Cliente;



public class frm_BuscarCliente extends javax.swing.JInternalFrame {

public frm_BuscarCliente() {
        initComponents();
        llenarListaTelefonos();
    }

private void limpiarCampos(){

    jTxtTelefono.setText("");
    jTxtDni.setText("");
    jTxtApellido.setText("");
    jTxtNombre.setText("");
    jTxtCiudad.setText("");
    jTxtDomicilio.setText("");
};    

private void llenarDatosCliente(long telefonoCliente){

    Cliente cliente;
    cliente = MenuPrincipal.getDirectorio().buscarCliente(telefonoCliente);
    
    jTxtDni.setText(String.valueOf(cliente.getDni()));
    jTxtApellido.setText(cliente.getApellido());
    jTxtNombre.setText(cliente.getNombre());
    jTxtCiudad.setText(cliente.getCiudad().toString());
    jTxtDomicilio.setText(cliente.getDireccion());



}   
private void llenarListaTelefonos(){

    int largoMapa = MenuPrincipal.getDirectorio().getDirectorio().size();
    String[] telefonos = new String[largoMapa];
    int i=0;
        
        jLstListaTelefonos.removeAll();
        
        for (Long telefono : MenuPrincipal.getDirectorio().getDirectorio().keySet()) {
        
            if (telefono.toString().contains(jTxtTelefono.getText())){
            telefonos[i]= telefono.toString();
            i++;
            }
      }
        
    jLstListaTelefonos.setModel(new javax.swing.AbstractListModel<String>() {
    public int getSize() { return telefonos.length; }
    public String getElementAt(int i) { return telefonos[i]; }

    });
}

@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jLstListaTelefonos = new javax.swing.JList<>();
        jTxtTelefono = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTxtDni = new javax.swing.JTextField();
        jTxtApellido = new javax.swing.JTextField();
        jTxtNombre = new javax.swing.JTextField();
        jTxtCiudad = new javax.swing.JTextField();
        jTxtDomicilio = new javax.swing.JTextField();
        jBtnSalir = new javax.swing.JButton();
        jLblTelefono = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Búsqueda de Clientes");

        jLstListaTelefonos.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jLstListaTelefonosValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(jLstListaTelefonos);

        jTxtTelefono.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTxtTelefonoFocusGained(evt);
            }
        });
        jTxtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTxtTelefonoKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTxtTelefonoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTxtTelefonoKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel3.setText("DNI:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel4.setText("Apellido:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel5.setText("Ciudad:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel6.setText("Domicilio:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel7.setText("Nombre:");

        jTxtDni.setEditable(false);
        jTxtDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtDniActionPerformed(evt);
            }
        });

        jTxtApellido.setEditable(false);

        jTxtNombre.setEditable(false);

        jTxtCiudad.setEditable(false);

        jTxtDomicilio.setEditable(false);

        jBtnSalir.setText("Salir");
        jBtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnSalirActionPerformed(evt);
            }
        });

        jLblTelefono.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLblTelefono.setText("Teléfono:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(273, 273, 273)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBtnSalir))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(296, 296, 296)
                                .addComponent(jLabel6))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLblTelefono)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTxtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTxtCiudad, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTxtNombre, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTxtApellido, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTxtDni, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTxtDomicilio, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(79, 79, 79))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTxtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTxtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTxtCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTxtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLblTelefono))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTxtDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(58, 58, 58)
                .addComponent(jBtnSalir)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTxtDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtDniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtDniActionPerformed

    private void jBtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSalirActionPerformed
         this.dispose();
    }//GEN-LAST:event_jBtnSalirActionPerformed

    private void jTxtTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTxtTelefonoKeyTyped
       
    }//GEN-LAST:event_jTxtTelefonoKeyTyped

    private void jTxtTelefonoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTxtTelefonoKeyPressed
        
    }//GEN-LAST:event_jTxtTelefonoKeyPressed

    private void jTxtTelefonoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTxtTelefonoKeyReleased
        llenarListaTelefonos();
    }//GEN-LAST:event_jTxtTelefonoKeyReleased

    private void jLstListaTelefonosValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jLstListaTelefonosValueChanged
         
        if (!jLstListaTelefonos.isSelectionEmpty()){
        jTxtTelefono.setText(jLstListaTelefonos.getSelectedValue()); 
        llenarDatosCliente(Long.parseLong(jLstListaTelefonos.getSelectedValue()));
        }
    }//GEN-LAST:event_jLstListaTelefonosValueChanged

    private void jTxtTelefonoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTxtTelefonoFocusGained
       limpiarCampos();
       llenarListaTelefonos();
    }//GEN-LAST:event_jTxtTelefonoFocusGained


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLblTelefono;
    private javax.swing.JList<String> jLstListaTelefonos;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTxtApellido;
    private javax.swing.JTextField jTxtCiudad;
    private javax.swing.JTextField jTxtDni;
    private javax.swing.JTextField jTxtDomicilio;
    private javax.swing.JTextField jTxtNombre;
    private javax.swing.JTextField jTxtTelefono;
    // End of variables declaration//GEN-END:variables
}
