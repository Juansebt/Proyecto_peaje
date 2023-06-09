/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyectopeaje;

import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author JU4N53
 */
public class FrmPeaje extends javax.swing.JFrame {

    Peaje nuevoPeaje = new Peaje();
    /**
     * Creates new form FrmPeaje
     */
    public FrmPeaje() {
        initComponents();
        setLocationRelativeTo(this);
        getContentPane().setBackground(Color.LIGHT_GRAY);
        btnCarro.setEnabled(false);
        btnBus.setEnabled(false);
        btnCamion.setEnabled(false);
        btnCerrar.setEnabled(false);
        btnTotalRecaudo.setEnabled(false);
        btnLimpiar.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTituloPeaje = new javax.swing.JLabel();
        btnCarro = new javax.swing.JButton();
        btnBus = new javax.swing.JButton();
        btnCamion = new javax.swing.JButton();
        lblCantCarros = new javax.swing.JLabel();
        lblCantBuses = new javax.swing.JLabel();
        lblCantCamiones = new javax.swing.JLabel();
        txtCarros = new javax.swing.JTextField();
        txtBuses = new javax.swing.JTextField();
        txtCamiones = new javax.swing.JTextField();
        txtRecaudo = new javax.swing.JTextField();
        btnSalir = new javax.swing.JButton();
        btnAbrir = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();
        btnTotalRecaudo = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTituloPeaje.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblTituloPeaje.setText("PEAJE DE TU CORAZÓN AL MÍO");

        btnCarro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Car.png"))); // NOI18N
        btnCarro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarroActionPerformed(evt);
            }
        });

        btnBus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/bus.png"))); // NOI18N
        btnBus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBusActionPerformed(evt);
            }
        });

        btnCamion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Camion-removebg-preview.png"))); // NOI18N
        btnCamion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCamionActionPerformed(evt);
            }
        });

        lblCantCarros.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblCantCarros.setText("Cantidad Carros:");

        lblCantBuses.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblCantBuses.setText("Cantidad Buses:");

        lblCantCamiones.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblCantCamiones.setText("Cantidad Camiones:");

        txtCarros.setEditable(false);

        txtBuses.setEditable(false);

        txtCamiones.setEditable(false);

        txtRecaudo.setEditable(false);

        btnSalir.setText("SALIR");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnAbrir.setText("ABRIR PEAJE");
        btnAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbrirActionPerformed(evt);
            }
        });

        btnCerrar.setText("CERRAR PEAJE");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        btnTotalRecaudo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnTotalRecaudo.setText("Total $:");
        btnTotalRecaudo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTotalRecaudoActionPerformed(evt);
            }
        });

        btnLimpiar.setText("CLEAN");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtCarros, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtCamiones, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtBuses, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblCantCarros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnCarro, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE))
                                .addGap(111, 111, 111)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblCantBuses, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnBus, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 112, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnCamion, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                            .addComponent(lblCantCamiones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(97, 97, 97))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(233, 233, 233)
                        .addComponent(lblTituloPeaje))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(256, 256, 256)
                        .addComponent(btnTotalRecaudo, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtRecaudo, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(210, 210, 210)
                        .addComponent(btnAbrir)
                        .addGap(18, 18, 18)
                        .addComponent(btnCerrar)
                        .addGap(18, 18, 18)
                        .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSalir)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lblTituloPeaje)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCarro, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBus, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCamion, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCantCamiones)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCantCarros)
                            .addComponent(lblCantBuses))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCarros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtBuses, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCamiones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(74, 74, 74)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtRecaudo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnTotalRecaudo))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAbrir)
                    .addComponent(btnCerrar)
                    .addComponent(btnSalir)
                    .addComponent(btnLimpiar))
                .addGap(67, 67, 67))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCarroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarroActionPerformed
        // TODO add your handling code here:
        nuevoPeaje.registrarCantCarros();
        txtCarros.setText(String.valueOf(nuevoPeaje.getCantCarros()));
    }//GEN-LAST:event_btnCarroActionPerformed

    private void btnBusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBusActionPerformed
        // TODO add your handling code here:
        nuevoPeaje.registarCantBuses();
        txtBuses.setText(String.valueOf(nuevoPeaje.getCanBuses()));
    }//GEN-LAST:event_btnBusActionPerformed

    private void btnCamionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCamionActionPerformed
        // TODO add your handling code here:
        nuevoPeaje.registrarCantCamiones();
        txtCamiones.setText(String.valueOf(nuevoPeaje.getCantCamiones()));
    }//GEN-LAST:event_btnCamionActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        int valor = JOptionPane.showConfirmDialog(null, "¿Estás seguro de salir?","EXIT",JOptionPane.YES_NO_OPTION);
        if(valor == 0){
            System.exit(0);
        }
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbrirActionPerformed
        // TODO add your handling code here:
        nuevoPeaje = new Peaje();
        btnCarro.setEnabled(true);
        btnBus.setEnabled(true);
        btnCamion.setEnabled(true);
        btnCerrar.setEnabled(true);
        btnTotalRecaudo.setEnabled(true);
        btnLimpiar.setEnabled(true);
    }//GEN-LAST:event_btnAbrirActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        // TODO add your handling code here:
        txtCarros.setText(" ");
        txtBuses.setText(" ");
        txtCamiones.setText(" ");
        txtRecaudo.setText(" ");
        btnCarro.setEnabled(false);
        btnBus.setEnabled(false);
        btnCamion.setEnabled(false);
        btnLimpiar.setEnabled(false);
        btnCerrar.setEnabled(false);
        btnTotalRecaudo.setEnabled(false);
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnTotalRecaudoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTotalRecaudoActionPerformed
        // TODO add your handling code here:
        txtRecaudo.setText(String.valueOf(nuevoPeaje.obtenerTotalRecaudado()));
    }//GEN-LAST:event_btnTotalRecaudoActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
        /**
         * Limpiar los datos del pejae
         */
        nuevoPeaje = new Peaje();
        txtCarros.setText(" ");
        txtBuses.setText(" ");
        txtCamiones.setText(" ");
        txtRecaudo.setText(" ");
    }//GEN-LAST:event_btnLimpiarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmPeaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPeaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPeaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPeaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPeaje().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAbrir;
    private javax.swing.JButton btnBus;
    private javax.swing.JButton btnCamion;
    private javax.swing.JButton btnCarro;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnTotalRecaudo;
    private javax.swing.JLabel lblCantBuses;
    private javax.swing.JLabel lblCantCamiones;
    private javax.swing.JLabel lblCantCarros;
    private javax.swing.JLabel lblTituloPeaje;
    private javax.swing.JTextField txtBuses;
    private javax.swing.JTextField txtCamiones;
    private javax.swing.JTextField txtCarros;
    private javax.swing.JTextField txtRecaudo;
    // End of variables declaration//GEN-END:variables
}
