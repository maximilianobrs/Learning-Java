package contadorMultiplos;

public class Main {
    public static void main(String[] args) {

        int contador = 0;

        for (int n = 1 ; n <= 100; n++){
            if (n%3 == 0){
                contador++;
            }
        }

        System.out.println("\n=== RESULTADO ===\n");
        System.out.println("Cantidad de multiplos de 3: " + contador);

    }
}
