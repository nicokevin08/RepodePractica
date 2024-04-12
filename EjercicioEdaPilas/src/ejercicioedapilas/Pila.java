package ejercicioedapilas;

public class Pila {

    private int tope;
    private int[] enteros;

    public Pila(int n) {
        this.enteros = new int[n];
    }

    public void Push(int entero) {

        if (Pilallena()) {
            System.out.println("");
            System.out.println("No se puede insetar mas enteros");

        } else {
            tope = tope + 1;
            enteros[tope] = num;
        }
    }

    public void Pop() {
        if (tope >= 0) {
            tope = tope - 1;

        } else {
            Pilavacia();
            System.out.println("No se puede eliminar");
        }

    }

    public boolean Pilavacia() {

        return tope == -1;

    }

    public boolean Pilallena() {
        System.out.println("PILA LLENA");
        return tope == enteros.length - 1;

    }

    public int VerTope() {
        if (Pilavacia()) {
            System.out.println("---LA PILA ESTA VACIA---");
            return 0;
        } else {
            return enteros[tope];
        }

    }

    public void verPila() {
        for (int i = 0; i < enteros.length; i++) {
            System.out.println(enteros[i] + ", ");
        }

    }

}
