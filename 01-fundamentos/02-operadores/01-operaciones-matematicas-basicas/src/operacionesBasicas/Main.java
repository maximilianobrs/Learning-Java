package operacionesBasicas;

/**
 * Una calculadora simple mostrara el resultado de las operaciones
 * matemáticas fundamentales utilizando dos números almacenados en variables.
 */

public class Main {
    public static void main (String[] args){

        int numero1 = 20;
        int numero2 = 7;

        int suma = numero1 + numero2;
        int resta = numero1 - numero2;
        int multiplicacion = numero1 * numero2;
        int divison = numero1/numero2;
        int modulo = numero1 % numero2;


        System.out.println("\n==== Operaciónes matematicas ====");
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multiplicacion);
        System.out.println("Division: " + divison);
        System.out.println("Modulo resto: " + modulo);

    }
}
