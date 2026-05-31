package consumoCombustible;
/**
 * Clase principal para el cálculo del rendimiento de combustible de un vehículo.
 * Uso de divisiones con punto flotante para obtener mediciones precisas.
 */
public class Main {
    public static void main() {
        int kilometrosRecorridos = 600;
        double litrosConsumidos = 40.0;
        double rendimiento = kilometrosRecorridos/litrosConsumidos;

        System.out.println("\n=== Consumo de Combustible ===");
        System.out.println("Kilómetros recorridos: " + kilometrosRecorridos);
        System.out.println("Litros consumidos: "+ litrosConsumidos);
        System.out.println("Rendimiento: " + rendimiento + "km/l");
    }
}
