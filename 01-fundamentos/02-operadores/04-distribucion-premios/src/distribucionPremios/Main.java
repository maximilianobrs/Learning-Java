package distribucionPremios;

/**
 * Clase principal para la gestión de reparto de incentivos económicos.
 * Aplicando los operadores de división entera y residuo (módulo) para la distribución equitativa.
 */

public class Main {
    public void main(String[] args) {
        int montoTotal = 100000;
        int cantidadEmpleados = 6;

        int premioPorEmpleado = montoTotal/cantidadEmpleados;
        int sobrante = montoTotal%cantidadEmpleados;

        System.out.println("\n=== Distribución de Premios ====");
        System.out.println("Premio total: "+montoTotal);
        System.out.println("Empleados: "+cantidadEmpleados);
        System.out.println("Premio por empleado: "+ premioPorEmpleado);
        System.out.println("Sobrante: "+sobrante);
    }
}
