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

public class Convertir extends javax.swing.JFrame {


    public Convertir() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Convertir().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
