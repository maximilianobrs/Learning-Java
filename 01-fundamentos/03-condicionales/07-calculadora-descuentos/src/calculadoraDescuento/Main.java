package calculadoraDescuento;

public class Main {
    public static void main(String[] args) {
        int precio = 51000;
        int descuento1 = 10;
        int descuento2 = 20;
        int descuentoAplicado;

        if (precio > 50000 && precio < 100000){
            descuentoAplicado = descuento1;
        }else if (precio >= 100000){
            descuentoAplicado = descuento2;
        }else{
            descuentoAplicado = 0;
        }

        int totalAhorrado= (precio * descuentoAplicado) / 100;
        int precioFinal = precio - totalAhorrado;

        System.out.println("\n=== REGISTRO DEL DESCUENTO ===\n");
        System.out.println("Monto compra: " + precio);
        System.out.println("Descuento aplicado: " + descuentoAplicado);
        System.out.println("Total final: " + precioFinal);
    }
}
