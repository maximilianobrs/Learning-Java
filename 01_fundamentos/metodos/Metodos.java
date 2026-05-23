package metodos;

public class Metodos {

    // Método simple
    public static void saludar() {

        System.out.println("Hola bienvenido a mi código");
    }

    // Método que recibe parámetros
    public static void mostrarNombre(String nombre) {

        System.out.println("Tu nombre es: " + nombre);
    }

    // Método que retorna un valor que queramos devolver
    public static int sumar(int a, int b) {

        return a + b;
    }

    // Método boolean
    public static boolean esMayorEdad(int edad) {

        return edad >= 18;
    }

    public static void main(String[] args) {
        
        System.out.println("===== METODOS EN JAVA =====");

        // Llamar método simple
        saludar();

        // Llamar método con parámetro
        mostrarNombre("Maximiliano");

        // Guardar retorno
        int resultado = sumar(29, 2);

        System.out.println("La suma es: " + resultado);

        // Método boolean
        boolean mayorEdad = esMayorEdad(28);

        System.out.println("¿Es mayor de edad?: " + mayorEdad);
    }

}
