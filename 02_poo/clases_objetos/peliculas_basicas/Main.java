package peliculas_basicas;

public class Main {
    public static void main(String[] args){
        //objetos Pelicula
        Pelicula peli1 = new Pelicula("Interstellar", "Christopher Nolan", 169);
        Pelicula peli2 = new Pelicula("Spiderman: Into the Spider-Verse", "Bob Persichetti", 117);
        Pelicula peli3 = new Pelicula("The Dark Knight", "Christopher Nolan", 152);
        Pelicula peli4 = new Pelicula("Avatar: The Way of Water", "James Cameron", 192);
        Pelicula peli5 = new Pelicula("Pulp Fiction", "Quentin Tarantino", 154);

        System.out.println("\n=== Controladores de pelicula ===");
        //acciones de los métodos
        peli1.reproducir();
        peli1.pausar();

        //depuracion rapida catalogo
        System.out.println("\n=== CATALOGO ===");
        System.out.println(peli1);
        System.out.println(peli2);
        System.out.println(peli3);
        System.out.println(peli4);
        System.out.println(peli5);
    }
}
