
import java.util.Scanner;

//Ejercicio 1
//Implemente la clase pila, se trata de una pila de enteros, la misma debe contener
//los métodos: push(), pop(), pilaVacia(), PilaLlena(), verElemento()
//Cree un objeto de la clase y verifique sus métodos.
//Ejercicio 2
//Agregue a la clase un método invierteSimple que usando la pila original y 2 pilas
//vacía deje en la pila original los elementos invertidos
//Agregue a la clase un método invierteEficiente que usando la pila original y 1 pila
//vacía y una variable deje en la pila original los elementos invertidos
//package eda.pilas;
public class EDAPilas {

    public static void main(String[] args) {
        Scanner Leer = new Scanner(System.in);
        System.out.println("Ingrese Tamaño de Pila: ");
        int n = Leer.nextInt();
       
        Pila num1 = new Pila(n);
        
        int op;

        do {
            num1.Menu();
            op = Leer.nextInt();
            switch (op) {

                case 1:
                    num1.Push();
                    break;
                case 2:
                    num1.Pop();
                    break;
                case 3:
                    num1.Pilavacia();
                    break;
                case 4:
                    num1.Pilallena();
                    break;
                case 5:
                    num1.VerTope();
                    break;
                case 6:
                    System.out.println("___________SALIENDO___________");
                    break;

                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
            }

        } while (op != 7);
    }

}
