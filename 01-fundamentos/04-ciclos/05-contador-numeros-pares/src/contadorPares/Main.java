package contadorPares;

public class Main {
    public static void main() {

        System.out.println("\n=== NUMEROS PARES ===\n");
        //todos los numeros pares que estan entre 1 a 50
        for (int n = 1; n <=50 ; n++){
            if (n % 2 == 0){
                System.out.println(n);
            }
        }
    }
}
