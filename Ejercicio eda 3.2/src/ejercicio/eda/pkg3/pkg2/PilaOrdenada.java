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
public class PilaOrdenada {
    private int[] elementos;
    private int size;
    private final int capacidad;

    public PilaOrdenada(int capacidad) {
        this.elementos = new int[capacidad];
        this.size = 0;
        this.capacidad = capacidad;
    }

    public void push(int elemento) {
        if (size == capacidad) {
            System.out.println("La pila está llena");
        }

        // Encontrar la posición de inserción para mantener el orden
        int posicion = 0;
        while (posicion < size && elementos[posicion] < elemento) {
            posicion++;
        }

        // Desplazar elementos para insertar el nuevo elemento en la posición correcta
        for (int i = size - 1; i >= posicion; i--) {
            elementos[i + 1] = elementos[i];
        }

        elementos[posicion] = elemento;
        size++;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("La pila está vacía");
        }

        int elemento = elementos[size - 1];
        size--;
        return elemento;
    }

    public boolean isEmpty() {
        return size == 0;
    }
}
