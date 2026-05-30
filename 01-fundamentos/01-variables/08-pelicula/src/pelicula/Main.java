package pelicula;
/**
 * Programa que muestra la información de una pelicula.
 */
public class Main {
    public static void main(String[] args){

        String titulo = "Inception";
        int duracion = 148;
        double puntuacion = 8.8;
        char clasificacion = 'T';
        boolean disponibilidad = true;

        System.out.println("\n=== INFORMACIÓN DE LA PELÍCULA ===");
        System.out.println("Título: " + titulo);
        System.out.println("Duración: " + duracion + " min");
        System.out.println("Puntuación: " + puntuacion);
        System.out.println("Clasificación: " + clasificacion);
        System.out.println("Disponibilidad: " + disponibilidad);
    }
}
