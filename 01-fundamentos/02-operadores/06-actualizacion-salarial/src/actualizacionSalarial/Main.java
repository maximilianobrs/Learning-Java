package actualizacionSalarial;

/**
 * Clase principal para el cálculo del incremento de ingresos del personal.
 * Fórmulas de porcentaje y operadores combinados para actualizar salarios.
 */

public class Main {
    public static void main(String[] args) {
        double salarioActual = 1200000.0;
        double porcentajeAumento = 10.0;

        double valorAumento = (salarioActual * porcentajeAumento) / 100.0;

        double nuevoSalario = salarioActual + valorAumento;
        nuevoSalario += valorAumento;

        System.out.println("\n=== Actualización Salarial ===");
        System.out.println("Salario actual: " + salarioActual);
        System.out.println("Aumento: " + porcentajeAumento + "%");
        System.out.println("Valor aumento: " + valorAumento);
        System.out.println("Nuevo salario: " + nuevoSalario);

    }
}
