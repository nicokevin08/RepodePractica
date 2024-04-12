package Vistas.pkg6;

import Entidades.*;
import java.util.regex.Matcher;
import java.util.TreeSet;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.awt.Image;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class GestionProductos extends javax.swing.JInternalFrame {

    private TreeSet<Producto> productos;
    private Producto auxiliar = null;

    public GestionProductos(TreeSet<Producto> productos) {
        initComponents();
        this.productos = productos;
        llenarRubros();
        jBBuscar.setIcon(setIcono("/iconos/lupita.png", jBBuscar));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLCodigo = new javax.swing.JLabel();
        jLDescripcion = new javax.swing.JLabel();
        jLPrecio = new javax.swing.JLabel();
        jLRubro = new javax.swing.JLabel();
        jLStock = new javax.swing.JLabel();
        jBNuevo = new javax.swing.JButton();
        jBGuardar = new javax.swing.JButton();
        jBEliminar = new javax.swing.JButton();
        jBSalir = new javax.swing.JButton();
        jTCodigo = new javax.swing.JTextField();
        jTDescripcion = new javax.swing.JTextField();
        jBBuscar = new javax.swing.JButton();
        jTPrecio = new javax.swing.JTextField();
        jLGestion = new javax.swing.JLabel();
        jCRubro = new javax.swing.JComboBox<>();
        jTStock = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jLCodigo.setText("Código");

        jLDescripcion.setText("Descripción");
        jLDescripcion.setEnabled(false);

        jLPrecio.setText("Precio");
        jLPrecio.setEnabled(false);

        jLRubro.setText("Rubro");
        jLRubro.setEnabled(false);

        jLStock.setText("Stock");
        jLStock.setEnabled(false);

        jBNuevo.setText("Nuevo");
        jBNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBNuevoActionPerformed(evt);
            }
        });

        jBGuardar.setText("Guardar");
        jBGuardar.setEnabled(false);
        jBGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGuardarActionPerformed(evt);
            }
        });

        jBEliminar.setText("Eliminar");
        jBEliminar.setEnabled(false);
        jBEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEliminarActionPerformed(evt);
            }
        });

        jBSalir.setText("Salir");
        jBSalir.setEnabled(false);
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });

        jTCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTCodigoActionPerformed(evt);
            }
        });

        jTDescripcion.setEnabled(false);

        jBBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/lupita.png"))); // NOI18N
        jBBuscar.setText("BUSCAR");
        jBBuscar.setOpaque(true);
        jBBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarActionPerformed(evt);
            }
        });

        jTPrecio.setEnabled(false);
        jTPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTPrecioActionPerformed(evt);
            }
        });

        jLGestion.setText("Gestión de Productos");

        jCRubro.setEnabled(false);

        jTStock.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jBNuevo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBGuardar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBEliminar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addComponent(jBSalir)
                .addGap(15, 15, 15))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLCodigo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLGestion, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLDescripcion)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLPrecio)
                                    .addGap(39, 39, 39)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLRubro)
                                    .addComponent(jLStock))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jTCodigo)
                                .addGap(88, 88, 88)
                                .addComponent(jBBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jTStock, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTPrecio, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jCRubro, javax.swing.GroupLayout.Alignment.LEADING, 0, 119, Short.MAX_VALUE))
                                    .addComponent(jTDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLGestion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLCodigo))
                    .addComponent(jBBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLDescripcion)
                    .addComponent(jTDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLPrecio))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLRubro)
                    .addComponent(jCRubro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLStock)
                    .addComponent(jTStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jBNuevo)
                        .addComponent(jBGuardar)
                        .addComponent(jBEliminar))
                    .addComponent(jBSalir))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTPrecioActionPerformed

    private void jBNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBNuevoActionPerformed
        jBEliminar.setEnabled(false);
        jLDescripcion.setEnabled(true);
        jLPrecio.setEnabled(true);
        jLRubro.setEnabled(true);
        jLStock.setEnabled(true);

        jTDescripcion.setEnabled(true);
        jTPrecio.setEnabled(true);
        jCRubro.setEnabled(true);
        jTStock.setEnabled(true);

        jBGuardar.setEnabled(true);
        jBSalir.setEnabled(true);
    }//GEN-LAST:event_jBNuevoActionPerformed
    public void limpiar() {

        jTCodigo.setText("");
        jTDescripcion.setText("");
        jTPrecio.setText("");
        jTStock.setText("");
        jCRubro.setSelectedIndex(-1);
        jBEliminar.setEnabled(false);
        auxiliar = null;

    }

    private boolean validaEntero(String nro) {

        java.util.regex.Pattern patron = java.util.regex.Pattern.compile("^[0-9]+$");
        Matcher m = patron.matcher(nro);
        return m.matches();
    }

    private boolean validaReal(String nro) {
        java.util.regex.Pattern patron = java.util.regex.Pattern.compile("^[0-9]+.[0-9]$");
        Matcher m = patron.matcher(nro);
        return m.matches();

    }


    private void jTCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTCodigoActionPerformed


    }//GEN-LAST:event_jTCodigoActionPerformed

    private void jBGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGuardarActionPerformed
        String desc = "";
        double prec;
        int stock;
        int cod;

        jBEliminar.setEnabled(true);

        if (validaEntero(jTCodigo.getText())) {
            cod = Integer.parseInt(jTCodigo.getText());
        } else {

            JOptionPane.showMessageDialog(this, "Ingresar un codigo");
            jTCodigo.requestFocus();
            return;
        }
        cod = Integer.parseInt(jTCodigo.getText());

        if (!jTDescripcion.getText().isEmpty()) {
            desc = jTDescripcion.getText();
        } else {
            JOptionPane.showConfirmDialog(this, "Campo Vacio");
        }

        if (validaReal(jTPrecio.getText())) {
            prec = Double.parseDouble(jTPrecio.getText());
        } else {

            JOptionPane.showMessageDialog(this, "Ingresar un precio ");
            jTPrecio.requestFocus();
            return;
        }
        if (validaEntero(jTStock.getText())) {
            stock = Integer.parseInt(jTStock.getText());
        } else {

            JOptionPane.showMessageDialog(this, "Ingresar un stock ");
            jTStock.requestFocus();
            return;
        }

        prec = Double.parseDouble(jTPrecio.getText());
        stock = Integer.parseInt(jTStock.getText());
        Categoria rub = (Categoria) jCRubro.getSelectedItem();
        Producto num1 = new Producto(cod, desc, prec, stock, rub);

        if (productos.add(num1)) {
            JOptionPane.showMessageDialog(this, "Producto Agregado");
            limpiar();
        } else {

            JOptionPane.showMessageDialog(this, "Ya existe un producto con ese código");
        }


    }//GEN-LAST:event_jBGuardarActionPerformed

    private void jBBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarActionPerformed
        int cd = Integer.parseInt(jTCodigo.getText());

        for (Producto prod : productos) {
            if (cd == prod.getCodigo()) {
                jTDescripcion.setText(prod.getDescripcion());
                jTPrecio.setText(prod.getPrecio() + "");
                jTStock.setText(prod.getStock() + "");
                jCRubro.setSelectedItem(prod.getRubro());
                jBEliminar.setEnabled(true);
                auxiliar = prod;
                return;
            }
        }
        JOptionPane.showMessageDialog(this, "Codigo no Existente");

    }//GEN-LAST:event_jBBuscarActionPerformed

    private void jBEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEliminarActionPerformed

        int op = JOptionPane.showConfirmDialog(this, "Desea Eliminar?", "Eliminar", JOptionPane.YES_NO_OPTION);
        if (op == JOptionPane.YES_OPTION) {
            productos.remove(auxiliar);
            JOptionPane.showMessageDialog(this, "Producto Eliminado ");
            limpiar();
            auxiliar = null;
        }


    }//GEN-LAST:event_jBEliminarActionPerformed

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed

        dispose();


    }//GEN-LAST:event_jBSalirActionPerformed

    public void llenarRubros() {
        jCRubro.addItem(Categoria.COMESTIBLE);
        jCRubro.addItem(Categoria.LIMPIEZA);
        jCRubro.addItem(Categoria.PERFUMERIA);
    }

    public Icon setIcono(String url, JButton boton) {
        ImageIcon icon = new ImageIcon(getClass().getResource(url));
        //int ancho = boton.getWidth();
        //int alto = boton.getHeight();

        ImageIcon icono = new ImageIcon(icon.getImage().getScaledInstance(15, 15, Image.SCALE_DEFAULT));

        return icono;

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBBuscar;
    private javax.swing.JButton jBEliminar;
    private javax.swing.JButton jBGuardar;
    private javax.swing.JButton jBNuevo;
    private javax.swing.JButton jBSalir;
    private javax.swing.JComboBox<Categoria> jCRubro;
    private javax.swing.JLabel jLCodigo;
    private javax.swing.JLabel jLDescripcion;
    private javax.swing.JLabel jLGestion;
    private javax.swing.JLabel jLPrecio;
    private javax.swing.JLabel jLRubro;
    private javax.swing.JLabel jLStock;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTCodigo;
    private javax.swing.JTextField jTDescripcion;
    private javax.swing.JTextField jTPrecio;
    private javax.swing.JTextField jTStock;
    // End of variables declaration//GEN-END:variables
}
