package com.mycompany.barajararrepaso;

import java.util.ArrayList;
import java.util.Collections;

public class Baraja {

    private ArrayList<Cartas> cartas;
    private ArrayList<Cartas> monton;

    public Baraja() {
        String[] palo = {"Espadas", "Bastos", "Oros", "Copas"};
        for (String tipopalo : palo) {
            for (int i = 0; i < 12; i++) {
                if (i != 8 && i != 9) {
                    cartas.add(new Cartas(i, tipopalo));
                }
            }
        }
        System.out.println("----------Se creo Baraja Exitosamente----------");
    }

    public void Barajar() {
        Collections.shuffle(cartas);
        System.out.println("----------Se barajo Exitosamente----------");
    }

    public Cartas siguienteCarta() {
        if (cartas.isEmpty()) {
            System.out.println("----------No hay mas cartas en la baraja----------");
            return null;
        } else {
            //creo variable siguiente, para guardar la carta que remuevo de la lista de cartas,
            //y la guardo en "monton", y retorno la carta que saque.
            Cartas siguiente = cartas.remove(0);
            monton.add(siguiente);
            System.out.println("");
            System.out.println("----------carta:----------");
            return siguiente;
        }
    }

}
