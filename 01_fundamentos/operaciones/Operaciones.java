
package operaciones;

public class Operaciones {

    public static void main(String[] args) {
        
        int numero1 = 14;
        int numero2 = 6;

        // Operaciones básicas
        int suma = numero1 + numero2;
        int resta = numero1 - numero2;
        int multiplicacion = numero1 * numero2;
        int division = numero1 / numero2;
        int modulo = numero1 % numero2;

        // Resultados
        System.out.println("===== OPERACIONES BASICAS =====");

        System.out.println("Suma: "+ suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicacion: " + multiplicacion);
        System.out.println("Division: " + division);
        System.out.println("Modulo: " + modulo);

        // Operadores relacionales
        System.out.println("\n===== OPERADORES RELACIONALES =====");

        System.out.println(numero1 > numero2);
        System.out.println(numero1 < numero2);
        System.out.println(numero1 == numero2);
        System.out.println(numero1 != numero2);

        // Operadores lógicos
        System.out.println("\n===== OPERADORES LOGICOS =====");

        boolean resultado1 = numero1 > 0 && numero2 > 0;
        boolean resultado2 = numero1 > 20 || numero2 > 1;

        System.out.println(resultado1);
        System.out.println(resultado2);
    }
    
}
