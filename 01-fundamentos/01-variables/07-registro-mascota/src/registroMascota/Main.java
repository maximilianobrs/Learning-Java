package registroMascota;
/**
 * Programa que muestra la información de una mascota.
 */
public class Main {
    public static void main(String[] args){
        String nombre = "Max";
        int edad = 3;
        int peso = 12;
        char sexo = 'M';
        boolean vacunasAlDia = true;

        System.out.println("\n=== INFORMACIÓN DE LA MASCOTA ===");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Peso: " + peso + " kg");
        System.out.println("Sexo: " + sexo);
        System.out.println("Vacunas al Día: " + vacunasAlDia);
    }
}
