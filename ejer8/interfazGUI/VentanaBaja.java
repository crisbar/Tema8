/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer8.interfazGUI;

import ejer8.concesionario.Coche;
import ejer8.utilidades.GestorCoches;
import javax.swing.JOptionPane;

/**
 *
 * @author Cristina
 */
public class VentanaBaja extends javax.swing.JFrame {

    /**
     * Creates new form VentanaAlta
     */
    public VentanaBaja() {
        initComponents();
        this.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        etDibujo = new javax.swing.JLabel();
        etTitulo = new javax.swing.JLabel();
        etMatricula = new javax.swing.JLabel();
        etModelo = new javax.swing.JLabel();
        etKm = new javax.swing.JLabel();
        tfMatricula = new javax.swing.JTextField();
        tfModelo = new javax.swing.JTextField();
        tfKm = new javax.swing.JTextField();
        btBaja = new javax.swing.JButton();
        btCerrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("AUTOMÓVILES ACME");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        etDibujo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/miAudi.png"))); // NOI18N

        etTitulo.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        etTitulo.setForeground(new java.awt.Color(204, 0, 0));
        etTitulo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        etTitulo.setText("BAJA COCHE");

        etMatricula.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        etMatricula.setText("Matricula:");

        etModelo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        etModelo.setText("Modelo:");

        etKm.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        etKm.setText("Km:");

        tfMatricula.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        tfMatricula.setToolTipText("Introduce a matrícula: 8 dígitos");
        tfMatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfMatriculaActionPerformed(evt);
            }
        });

        tfModelo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        tfModelo.setToolTipText("Introduce el modelo, 20 dígitos");
        tfModelo.setEnabled(false);

        tfKm.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        tfKm.setToolTipText("Introduce los Km.");
        tfKm.setEnabled(false);

        btBaja.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btBaja.setText("BAJA");
        btBaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBajaActionPerformed(evt);
            }
        });

        btCerrar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btCerrar.setText("CERRAR");
        btCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCerrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(etMatricula)
                                .addGap(18, 18, 18)
                                .addComponent(tfMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(etTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(etDibujo, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(74, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(etModelo)
                                    .addComponent(etKm))
                                .addGap(38, 38, 38)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfKm, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btBaja, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btCerrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addContainerGap(54, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(etTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etMatricula)
                            .addComponent(tfMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(etDibujo))
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etModelo)
                    .addComponent(tfModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etKm)
                    .addComponent(tfKm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btBaja)
                    .addComponent(btCerrar))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBajaActionPerformed
        //damos de baja el coche, para ello, volvemos a buscarlo
        Coche c = GestorCoches.buscaCoche(tfMatricula.getText());
        if (c == null) {
            JOptionPane.showMessageDialog(this, "Matricula no encontrada", "BAJA COCHE", JOptionPane.WARNING_MESSAGE);
            tfMatricula.setText("");
            tfMatricula.requestFocus();
        } else {
            muestraCoche(c);
            int j = JOptionPane.showConfirmDialog(this,
                    "¿Seguro que desea dar de baja al " + c.getModelo() + "?", "BAJA  COCHE",
                    JOptionPane.YES_NO_OPTION);
            if (j == 0) {
                GestorCoches.bajaCoche(c);
                limpiaTexto();
                tfMatricula.requestFocus();
            }
        }

    }//GEN-LAST:event_btBajaActionPerformed
    private void limpiaTexto() {
        tfKm.setText("");
        tfMatricula.setText("");
        tfModelo.setText("");
    }
    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
        VentanaPrincipal vp = new VentanaPrincipal();
    }//GEN-LAST:event_formWindowClosed

    private void btCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCerrarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btCerrarActionPerformed

    private void muestraCoche(Coche c) {
        tfModelo.setText(c.getModelo());
        tfKm.setText(String.format("%,.2f", c.getKm()));
    }
    private void tfMatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfMatriculaActionPerformed
        //Buscamos el coche, si no existe mostramos el mensaje y si existe 
        //le mostramos los datos
        Coche c = GestorCoches.buscaCoche(tfMatricula.getText());
        if (c == null) {
            JOptionPane.showMessageDialog(this, "Matricula no encontrada", "BAJA COCHE", JOptionPane.WARNING_MESSAGE);
            tfMatricula.setText("");
            tfMatricula.requestFocus();
        } else {
            muestraCoche(c);
        }
    }//GEN-LAST:event_tfMatriculaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBaja;
    private javax.swing.JButton btCerrar;
    private javax.swing.JLabel etDibujo;
    private javax.swing.JLabel etKm;
    private javax.swing.JLabel etMatricula;
    private javax.swing.JLabel etModelo;
    private javax.swing.JLabel etTitulo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField tfKm;
    private javax.swing.JTextField tfMatricula;
    private javax.swing.JTextField tfModelo;
    // End of variables declaration//GEN-END:variables

}
