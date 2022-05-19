/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.sise.matricula.gui;

import com.edu.sise.matricula.entity.Carrera;
import com.edu.sise.matricula.entity.Provincia;
import com.edu.sise.matricula.entity.Profesor;
import com.edu.sise.matricula.logic.CarreraLogic;
import com.edu.sise.matricula.logic.ProvinciaLogic;
import com.edu.sise.matricula.logic.ProfesorLogic;
import java.time.LocalDate;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author Carlos
 */
public class ifrmProfesores extends javax.swing.JInternalFrame {

    /**
     * Creates new form ifrmProfesors
     */
    
    //atributo
    ProfesorLogic logica;
    ProvinciaLogic logicaProvinciaLogic;
    CarreraLogic logicaCarreraLogic;
    
    public ifrmProfesores() {
        initComponents();
        logica = new ProfesorLogic();
        logicaProvinciaLogic = new ProvinciaLogic();
        logicaCarreraLogic = new CarreraLogic();
        logica.imprimir(tbLista);
        logicaProvinciaLogic.llenarCboProvincias(cboProvincias);
        logicaCarreraLogic.llenarCboCarreras(cboCarreras);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtDni = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtPapellido = new javax.swing.JTextField();
        txtSapellido = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        cboProvincias = new javax.swing.JComboBox<>();
        cboCarreras = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        dtpFnacimiento = new org.jdatepicker.JDatePicker();
        btnListar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbLista = new javax.swing.JTable();
        btnSalir = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnCargaMasiva = new javax.swing.JButton();
        btnCargaMasiva1 = new javax.swing.JButton();
        lblQr = new javax.swing.JLabel();

        setClosable(true);

        panel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Ingrese Datos:"));

        jLabel1.setText("ID");

        jLabel2.setText("NOMBRE");

        txtId.setEditable(false);
        txtId.setBackground(java.awt.SystemColor.inactiveCaption);

        jLabel3.setText("DNI");

        jLabel4.setText("P. APELLIDO");

        jLabel5.setText("S. APELLIDO");

        jLabel6.setText("F. NACIMIENTO");

        jLabel7.setText("TELEFONO");

        jLabel8.setText("PROVINCIA");

        jLabel9.setText("CARRERA");

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cboCarreras, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtNombre)
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addComponent(txtPapellido, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5)
                                .addGap(40, 40, 40)
                                .addComponent(txtSapellido, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtDni, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtId, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(cboProvincias, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(dtpFnacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addGap(37, 37, 37)
                        .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtPapellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSapellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(dtpFnacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(cboCarreras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(cboProvincias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        btnListar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edu/sise/matricula/gui/resources/listar.png"))); // NOI18N
        btnListar.setText("Listar");
        btnListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarActionPerformed(evt);
            }
        });

        tbLista.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbLista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbListaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbLista);

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edu/sise/matricula/gui/resources/salir.png"))); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edu/sise/matricula/gui/resources/add.png"))); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edu/sise/matricula/gui/resources/modify.png"))); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edu/sise/matricula/gui/resources/delete.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnCargaMasiva.setText("Carga Masiva");
        btnCargaMasiva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargaMasivaActionPerformed(evt);
            }
        });

        btnCargaMasiva1.setText("Generar QR");
        btnCargaMasiva1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargaMasiva1ActionPerformed(evt);
            }
        });

        lblQr.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jScrollPane1))
                    .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnListar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAgregar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnModificar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(btnCargaMasiva, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCargaMasiva1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblQr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(9, 9, 9))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnListar, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCargaMasiva, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCargaMasiva1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblQr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(21, 21, 21)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarActionPerformed
        // TODO add your handling code here:
        //tbLista.setModel(logica.getModelo());
        logica.imprimir(tbLista);
    }//GEN-LAST:event_btnListarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // TODO add your handling code here:
        boolean rpta;
        
        int anio, mes, dia;
        anio = dtpFnacimiento.getModel().getYear();
        mes = dtpFnacimiento.getModel().getMonth()+1;
        dia = dtpFnacimiento.getModel().getDay();
        
        
        rpta = logica.agregarProfesor(new Profesor(
                -1,
                txtDni.getText(),
                txtNombre.getText(),
                txtPapellido.getText(),
                txtSapellido.getText(),
                LocalDate.of(anio,mes, dia),
                txtTelefono.getText(),
                ((Carrera)cboCarreras.getSelectedItem()).getId_carrera(),
                ((Provincia)cboProvincias.getSelectedItem()).getId_prov()
                
        ));
        if(rpta)
            JOptionPane.showMessageDialog(this, "Se registro correctamente  :) !!!");
        else
            JOptionPane.showMessageDialog(this, "No se pudo agregar el registro  :) !!!");
        
        logica.imprimir(tbLista);
        
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        // TODO add your handling code here:
        boolean rpta;
        int anio, mes, dia;
        anio = dtpFnacimiento.getModel().getYear();
        mes = dtpFnacimiento.getModel().getMonth()+1;
        dia = dtpFnacimiento.getModel().getDay();
        rpta = logica.modificarProfesor(new Profesor(
                Integer.parseInt(txtId.getText()),
                 txtDni.getText(),
                txtNombre.getText(),
                txtPapellido.getText(),
                txtSapellido.getText(),
                LocalDate.of(anio,mes, dia),
                txtTelefono.getText(),
                ((Carrera)cboCarreras.getSelectedItem()).getId_carrera(),
                ((Provincia)cboProvincias.getSelectedItem()).getId_prov()
                
        ));
        if(rpta)
            JOptionPane.showMessageDialog(this, "Se modifico correctamente  :) !!!");
        else
            JOptionPane.showMessageDialog(this, "No se pudo modificar el registro  :) !!!");
        logica.imprimir(tbLista);
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        boolean rpta;
        int op = -1;
        //pedir una re confirmación
        
        op = JOptionPane.showConfirmDialog(this, "¿Desea realmente eliminar el registro?", "SISTEMA", JOptionPane.YES_NO_OPTION);
        
        if(op==JOptionPane.YES_OPTION){
             rpta = logica.eliminarProfesor(Integer.parseInt(txtId.getText()));
            if(rpta)
                JOptionPane.showMessageDialog(this, "Se elimino correctamente  :) !!!");
            else
                JOptionPane.showMessageDialog(this, "No se pudo eliminar el registro  :) !!!");
        }
       
        logica.imprimir(tbLista);
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void tbListaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbListaMouseClicked
        // TODO add your handling code here:
        
        //primero quiero saber que fila ha sido seleccionada
        int fila = -1;
        int id_profe= -1, id_prov = -1, id_carrera=-1;
        String dni = "",nombre ="", papellido="", sapellido="",telefono="";
        LocalDate fnacimiento;
        
        //capturar la fila
        fila = tbLista.getSelectedRow();
        
        if(fila>=0){ //preguntamos si se ha seleccionado algo
            int x =0;
            id_profe= Integer.parseInt(String.valueOf(tbLista.getValueAt(fila, x++)));
            dni = String.valueOf(tbLista.getValueAt(fila, x++));
            nombre = String.valueOf(tbLista.getValueAt(fila, x++));
            papellido = String.valueOf(tbLista.getValueAt(fila, x++));
            sapellido = String.valueOf(tbLista.getValueAt(fila, x++));
            fnacimiento = LocalDate.parse(String.valueOf(tbLista.getValueAt(fila, x++)));
            telefono = String.valueOf(tbLista.getValueAt(fila, x++));
            id_carrera= Integer.parseInt(String.valueOf(tbLista.getValueAt(fila, x++)));
            id_prov= Integer.parseInt(String.valueOf(tbLista.getValueAt(fila, x++)));
            
            
             //muestralo en los TextField
        
            txtId.setText(id_profe+"");
            txtDni.setText(dni);
            txtNombre.setText(nombre);
            txtPapellido.setText(papellido);
            txtSapellido.setText(sapellido);
            
            dtpFnacimiento.getModel().setDate(
                    fnacimiento.getYear(),
                    fnacimiento.getMonthValue()-1,
                    fnacimiento.getDayOfMonth()
                );
            dtpFnacimiento.getModel().setSelected(true);
            
            txtTelefono.setText(telefono);
            logicaProvinciaLogic.seleccionarCboProvincias(cboProvincias, id_prov);
            logicaCarreraLogic.seleccionarCboCarreras(cboCarreras, id_carrera);
        }
        
       
        
    }//GEN-LAST:event_tbListaMouseClicked

    private void btnCargaMasivaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargaMasivaActionPerformed
        // TODO add your handling code here:
        JFileChooser buscador = new JFileChooser();
        buscador.showOpenDialog(this);
        
        String rutaArchivo = buscador.getSelectedFile().getAbsolutePath();
        
        int c = logica.cargaMasiva(rutaArchivo);
        
        if(c==0)
            JOptionPane.showMessageDialog(this, "No se puedo insertar ningun registro");
        else
            JOptionPane.showMessageDialog(this, "Se registraron: " + c );
        
        logica.imprimir(tbLista);
    }//GEN-LAST:event_btnCargaMasivaActionPerformed

    private void btnCargaMasiva1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargaMasiva1ActionPerformed
        // TODO add your handling code here:
        String valor = "";
        valor = txtId.getText() + "|" + txtDni.getText() + "|" + txtNombre.getText();
        
        logica.generarQR(valor,lblQr);
        
        
    }//GEN-LAST:event_btnCargaMasiva1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnCargaMasiva;
    private javax.swing.JButton btnCargaMasiva1;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnListar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> cboCarreras;
    private javax.swing.JComboBox<String> cboProvincias;
    private org.jdatepicker.JDatePicker dtpFnacimiento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblQr;
    private javax.swing.JPanel panel1;
    private javax.swing.JTable tbLista;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPapellido;
    private javax.swing.JTextField txtSapellido;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
