package com.mycompany.barajararrepaso;

public class Cartas {

    private String palo;
    private int numero;

    public Cartas(int numero,String palo) {
        this.palo = palo;
        this.numero = numero;
    }

    public String getPalo() {
        return palo;
    }

    public void setPalo(String palo) {
        this.palo = palo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return ("Cartas " + palo + ", Nº " + numero);
    }

}
