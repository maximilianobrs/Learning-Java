package catalogo_videojuegos;

/**
 * Clase que representa un Videojuego
 * que contiene como atributos nombre, genero y horas jugadas
 * como tambien un metodo jugar() si se quiere ejecutar
 */

public class Videojuego {
    String nombre,genero;
    int horasJugadas;


    public Videojuego(String nombre, String genero, int horasJugadas) {
        this.nombre = nombre;
        this.genero = genero;
        this.horasJugadas = horasJugadas;
    }

    public void jugar(){
        System.out.println("Juega " + this.nombre);
    }

    @Override
    public String toString() {
        return "Videojuego{" +
                "nombre: " + nombre +
                ", genero: " + genero +
                ", horasJugadas: " + horasJugadas +
                '}';
    }
}
