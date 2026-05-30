package videojuego;
/**
 * Programa que muestra la información de una videojuego.
 */
public class Main {
    public static void main (String[] args){
        String nombreJuego = "Minecraft";
        int horasJugadas = 120;
        long precio = 29990;
        char clasificacion = 'E';
        boolean comprado = true;

        System.out.println("\n=== INFORMACIÓN DEL VIDEOJUEGO ===");
        System.out.println("Nombre del Juego: " + nombreJuego);
        System.out.println("Horas Jugadas: " + horasJugadas + " hrs");
        System.out.println("Precio: $" + precio);
        System.out.println("Clasificación: " + clasificacion);
        System.out.println("Comprado: " + comprado);
    }
}
