package personajeVideojuego;
/**
 * Programa que muestra la información de una personaje de videojuego.
 */
public class Main {
    public static void main (String[] args){
        String nombre = "Arthas";
        String faccion = "Plaga";
        int cantidadDeLot = 15;
        int cantidadSkills = 4;
        double porcentageDeDrop = 2.5;
        double porcentageDeDanio = 85.5;
        char clasificacionDificultad = 'A';
        boolean activo = true;

        System.out.println("\n=== INFORMACIÓN DEL PERSONAJE ===");
        System.out.println("Nombre: " + nombre);
        System.out.println("Facción: " + faccion);
        System.out.println("Cantidad de Lot: " + cantidadDeLot);
        System.out.println("Cantidad Skills: " + cantidadSkills);
        System.out.println("Porcentage de Drop: " + porcentageDeDrop + "%");
        System.out.println("Porcentage de Daño: " + porcentageDeDanio + "%");
        System.out.println("Clasificación Dificultad: " + clasificacionDificultad);
        System.out.println("Activo: " + activo);
    }
}
