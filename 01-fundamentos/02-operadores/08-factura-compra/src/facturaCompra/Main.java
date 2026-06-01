package facturaCompra;

/**
 * Clase principal para la gestión de una factura de compra en un contexto comercial.
 * Integra el uso de operadores aritméticos y de asignación compuesta para procesar
 * montos, descuentos y totales.
 */

public class Main {
    public static void main() {
        double precioUnitario = 15000.0;
        int cantidadComprada = 3;
        double porcentajeDescuento = 10.0;

        double subtotal = precioUnitario * cantidadComprada;
        double descuento = subtotal * (porcentajeDescuento / 100.0);

        double totalFinal = subtotal;
        totalFinal -= descuento;

        System.out.println("\n=== Factura de Compra ===");
        System.out.println("Precio unitario: " + precioUnitario);
        System.out.println("Cantidad: " + cantidadComprada);
        System.out.println("Subtotal: " + subtotal);
        System.out.println("Descuento: " + descuento);
        System.out.println("Total a pagar: " + totalFinal);
    }
}
