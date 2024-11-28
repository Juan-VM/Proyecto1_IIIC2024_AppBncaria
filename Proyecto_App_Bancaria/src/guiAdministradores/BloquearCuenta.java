package guiAdministradores;

import guiAdministradores.DesbloquearCuenta;
import guiAdministradores.SolicitudesDesbloqueo;
import guiAdministradores.PrincipalAdmins;
import Personas.Usuarios;
import Sedes.SedeCentral;
import Sedes.SedeCiudadColon;
import Sedes.SedePuriscal;
import Sedes.SedeSanPedro;
import guiUsuarios.Inicio;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

public class BloquearCuenta extends javax.swing.JFrame {

    String cedula;
    DefaultTableModel modeloPuriscal = new DefaultTableModel();
    DefaultTableModel modeloSanPedro = new DefaultTableModel();
    DefaultTableModel modeloCiudadColon = new DefaultTableModel();

    public BloquearCuenta(String cedula) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.cedula = cedula;

        modeloPuriscal.addColumn("Sede");
        modeloPuriscal.addColumn("Usuario");
        modeloPuriscal.addColumn("Cedula");

        modeloSanPedro.addColumn("Sede");
        modeloSanPedro.addColumn("Usuario");
        modeloSanPedro.addColumn("Cedula");

        modeloCiudadColon.addColumn("Sede");
        modeloCiudadColon.addColumn("Usuario");
        modeloCiudadColon.addColumn("Cedula");

        tablaSedePuriscal.setModel(modeloPuriscal);
        tablaSedeSanPedro.setModel(modeloSanPedro);
        tablaSedeCiudadColon.setModel(modeloCiudadColon);
        llenarTablas();
    }

    public BloquearCuenta() {
        initComponents();
    }

    public void llenarTablas() {
        for (Usuarios i : SedePuriscal.getListaUsers()) {
            String sede = "Puriscal";
            if (i.getEstadoUsuario() == true) {
                modeloPuriscal.addRow(new Object[]{sede, i.getUsuario(), i.getCedula()});
            }
        }
        for (Usuarios i : SedeSanPedro.getListaUsers()) {
            String sede = "San Pedro";
            if (i.getEstadoUsuario() == true) {
                modeloSanPedro.addRow(new Object[]{sede, i.getUsuario(), i.getCedula()});
            }
        }
        for (Usuarios i : SedeCiudadColon.getListaUsers()) {
            String sede = "Ciudad Colon";
            if (i.getEstadoUsuario() == true) {
                modeloCiudadColon.addRow(new Object[]{sede, i.getUsuario(), i.getCedula()});
            }
        }
    }

    public void bloquearCuenta(JTable tabla, int filaSeleccionada) {
        String cedulaUser = tabla.getValueAt(filaSeleccionada, 2).toString();
        String sede = tabla.getValueAt(filaSeleccionada, 0).toString();

        switch (sede) {
            case "Puriscal" -> {
                for (Usuarios i : SedePuriscal.getListaUsers()) {
                    if (i.getCedula().equals(cedulaUser)) {
                        i.setEstadoUsuario(false);
                        SedeCentral.getListaCuentasBloqueadas().add(i);
                        SedePuriscal.getListaCuentasBloqueadas().add(i);
                        modeloPuriscal.removeRow(filaSeleccionada);
                        JOptionPane.showMessageDialog(null, "Cuenta bloqueada para el usuario: "+i.getUsuario());
                    }
                }
            }
            case "San Pedro" -> {
                for (Usuarios i : SedeSanPedro.getListaUsers()) {
                    if (i.getCedula().equals(cedulaUser)) {
                        i.setEstadoUsuario(false);
                        SedeCentral.getListaCuentasBloqueadas().add(i);
                        SedeSanPedro.getListaCuentasBloqueadas().add(i);
                        modeloSanPedro.removeRow(filaSeleccionada);
                        JOptionPane.showMessageDialog(null, "Cuenta bloqueada para el usuario: "+i.getUsuario());
                    }
                }
            }
            case "Ciudad Colon" -> {
                for (Usuarios i : SedeCiudadColon.getListaUsers()) {
                    if (i.getCedula().equals(cedulaUser)) {
                        i.setEstadoUsuario(false);
                        SedeCentral.getListaCuentasBloqueadas().add(i);
                        SedeCiudadColon.getListaCuentasBloqueadas().add(i);
                        modeloCiudadColon.removeRow(filaSeleccionada);
                        JOptionPane.showMessageDialog(null, "Cuenta bloqueada para el usuario: "+i.getUsuario());
                    }
                }
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelVisible = new javax.swing.JPanel();
        background = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        scrollPuriscal = new javax.swing.JScrollPane();
        tablaSedePuriscal = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaSedeSanPedro = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaSedeCiudadColon = new javax.swing.JTable();
        panelBloquear = new javax.swing.JPanel();
        jblBloquear = new javax.swing.JLabel();
        barraMenu = new javax.swing.JMenuBar();
        menuInicio = new javax.swing.JMenu();
        itemBienvenida = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        itemIrInicio = new javax.swing.JMenuItem();
        menuGestionUsuarios = new javax.swing.JMenu();
        menuBloqueoDesbloqueo = new javax.swing.JMenu();
        itemSolicitudesDesbloqueo = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        itemBloquearCuenta = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        itemDesbloquearCuenta = new javax.swing.JMenuItem();
        menuGestionFinanciera = new javax.swing.JMenu();
        menuGestionSedes = new javax.swing.JMenu();
        itemSedePuriscal = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        itemSedeSanPedro = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        itemSedeCiudadColon = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelVisible.setBackground(new java.awt.Color(255, 255, 255));

        background.setBackground(new java.awt.Color(252, 247, 215));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Boquear cuentas de usuarios");
        background.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 1070, -1));

        tablaSedePuriscal.setBackground(new java.awt.Color(204, 204, 204));
        tablaSedePuriscal.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        tablaSedePuriscal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablaSedePuriscal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tablaSedePuriscalMousePressed(evt);
            }
        });
        scrollPuriscal.setViewportView(tablaSedePuriscal);

        background.add(scrollPuriscal, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 310, 450));

        tablaSedeSanPedro.setBackground(new java.awt.Color(204, 204, 204));
        tablaSedeSanPedro.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        tablaSedeSanPedro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablaSedeSanPedro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tablaSedeSanPedroMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tablaSedeSanPedro);

        background.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 80, 310, 450));

        tablaSedeCiudadColon.setBackground(new java.awt.Color(204, 204, 204));
        tablaSedeCiudadColon.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        tablaSedeCiudadColon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablaSedeCiudadColon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tablaSedeCiudadColonMousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(tablaSedeCiudadColon);

        background.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 80, 310, 450));

        panelBloquear.setBackground(new java.awt.Color(92, 88, 29));
        panelBloquear.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jblBloquear.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jblBloquear.setForeground(new java.awt.Color(255, 255, 255));
        jblBloquear.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jblBloquear.setText("BLOQUEAR");
        jblBloquear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jblBloquearMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jblBloquearMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jblBloquearMouseExited(evt);
            }
        });
        panelBloquear.add(jblBloquear, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 70));

        background.add(panelBloquear, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 560, 280, 70));

        javax.swing.GroupLayout panelVisibleLayout = new javax.swing.GroupLayout(panelVisible);
        panelVisible.setLayout(panelVisibleLayout);
        panelVisibleLayout.setHorizontalGroup(
            panelVisibleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelVisibleLayout.setVerticalGroup(
            panelVisibleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, 687, Short.MAX_VALUE)
        );

        barraMenu.setBackground(new java.awt.Color(255, 255, 255));
        barraMenu.setBorder(null);
        barraMenu.setForeground(new java.awt.Color(51, 51, 51));

        menuInicio.setText("Inicio");

        itemBienvenida.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        itemBienvenida.setText("Bienvenida");
        itemBienvenida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemBienvenidaActionPerformed(evt);
            }
        });
        menuInicio.add(itemBienvenida);
        menuInicio.add(jSeparator1);

        itemIrInicio.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        itemIrInicio.setText("Ir a Inicio");
        itemIrInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemIrInicioActionPerformed(evt);
            }
        });
        menuInicio.add(itemIrInicio);

        barraMenu.add(menuInicio);

        menuGestionUsuarios.setBackground(new java.awt.Color(255, 255, 255));
        menuGestionUsuarios.setForeground(new java.awt.Color(51, 51, 51));
        menuGestionUsuarios.setText("Gestion usuarios y cuentas");
        menuGestionUsuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        menuBloqueoDesbloqueo.setText("Bloqueos y desbloqueos");
        menuBloqueoDesbloqueo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        itemSolicitudesDesbloqueo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        itemSolicitudesDesbloqueo.setText("Solicitudes debloqueo cuenta");
        itemSolicitudesDesbloqueo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemSolicitudesDesbloqueoActionPerformed(evt);
            }
        });
        menuBloqueoDesbloqueo.add(itemSolicitudesDesbloqueo);
        menuBloqueoDesbloqueo.add(jSeparator2);

        itemBloquearCuenta.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        itemBloquearCuenta.setText("Bloquear cuenta");
        itemBloquearCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemBloquearCuentaActionPerformed(evt);
            }
        });
        menuBloqueoDesbloqueo.add(itemBloquearCuenta);
        menuBloqueoDesbloqueo.add(jSeparator5);

        itemDesbloquearCuenta.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        itemDesbloquearCuenta.setText("Desbloquear cuenta");
        itemDesbloquearCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemDesbloquearCuentaActionPerformed(evt);
            }
        });
        menuBloqueoDesbloqueo.add(itemDesbloquearCuenta);

        menuGestionUsuarios.add(menuBloqueoDesbloqueo);

        barraMenu.add(menuGestionUsuarios);

        menuGestionFinanciera.setText("Gestion financiera");
        barraMenu.add(menuGestionFinanciera);

        menuGestionSedes.setText("Gestion sedes");

        itemSedePuriscal.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        itemSedePuriscal.setText("Sede Puriscal");
        itemSedePuriscal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemSedePuriscalActionPerformed(evt);
            }
        });
        menuGestionSedes.add(itemSedePuriscal);
        menuGestionSedes.add(jSeparator3);

        itemSedeSanPedro.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        itemSedeSanPedro.setText("Sede San Pedro");
        itemSedeSanPedro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemSedeSanPedroActionPerformed(evt);
            }
        });
        menuGestionSedes.add(itemSedeSanPedro);
        menuGestionSedes.add(jSeparator4);

        itemSedeCiudadColon.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        itemSedeCiudadColon.setText("Sede Ciudad Colon");
        itemSedeCiudadColon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemSedeCiudadColonActionPerformed(evt);
            }
        });
        menuGestionSedes.add(itemSedeCiudadColon);

        barraMenu.add(menuGestionSedes);

        setJMenuBar(barraMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelVisible, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelVisible, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itemBienvenidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemBienvenidaActionPerformed
        PrincipalAdmins admins = new PrincipalAdmins(cedula);
        admins.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_itemBienvenidaActionPerformed

    private void itemIrInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemIrInicioActionPerformed
        Inicio inicio = new Inicio();
        inicio.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_itemIrInicioActionPerformed

    private void itemSolicitudesDesbloqueoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemSolicitudesDesbloqueoActionPerformed
        SolicitudesDesbloqueo soli = new SolicitudesDesbloqueo(this.cedula);
        soli.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_itemSolicitudesDesbloqueoActionPerformed

    private void itemBloquearCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemBloquearCuentaActionPerformed

    }//GEN-LAST:event_itemBloquearCuentaActionPerformed

    private void itemSedePuriscalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemSedePuriscalActionPerformed

    }//GEN-LAST:event_itemSedePuriscalActionPerformed

    private void itemSedeSanPedroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemSedeSanPedroActionPerformed

    }//GEN-LAST:event_itemSedeSanPedroActionPerformed

    private void itemSedeCiudadColonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemSedeCiudadColonActionPerformed

    }//GEN-LAST:event_itemSedeCiudadColonActionPerformed

    private void jblBloquearMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jblBloquearMouseEntered
        panelBloquear.setBackground(new Color(153, 145, 86));
        jblBloquear.setForeground(Color.black);
    }//GEN-LAST:event_jblBloquearMouseEntered

    private void jblBloquearMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jblBloquearMouseExited
        panelBloquear.setBackground(new Color(92, 88, 29));
        jblBloquear.setForeground(Color.white);
    }//GEN-LAST:event_jblBloquearMouseExited

    private void jblBloquearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jblBloquearMouseClicked
        if (tablaSedeSanPedro.getSelectedRow() >= 0 || tablaSedeCiudadColon.getSelectedRow() >= 0 || tablaSedePuriscal.getSelectedRow() >= 0) {
            int eleccion = JOptionPane.showConfirmDialog(null, "Deseas bloquear esta cuenta?", "Advertencia", JOptionPane.OK_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE);
            if (eleccion == 0) {
                if (tablaSedePuriscal.getSelectedRow() >= 0) {
                    int filaSeleccionada = tablaSedePuriscal.getSelectedRow();
                    bloquearCuenta(tablaSedePuriscal, filaSeleccionada);
                    
                } else if (tablaSedeCiudadColon.getSelectedRow() >= 0) {
                    int filaSeleccionada = tablaSedeCiudadColon.getSelectedRow();
                    bloquearCuenta(tablaSedeCiudadColon, filaSeleccionada);
                } else {
                    int filaSeleccionada = tablaSedeSanPedro.getSelectedRow();
                    bloquearCuenta(tablaSedeSanPedro, filaSeleccionada);
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Error selecciona un usuario de la tabla");
        }
    }//GEN-LAST:event_jblBloquearMouseClicked

    private void tablaSedePuriscalMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaSedePuriscalMousePressed
        if (tablaSedeSanPedro.getSelectedRow() >= 0) {
            tablaSedeSanPedro.clearSelection();
        }
        if (tablaSedeCiudadColon.getSelectedRow() >= 0) {
            tablaSedeCiudadColon.clearSelection();
        }
    }//GEN-LAST:event_tablaSedePuriscalMousePressed

    private void tablaSedeSanPedroMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaSedeSanPedroMousePressed
        if (tablaSedePuriscal.getSelectedRow() >= 0) {
            tablaSedePuriscal.clearSelection();
        }
        if (tablaSedeCiudadColon.getSelectedRow() >= 0) {
            tablaSedeCiudadColon.clearSelection();
        }
    }//GEN-LAST:event_tablaSedeSanPedroMousePressed

    private void tablaSedeCiudadColonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaSedeCiudadColonMousePressed
        if (tablaSedePuriscal.getSelectedRow() >= 0) {
            tablaSedePuriscal.clearSelection();
        }
        if (tablaSedeSanPedro.getSelectedRow() >= 0) {
            tablaSedeSanPedro.clearSelection();
        }
    }//GEN-LAST:event_tablaSedeCiudadColonMousePressed

    private void itemDesbloquearCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemDesbloquearCuentaActionPerformed
        DesbloquearCuenta desbloquear = new DesbloquearCuenta(this.cedula);
        desbloquear.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_itemDesbloquearCuentaActionPerformed

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
            java.util.logging.Logger.getLogger(BloquearCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BloquearCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BloquearCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BloquearCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BloquearCuenta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JMenuBar barraMenu;
    private javax.swing.JMenuItem itemBienvenida;
    private javax.swing.JMenuItem itemBloquearCuenta;
    private javax.swing.JMenuItem itemDesbloquearCuenta;
    private javax.swing.JMenuItem itemIrInicio;
    private javax.swing.JMenuItem itemSedeCiudadColon;
    private javax.swing.JMenuItem itemSedePuriscal;
    javax.swing.JMenuItem itemSedeSanPedro;
    private javax.swing.JMenuItem itemSolicitudesDesbloqueo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JLabel jblBloquear;
    private javax.swing.JMenu menuBloqueoDesbloqueo;
    private javax.swing.JMenu menuGestionFinanciera;
    private javax.swing.JMenu menuGestionSedes;
    private javax.swing.JMenu menuGestionUsuarios;
    private javax.swing.JMenu menuInicio;
    private javax.swing.JPanel panelBloquear;
    private javax.swing.JPanel panelVisible;
    private javax.swing.JScrollPane scrollPuriscal;
    private javax.swing.JTable tablaSedeCiudadColon;
    private javax.swing.JTable tablaSedePuriscal;
    private javax.swing.JTable tablaSedeSanPedro;
    // End of variables declaration//GEN-END:variables
}