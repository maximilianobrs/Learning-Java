package tablaMultiplicar;

public class Main {
    public static void main(String[] args) {
        int numero = 5;

        System.out.println("\n=== TABLA DE MULTIPLICAR ===\n");
        for (int n = 1; n <= 10 ; n++){
            System.out.println(numero +" * " + n + " = " + numero * n);
        }
    }
}
