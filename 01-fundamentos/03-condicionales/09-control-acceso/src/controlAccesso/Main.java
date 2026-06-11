package controlAccesso;

public class Main {
    public static void main(String[] args) {
        int edad = 20;
        boolean tieneCredencial = true;
        boolean registroActivo = true;
        String resultado;

        if (tieneCredencial == true && registroActivo == true){
            resultado = "Autorizado";
        }else{
            resultado = "Denegado";
        }
        System.out.println("\n=== REGISTRO DE ATORIZACION ===\n");
        System.out.println("Edad: " + edad);
        System.out.println("Credencial: " + tieneCredencial);
        System.out.println("Registro activo: " + registroActivo);
        System.out.println("\nResultado: " + resultado);
    }
}
