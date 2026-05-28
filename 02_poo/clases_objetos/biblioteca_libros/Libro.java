package biblioteca_libros;

/**
 * Clase que representa una Libro
 * que contiene como atributos titulo, autor y paginas
 * como tambien unos metodos de leer() y pausar()
 */

public class Libro {
    String titulo,autor;
    int paginas;

    public Libro(String titulo, String autor, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    //metodo de leer libro
    public void leer(){
        System.out.println("leyendo el libro " + this.titulo);
    }

    //metodo de cerrar libro
    public void cerraLibro(){
        System.out.println("Cerrando el libro "+ this.titulo);
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titulo: " + titulo +
                ", autor: " + autor +
                ", paginas: " + paginas +
                '}';
    }
}
