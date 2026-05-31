package incrementoInventario;

/**
 * Representa el sistema de control de inventario de la tienda.
 * Esta clase permite gestionar las existencias mediante operadores de asignación.
 */

public class Main {
    public static void main (String[] args){

        int stock = 50;
        int unidadesRecibidas = 20;

        System.out.println("\n=== Inventario ===");
        System.out.println("Stock inicial: " + stock);
        System.out.println("Unidades recibidas: " + unidadesRecibidas);

        stock += unidadesRecibidas;

        System.out.println("Stock actualizado: " + stock);

    }
}
