
package tp6lp1.vistas;


import static java.lang.Long.parseLong;
import java.lang.reflect.Array;
import java.util.Map;
import tp6lp1.Cliente;



public class frm_BuscarClientes extends javax.swing.JInternalFrame {

    public frm_BuscarClientes() {
        initComponents();
        llenarListaTelefonos();
    }

private void limpiarCampos(){

    jTxtDni.setText("");
    jTxtApellido.setText("");
    jTxtNombre.setText("");
    jTxtCiudad.setText("");
    jTxtDomicilio.setText("");


};    
private void llenarDatosCliente(long telefonoCliente){

    Cliente cliente;
    cliente = MenuPrincipal.getDirectorio().buscarCliente(telefonoCliente);
    jTxtTelefono.setText(String.valueOf(telefonoCliente));
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
        
            if (telefono.toString().contains(jTxtTelefono_Dni.getText())){
            telefonos[i]= telefono.toString();
            i++;
            }
      }
        
    jLstListaTelefonos.setModel(new javax.swing.AbstractListModel<String>() {
    public int getSize() { return telefonos.length; }
    public String getElementAt(int i) { return telefonos[i]; }

    });
}

private void llenarListaDni(){

    int largoMapa = MenuPrincipal.getDirectorio().getDirectorio().size();
    String[] dniA = new String[largoMapa];
    int i=0;
        jLstListaTelefonos.removeAll();
        
        for (Map.Entry<Long,Cliente> e: MenuPrincipal.getDirectorio().getDirectorio().entrySet()) {
            Long dni = e.getValue().getDni();
            if (dni.toString().contains(jTxtTelefono_Dni.getText())){
            dniA[i]= dni.toString();
            i++;
            }
      }
        
    jLstListaTelefonos.setModel(new javax.swing.AbstractListModel<String>() {
    public int getSize() { return dniA.length; }
    public String getElementAt(int i) { return dniA[i]; }

    });
}
    
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jLstListaTelefonos = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();
        jTxtTelefono_Dni = new javax.swing.JTextField();
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
        jTxtTelefono = new javax.swing.JTextField();
        jLblTelefono_Dni = new javax.swing.JLabel();
        jRbtnTelefono = new javax.swing.JRadioButton();
        jRbtnDni = new javax.swing.JRadioButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Búsqueda de Clientes");

        jLstListaTelefonos.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jLstListaTelefonosValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(jLstListaTelefonos);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel2.setText("Teléfono:");

        jTxtTelefono_Dni.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTxtTelefono_DniFocusGained(evt);
            }
        });
        jTxtTelefono_Dni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTxtTelefono_DniKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTxtTelefono_DniKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTxtTelefono_DniKeyTyped(evt);
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

        jTxtTelefono.setEditable(false);
        jTxtTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtTelefonoActionPerformed(evt);
            }
        });

        jLblTelefono_Dni.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLblTelefono_Dni.setText("Teléfono:");

        buttonGroup.add(jRbtnTelefono);
        jRbtnTelefono.setSelected(true);
        jRbtnTelefono.setText("Buscar por Teléfono");
        jRbtnTelefono.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jRbtnTelefonoStateChanged(evt);
            }
        });
        jRbtnTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRbtnTelefonoActionPerformed(evt);
            }
        });

        buttonGroup.add(jRbtnDni);
        jRbtnDni.setText("Buscar por DNI");
        jRbtnDni.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jRbtnDniStateChanged(evt);
            }
        });
        jRbtnDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRbtnDniActionPerformed(evt);
            }
        });

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
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLblTelefono_Dni)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRbtnDni)
                                    .addComponent(jTxtTelefono_Dni, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jRbtnTelefono))))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTxtCiudad, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTxtNombre, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTxtApellido, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTxtDni, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTxtTelefono, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                            .addComponent(jLabel2)
                            .addComponent(jTxtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTxtDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jRbtnTelefono)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRbtnDni)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTxtTelefono_Dni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLblTelefono_Dni))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addComponent(jBtnSalir)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTxtDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtDniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtDniActionPerformed

    private void jBtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSalirActionPerformed
         this.dispose();
    }//GEN-LAST:event_jBtnSalirActionPerformed

    private void jTxtTelefono_DniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTxtTelefono_DniKeyTyped
       
    }//GEN-LAST:event_jTxtTelefono_DniKeyTyped

    private void jTxtTelefono_DniKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTxtTelefono_DniKeyPressed
        
    }//GEN-LAST:event_jTxtTelefono_DniKeyPressed

    private void jTxtTelefono_DniKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTxtTelefono_DniKeyReleased
llenarListaTelefonos();
    }//GEN-LAST:event_jTxtTelefono_DniKeyReleased

    private void jLstListaTelefonosValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jLstListaTelefonosValueChanged
         jTxtTelefono_Dni.setText(jLstListaTelefonos.getSelectedValue()); 
         
         if (jRbtnTelefono.isSelected()){         
            llenarDatosCliente(Long.parseLong(jLstListaTelefonos.getSelectedValue()));}
         else{
         
            for (Map.Entry<Long,Cliente> e: MenuPrincipal.getDirectorio().getDirectorio().entrySet()) {
                Long dni = e.getValue().getDni();
            if (dni.toString().equals(jLstListaTelefonos.getSelectedValue())){
            llenarDatosCliente(Long.parseLong(e.getKey().toString()));
            }
      }
             
             
         }
    }//GEN-LAST:event_jLstListaTelefonosValueChanged

    private void jTxtTelefono_DniFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTxtTelefono_DniFocusGained
       limpiarCampos();
    }//GEN-LAST:event_jTxtTelefono_DniFocusGained

    private void jTxtTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtTelefonoActionPerformed

    private void jRbtnDniStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jRbtnDniStateChanged
       
    }//GEN-LAST:event_jRbtnDniStateChanged

    private void jRbtnTelefonoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jRbtnTelefonoStateChanged
        
    }//GEN-LAST:event_jRbtnTelefonoStateChanged

    private void jRbtnTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRbtnTelefonoActionPerformed
        jTxtTelefono_Dni.setText("");
        if (jRbtnTelefono.isSelected()){
            jLblTelefono_Dni.setText("Telefono:");
            llenarListaTelefonos();
        }else{llenarListaDni();
            jLblTelefono_Dni.setText("        DNI:");}
    }//GEN-LAST:event_jRbtnTelefonoActionPerformed

    private void jRbtnDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRbtnDniActionPerformed
        
        jTxtTelefono_Dni.setText("");
        if (jRbtnDni.isSelected()){
            jLblTelefono_Dni.setText("        DNI:");
            llenarListaDni();
        }else{llenarListaTelefonos();
        jLblTelefono_Dni.setText("Telefono:");}
    }//GEN-LAST:event_jRbtnDniActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup;
    private javax.swing.JButton jBtnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLblTelefono_Dni;
    private javax.swing.JList<String> jLstListaTelefonos;
    private javax.swing.JRadioButton jRbtnDni;
    private javax.swing.JRadioButton jRbtnTelefono;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTxtApellido;
    private javax.swing.JTextField jTxtCiudad;
    private javax.swing.JTextField jTxtDni;
    private javax.swing.JTextField jTxtDomicilio;
    private javax.swing.JTextField jTxtNombre;
    private javax.swing.JTextField jTxtTelefono;
    private javax.swing.JTextField jTxtTelefono_Dni;
    // End of variables declaration//GEN-END:variables
}
