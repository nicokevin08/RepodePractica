/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.eda.pkg3.pkg2;

/**
 *
 * @author Gonzalo
 */
public class EjercicioEda32 {

    /**
     * @param args the command line arguments
     */
        public static void main(String[] args) {
        int capacidadMaxima = 5;
        PilaOrdenada pila = new PilaOrdenada(capacidadMaxima);

        // Insertar elementos en la pila ordenada
        pila.push(5);
        pila.push(11);
        pila.push(8);
        pila.push(3);

        // Imprimir y retirar elementos de la pila ordenada
        while (!pila.isEmpty()) {
            System.out.println(pila.pop());
        }
    }
}