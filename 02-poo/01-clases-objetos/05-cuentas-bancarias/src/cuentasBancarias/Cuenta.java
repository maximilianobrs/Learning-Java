package cuentasBancarias;

/**
 * Clase que representa un Cuenta
 * que contiene como atributos titular, tipoDeCuenta y saldo
 * como tambien unos metodos que ejecutan una accion con sus respectivas validaciones
 * depositar() permite depositar el saldo en la cuenta
 * retirar() permite retirar saldo de la cuenta
 */

public class Cuenta {
    String titular,tipoDeCuenta;
    long saldo;

    public Cuenta(String titular, String tipoDeCuenta, long saldo) {
        this.titular = titular;
        this.tipoDeCuenta = tipoDeCuenta;
        this.saldo = saldo;
    }

    public void depositar(long monto){
        if (monto > 0) {
            this.saldo += monto;
            System.out.println("Depósito exitoso de $" + monto + " en la cuenta de " + this.titular);
        } else {
            System.out.println("El monto a depositar debe ser mayor a cero.");
        }
    }

    public void retirar(long monto){
        if (monto <= 0) {
            System.out.println("El monto a retirar debe ser mayor a cero.");
        } else if (monto > this.saldo) {
            System.out.println("Fondos insuficientes. Saldo actual: $" + this.saldo);
        } else {
            this.saldo -= monto;
            System.out.println("Retiro exitoso de $" + monto + " realizado por " + this.titular);
        }
    }

    @Override
    public String toString() {
        return "Cuenta{" +
                "titular: " + titular +
                ", tipoDeCuenta: " + tipoDeCuenta +
                ", saldo: " + saldo +
                '}';
    }
}
