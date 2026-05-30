package registroEstudiante;

/**
 * Programa que muestra la información de un estudiante.
 */

public class Main {
    public static void main(String[] args){

        String nombre = "Alex";
        int edad = 27;
        double promedio = 6.6;
        char curso = 'B';
        boolean beca = true;

        System.out.println("\n===INFORMACIÓN ESTUDIANTE===");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Promedio: " + promedio);
        System.out.println("Curso: " + curso);
        System.out.println("Beca: " + beca);
    }
}
