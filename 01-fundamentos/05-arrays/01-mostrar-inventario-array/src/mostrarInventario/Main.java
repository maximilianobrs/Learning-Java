package mostrarInventario;

public class Main {
    public static void main(String[] args) {

        int[] inventario = {15,8,20,12,6};

        System.out.println("\n=== INVENTARIO ===\n");

        for (int n= 0; n < inventario.length ; n++){
            System.out.println("Producto " + (n+1) + ": " + inventario[n] + " unidades");
        }

    }
}
