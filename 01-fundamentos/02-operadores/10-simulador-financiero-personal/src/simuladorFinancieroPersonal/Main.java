package simuladorFinancieroPersonal;

public class Main {
    public static void main() {
        //Variables de ingresos
        double salarioMensual = 1200000;
        double ingresoExtra = 150000;

        //Variables de gastos
        double gastoVivienda = 400000;
        double gastoAlimentacion = 180000;
        double gastoTransporte = 70000;
        double gastoEntretenimiento = 50000;

        //Cálculos de totales y dinero restante
        double ingresosTotales = salarioMensual + ingresoExtra;
        double gastosTotales = gastoVivienda + gastoAlimentacion + gastoTransporte + gastoEntretenimiento;
        double dineroRestante = ingresosTotales - gastosTotales;

        //Cálculos de porcentajes
        double porcentajeGastos = (gastosTotales / ingresosTotales) * 100;
        double porcentajeAhorro = (dineroRestante / ingresosTotales) * 100;

        //Resultados
        System.out.println("Salario: " + (int)salarioMensual);
        System.out.println("Ingreso extra: " + (int)ingresoExtra);
        System.out.println("");
        System.out.println("Ingresos totales: " + (int)ingresosTotales);
        System.out.println("");
        System.out.println("Vivienda: " + (int)gastoVivienda);
        System.out.println("Alimentación: " + (int)gastoAlimentacion);
        System.out.println("Transporte: " + (int)gastoTransporte);
        System.out.println("Entretenimiento: " + (int)gastoEntretenimiento);
        System.out.println("");
        System.out.println("Gastos totales: " + (int)gastosTotales);
        System.out.println("");
        System.out.println("Dinero restante: " + (int)dineroRestante);

        System.out.printf("Porcentaje de gastos: %.2f%%\n", porcentajeGastos);
        System.out.printf("Porcentaje de ahorro: %.2f%%\n", porcentajeAhorro);
    }
}
