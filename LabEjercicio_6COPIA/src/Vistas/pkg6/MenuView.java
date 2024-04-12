package Vistas.pkg6;

import Entidades.Producto;
import java.util.TreeSet;

public class MenuView extends javax.swing.JFrame {

    private TreeSet<Producto> listaProductos;

    public MenuView() {
        this.listaProductos = new TreeSet<>();
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMAdministracion = new javax.swing.JMenu();
        jMProducto = new javax.swing.JMenuItem();
        jMConsulta = new javax.swing.JMenu();
        jMRubro = new javax.swing.JMenuItem();
        jMNombre = new javax.swing.JMenuItem();
        jMPrecio = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 628, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 426, Short.MAX_VALUE)
        );

        jMAdministracion.setText("Administracion");

        jMProducto.setText("Productos");
        jMProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMProductoActionPerformed(evt);
            }
        });
        jMAdministracion.add(jMProducto);

        jMenuBar1.add(jMAdministracion);

        jMConsulta.setText("Consultas");

        jMRubro.setText("Por rubro...");
        jMRubro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMRubroActionPerformed(evt);
            }
        });
        jMConsulta.add(jMRubro);

        jMNombre.setText("Por nombre...");
        jMNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMNombreActionPerformed(evt);
            }
        });
        jMConsulta.add(jMNombre);

        jMPrecio.setText("Por precio...");
        jMPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMPrecioActionPerformed(evt);
            }
        });
        jMConsulta.add(jMPrecio);

        jMenuBar1.add(jMConsulta);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(escritorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMPrecioActionPerformed
        escritorio.removeAll();
        escritorio.repaint();

        BusquedaPorPrecioView bpp = new BusquedaPorPrecioView();
        bpp.setVisible(true);

        escritorio.add(bpp);
        escritorio.moveToFront(bpp);
    }//GEN-LAST:event_jMPrecioActionPerformed

    private void jMNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMNombreActionPerformed
        escritorio.removeAll();
        escritorio.repaint();

        BusquedaPorNombreView bpn = new BusquedaPorNombreView();
        bpn.setVisible(true);

        escritorio.add(bpn);
        escritorio.moveToFront(bpn);
    }//GEN-LAST:event_jMNombreActionPerformed

    private void jMRubroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMRubroActionPerformed
        escritorio.removeAll();
        escritorio.repaint();

        BusquedaPorRubroView bpr = new BusquedaPorRubroView();
        bpr.setVisible(true);

        escritorio.add(bpr);
        escritorio.moveToFront(bpr);
    }//GEN-LAST:event_jMRubroActionPerformed

    private void jMProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMProductoActionPerformed
        escritorio.removeAll();
        escritorio.repaint();

        GestionProductos gp = new GestionProductos(listaProductos);
        gp.setVisible(true);

        escritorio.add(gp);
        escritorio.moveToFront(gp);
    }//GEN-LAST:event_jMProductoActionPerformed

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
            java.util.logging.Logger.getLogger(MenuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenu jMAdministracion;
    private javax.swing.JMenu jMConsulta;
    private javax.swing.JMenuItem jMNombre;
    private javax.swing.JMenuItem jMPrecio;
    private javax.swing.JMenuItem jMProducto;
    private javax.swing.JMenuItem jMRubro;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables

}
