package catalogo_videojuegos;

public class Main {
    public static void main (String[] args){

        //objetos Videojuego
        Videojuego juego1 = new Videojuego("The Legend of Zelda: Breath of the Wild", "Aventura/Acción", 120);
        Videojuego juego2 = new Videojuego("Minecraft", "Sandbox/Supervivencia", 450);
        Videojuego juego3 = new Videojuego("The Witcher 3: Wild Hunt", "RPG", 85);
        Videojuego juego4 = new Videojuego("Elden Ring", "Souls-like/Acción", 150);
        Videojuego juego5 = new Videojuego("Counter-Strike 2", "Shooter Táctico", 800);

        //metodo jugar de algunos títulos
        System.out.println("=== Iniciando sesiones de juego ===");
        juego1.jugar();
        juego3.jugar();
        juego5.jugar();

        //catálogo
        System.out.println("\n=== Mi Catálogo de Videojuegos ===");
        System.out.println(juego1);
        System.out.println(juego2);
        System.out.println(juego3);
        System.out.println(juego4);
        System.out.println(juego5);
    }
}
