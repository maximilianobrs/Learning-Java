package bibliotecaLibros;



public class Main {
    public static void main(String[] args){

        Libro libro1 = new Libro("Cien años de soledad", "Gabriel García Márquez", 496);
        Libro libro2 = new Libro("Don Quijote de la Mancha", "Miguel de Cervantes", 1032);
        Libro libro3 = new Libro("El Principito", "Antoine de Saint-Exupéry", 96);
        Libro libro4 = new Libro("1984", "George Orwell", 328);
        Libro libro5 = new Libro("Ficciones", "Jorge Luis Borges", 224);

        System.out.println("=== Actividad de Lectura ===");
        libro1.leer();
        libro3.leer();
        libro3.cerraLibro();

        System.out.println("\n=== Catálogo de la Biblioteca ===");
        System.out.println(libro1);
        System.out.println(libro2);
        System.out.println(libro3);
        System.out.println(libro4);
        System.out.println(libro5);
    }
}
