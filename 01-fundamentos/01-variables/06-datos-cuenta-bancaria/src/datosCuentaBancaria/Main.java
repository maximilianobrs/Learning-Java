package datosCuentaBancaria;
/**
 * Programa que muestra la información de una cuenta bancaria.
 */
public class Main {
    public static void main(String[] args){
        String titular = "Carlos Mendoza";
        String numeroCuenta = "001122334455";
        long saldo = 1500000;
        char tipoCuenta = 'C';
        boolean cuentaActiva = true;

        System.out.println("\n=== ESTADO DE CUENTA BANCARIA ===");
        System.out.println("Titular de la Cuenta: " + titular);
        System.out.println("Número de Cuenta: " + numeroCuenta);
        System.out.println("Saldo Disponible: $" + saldo);
        System.out.println("Tipo de Cuenta: " + tipoCuenta);
        System.out.println("Cuenta Activa: " + cuentaActiva);
    }
}
