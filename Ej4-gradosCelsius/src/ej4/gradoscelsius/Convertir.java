//Ejercicio 2:
//
//Crea una aplicación GUI en Java que simule un convertidor de unidades de temperatura. La interfaz debe contener los siguientes elementos:
//
//Un campo de texto (JTextField) para que el usuario pueda ingresar la temperatura en grados Celsius.
//Un botón (JButton) con el texto "Convertir".
//Cuando el usuario ingrese la temperatura en grados Celsius y haga clic en el botón "Convertir", la aplicación debe realizar la conversión de Celsius a Fahrenheit y mostrar el resultado en un cuadro de diálogo emergente.
//
//La fórmula para convertir de grados Celsius a Fahrenheit es: Fahrenheit = Celsius * 9/5 + 32.
//
//Recuerda utilizar la biblioteca de componentes gráficos de Java (Swing) para crear la interfaz y gestionar el evento del botón.
package ej4.gradoscelsius;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class Convertir extends javax.swing.JFrame {

    public Convertir() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtGradosCelsius = new javax.swing.JTextField();
        jbConvertir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel2.setText("Grados Celsius :  °");

        jtGradosCelsius.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtGradosCelsiusFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtGradosCelsiusFocusLost(evt);
            }
        });
        jtGradosCelsius.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtGradosCelsiusActionPerformed(evt);
            }
        });

        jbConvertir.setText("Convertir");
        jbConvertir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbConvertirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtGradosCelsius, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(jbConvertir, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtGradosCelsius, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(100, 100, 100)
                .addComponent(jbConvertir)
                .addGap(48, 48, 48))
        );

        jLabel1.getAccessibleContext().setAccessibleName("CONVERTIDOR\nDE\nTEMPERATURA");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jtGradosCelsiusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtGradosCelsiusActionPerformed


    }//GEN-LAST:event_jtGradosCelsiusActionPerformed

    private void jbConvertirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbConvertirActionPerformed

        Pattern p = Pattern.compile("^[-+]?[0-9]*\\.?[0-9]+([-+]?[0-9]+)?$");
        Matcher m = p.matcher(jtGradosCelsius.getText());

        if (!m.matches()) {
            JOptionPane.showMessageDialog(this, "Ingrese Correctamente Grados");
            jtGradosCelsius.removeAll();
            jtGradosCelsius.requestFocus();

            return;
        }

        //      Celsius * 9/5 + 32.
        double grad = Double.parseDouble(jtGradosCelsius.getText());
        double convertido = grad * 9 / 5 + 32;

        JOptionPane.showMessageDialog(this, "Grados Fahrenheit: " + convertido + " F");


    }//GEN-LAST:event_jbConvertirActionPerformed

    private void jtGradosCelsiusFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtGradosCelsiusFocusLost
        // TODO add your handling code here:


    }//GEN-LAST:event_jtGradosCelsiusFocusLost

    private void jtGradosCelsiusFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtGradosCelsiusFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jtGradosCelsiusFocusGained

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Convertir().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton jbConvertir;
    private javax.swing.JTextField jtGradosCelsius;
    // End of variables declaration//GEN-END:variables
}
