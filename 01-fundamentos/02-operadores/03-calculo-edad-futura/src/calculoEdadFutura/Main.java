package calculoEdadFutura;

/**
 * Clase principal para el cálculo proyectado de la edad de un usuario.
 * Aplicación de operadores aritméticos simples para la actualización de datos.
 */

public class Main {
    public static void main(String[] args){
        int edadActual = 20;
        int anioFuturo = 11;
        int edadFutura = edadActual + anioFuturo;

        System.out.println("\n=== Cálculo de edad futura ===");
        System.out.println("Edad actual: " + edadActual);
        System.out.println("Años a futuro: " + anioFuturo);
        System.out.println("Edad futura: " + edadFutura);
    }
}
