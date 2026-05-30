package cuentas_bancarias;

public class Main {
    public static void main(String[] args){
        // Creación de dos cuentas bancarias con saldos iniciales distintos
        Cuenta cuenta1 = new Cuenta("Carlos Mendoza", "Ahorros", 500000);
        Cuenta cuenta2 = new Cuenta("Ana Gómez", "Corriente", 15000);

        System.out.println("\n====Estado Inicial====");
        System.out.println(cuenta1);
        System.out.println(cuenta2);

        System.out.println("\n====Movimientos Cuenta 1====");
        cuenta1.depositar(150000);
        cuenta1.retirar(200000);
        System.out.println(cuenta1); // Muestra el nuevo saldo

        System.out.println("\n====Movimientos Cuenta 2====");
        cuenta2.retirar(30000); // Intento de retirar más de lo que tiene
        cuenta2.depositar(50000); // Depósito para salvar el saldo
        cuenta2.retirar(30000); // Ahora sí permite el retiro
        System.out.println(cuenta2);
    }
}
