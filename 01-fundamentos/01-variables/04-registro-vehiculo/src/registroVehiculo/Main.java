package registroVehiculo;

public class Main {
    public static void main(String[] args){
        String marca = "Toyota";
        int anio = 2022;
        double kilometraje = 25450.5;
        char tipoDeLicencia = 'B';
        boolean revisionVigente = true;

        System.out.println("\n=== DETALLES DEL VEHÍCULO ===");
        System.out.println("Marca: " + marca);
        System.out.println("Año: " + anio);
        System.out.println("Kilometraje: " + kilometraje + " km");
        System.out.println("Tipo de Licencia Requerida: Clase " + tipoDeLicencia);
        System.out.println("Revisión Técnica al Día: " + revisionVigente);
    }
}
