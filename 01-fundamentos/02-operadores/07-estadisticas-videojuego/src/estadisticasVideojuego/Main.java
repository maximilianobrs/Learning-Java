package estadisticasVideojuego;

/**
 * Clase principal para la gestión de métricas y recompensas de personajes.
 * Uso de operadores aritméticos y de asignación compuesta en un sistema de juego.
 */

public class Main {
    public static void main() {

        int oroInicial = 500;
        int experienciaInicial = 1200;

        int oroGanado = 250;
        int experienciaGanada = 400;


        System.out.println("\n=== Estadísticas de Videojuego ===");
        System.out.println("Oro inicial: " + oroInicial);
        System.out.println("Experiencia inicial: " + experienciaInicial);

        System.out.println("\nOro ganado: " + oroGanado);
        System.out.println("Experiencia ganada: " + experienciaGanada);

        oroInicial += oroGanado;
        experienciaInicial += experienciaGanada;

        System.out.println("\nOro final: " + oroInicial);
        System.out.println("Experiencia final: " + experienciaInicial);
    }
}
