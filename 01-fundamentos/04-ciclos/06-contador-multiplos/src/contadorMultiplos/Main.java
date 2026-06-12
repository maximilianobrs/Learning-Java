package contadorMultiplos;

public class Main {
    public static void main(String[] args) {

        System.out.println("\n=== MULTIPLOS DE 3 ===\n");
        for (int n = 1 ; n <= 100; n++){
            if (n%3 == 0){
                System.out.println(n);
            }
        }

    }
}
