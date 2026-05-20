package variables;

public class Variables {

    public static void main(String[] args) {
        
        //NUMEROS ENTEROS
        byte edad = 30; // Datos pequeños
        short anio = 2000; // Numeros pequeños
        int inventario = 150000; //El mas usado para contar
        long cantidadArena = 9876543210L; //Para numeros gigantes siempre terminar en "L"
        
        //NUMEROS DECIMALES
        float precio = 3.50f; //Obligatorio terminar en "f"
        double gravedad = 9.000; //Estandar para precision matematica
        
        //CARACTERES
        char inicialNombre = 'A'; //Siempre comillas simples
        
        //ESTADOS LÓGICOS
        boolean permitido = true; //Control para saber si tiene acceso o no
        boolean disponibilidad = false; //Disponibilidad de productos o no
        
        //CASO ESPECIAL OBJETO NO PRIMITIVO
        String mensaje = "Hola mundo";
        
        //Ejemplos de impresion en consola
        System.out.println(edad);
        System.out.println(anio);
        System.out.println(inventario);
        System.out.println(cantidadArena);
        System.out.println(precio);
        System.out.println(gravedad);
        System.out.println(inicialNombre);
        System.out.println(permitido);
        System.out.println(disponibilidad);
        System.out.println(mensaje);
    }
    
}
