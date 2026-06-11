package sumaPrimeroDiezNumeros;

public class Main {
    public static void main(String[] args) {

        int suma = 0;

        for (int n = 1 ; n<=10 ; n++){
            suma += n;
        }
        System.out.println("\n=== SUMA TOTOL DE LOS NUMERO ===\n");
        System.out.println("Suma total: " + suma);
    }
}
