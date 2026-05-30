package inventarioProductos;
/**
 * Programa que muestra la información de un producto.
 */
public class Main {
    public static void main(String[] args){

        String nombre = "Tabla";
        int cantidadStock = 100;
        long precio = 400000;
        char categoria = 'F';
        boolean disponibilidad = true;

        System.out.println("\n=== INFORMACIÓN DEL PRODUCTO ===");
        System.out.println("Nombre: " + nombre);
        System.out.println("Cantidad en Stock: " + cantidadStock);
        System.out.println("Precio: $" + precio);
        System.out.println("Categoría: " + categoria);
        System.out.println("Disponibilidad: " + disponibilidad);
    }
}
