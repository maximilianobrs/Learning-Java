package loops;

public class Loops {

    public static void main(String[] args) {

        //Loop for imprimir numeros del 1 al 10
        //int i = 1 contador inicial
        //i <= 10 La condicional mientras sea verdadera
        //i++ aumento de contador cada vuelta
        for (int i = 1; i <= 10; i++) {
            System.out.println("vueltas: " + i);
        }

        // Loop while repetir segun la condicion 
        int cantidad = 3;

        while (cantidad > 0) {
            System.out.println("cantidad disponible: " + cantidad);
            cantidad--; //restar siempre 1 para no crear un loop infinito
        }

        //Loop do-while ejecutara la condicion al menos una vez
        int intentos = 0;

        do {
            System.out.println("Sean Bienvenidos");
            intentos++;
        } while (intentos < 1);

        //Loop for-each para recorrec colecciones
        String[] nombres = {"Ales", "Luis", "Estefani"};

        for (String nombre : nombres) {
            System.out.println("Invitado: " + nombre);
        }

        //Control de Loops break y continue
        for (int num = 1; num <= 5; num++) {
            if (num == 3) {
                continue; // Se salta el 3, no lo imprime
            }
            if (num == 5) {
                break; // Detiene todo el bucle al llegar a 5
            }
            System.out.println("Número: " + num);
        }
    }

}
