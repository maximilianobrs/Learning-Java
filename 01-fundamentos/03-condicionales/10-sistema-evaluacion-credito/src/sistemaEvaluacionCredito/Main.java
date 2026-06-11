package sistemaEvaluacionCredito;

public class Main {
    public static void main() {

        int edad = 32;
        int ingresoMensual = 1500000;
        int antiguedadLaboral = 4;
        boolean historialPositivo = true;
        String resultado;
        String motivo;

        if (edad >= 18 && ingresoMensual >= 500000 && antiguedadLaboral >= 1 && historialPositivo) {
            resultado = "Crédito aprobado.";
            motivo = "Cumple todos los requisitos mínimos.";
        } else {
            resultado = "Crédito rechazado.";

            if (edad < 18) {
                motivo = "El cliente es menor de edad.";
            } else if (historialPositivo == false) {
                motivo = "El historial crediticio es negativo.";
            } else if (ingresoMensual < 500000) {
                motivo = "El ingreso mensual es insuficiente mínimo 500,000.";
            } else {
                motivo = "La antiguedad laboral es insuficiente mínimo 1 año.";
            }
        }

        System.out.println("=== DATOS EVALUADOS ===");
        System.out.println("Edad: " + edad);
        System.out.println("Ingreso mensual: " + ingresoMensual);
        System.out.println("Antigüedad laboral: " + antiguedadLaboral + " años");
        System.out.println("Historial positivo: " + historialPositivo);

        System.out.println("\n=== RESULTADO DE LA EVALUACIÓN ===");
        System.out.println("Resultado: " + resultado);
        System.out.println("Motivo: " + motivo);
    }
}
