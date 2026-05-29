package mascotas_basicas;

public class Main {
    public static void main(String[] args){

        Mascota mascota1 = new Mascota("Max", "Perro", 4);
        Mascota mascota2 = new Mascota("Luna", "Gato", 2);
        Mascota mascota3 = new Mascota("Pepe", "Loro", 1);

        System.out.println("\n====DATA MASCOTAS====");
        System.out.println(mascota1);
        System.out.println(mascota2);
        System.out.println(mascota3);

        System.out.println("\n====ACCIONES====");
        mascota1.comer();
        mascota2.dormir();
    }
}
