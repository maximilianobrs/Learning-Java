package cursoProgramacion;
/**
 * Programa que muestra la información de un curso de programación.
 */
public class Main {
    public static void main(String[] args){
        String nombre = "Programación en Java";
        int cantidadAlumnos = 35;
        double notaPromedio = 6.2;
        char seccion = 'A';
        boolean disponibilidad = true;

        System.out.println("\n=== DETALLES DEL CURSO ===");
        System.out.println("Curso: " + nombre);
        System.out.println("Alumnos Inscritos: " + cantidadAlumnos);
        System.out.println("Nota Promedio General: " + notaPromedio);
        System.out.println("Sección: " + seccion);
        System.out.println("Cupos Disponibles: " + disponibilidad);
    }
}
