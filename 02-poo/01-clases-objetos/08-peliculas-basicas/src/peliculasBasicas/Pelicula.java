package peliculasBasicas;

/**
 * Clase que representa una Pelicula
 * que contiene como atributos titulo, director y duracion
 * como tambien unos metodos de reproducir() y pausar()
 */

public class Pelicula {
    String titulo,director;
    int duracion;

    public Pelicula(String titulo, String director, int duracion) {
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
    }

    public void reproducir(){
        System.out.println("Reproduciendo " + this.titulo);
    }

    public void pausar(){
        System.out.println("Pausando " + this.titulo);
    }

    @Override
    public String toString() {
        return "Pelicula{" +
                "titulo: " + titulo +
                ", director: " + director +
                ", duracion: " + duracion +
                '}';
    }
}
