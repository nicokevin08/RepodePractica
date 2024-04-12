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



public class Pila {

  
    private int tope = -1;
    private int[] enteros;
 

    public Pila(int n) {
      enteros = new int[n]; 
    }

    
    
    

    public void Push() {

//PUSH(tipoDeDato x)
//si (Tope < n-1)
// Tope = Tope + 1
// Pila[Tope] = x
//sino
// Mostrar(“La estructura está
//completa, no se puede
//insertar”)
}

    public void Pop(){
    
    
    
    }
    
    public void Pilavacia(){
    
    
    }
    
    public void Pilallena(){
    
    
    }
    
    
    public void VerTope(){
    
    
    }

    
    
    
    public void Menu() {
        System.out.println("Eliga una opcion: ");
        System.out.println("1: Push (poner)");
        System.out.println("2: Pop (quitar");
        System.out.println("3: Pilavacia");
        System.out.println("4: Pilallena");
        System.out.println("5: Ver tope");
        System.out.println("6: SALIR");
        

    }

}
