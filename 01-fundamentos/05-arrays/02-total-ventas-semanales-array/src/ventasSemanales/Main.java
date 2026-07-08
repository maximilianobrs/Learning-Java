package ventasSemanales;

public class Main {
    public static void main(String[] args) {

        int[] ventasSemanales = {100, 150, 120, 200, 180, 130, 170};

        int totalVendido = 0;
        System.out.println("\n=== VENTAS SEMANALES ===\n");

        for (int n = 0; n < ventasSemanales.length ; n++){
            System.out.println(ventasSemanales[n]);
            totalVendido += ventasSemanales[n];
        }

        System.out.println("\nTotal vendido: " + totalVendido);


    }
}
