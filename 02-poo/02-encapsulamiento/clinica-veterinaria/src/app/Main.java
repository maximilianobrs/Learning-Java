package app;

import model.Mascota;
import model.Dueno;
import model.Direccion;

public class Main {
    public static void main (String[] args){

        // Creación de objetos direccion, dueños y mascotas
        Direccion direccion1 = new Direccion("AV SANTOS", "Centro", "Valdivia", "Los Rios", 120);
        Direccion direccion2 = new Direccion("Pasaje Los Pinos", "Norte", "Valdivia", "Los Rios", 45);

        Dueno dueno1 = new Dueno("Alex", "+56933727373", direccion1);
        Dueno dueno2 = new Dueno("Maria", "+56999888777", direccion2);

        Mascota mascota1 = new Mascota("Dobi", "Perro", 6, dueno1);
        Mascota mascota2 = new Mascota("Luna", "Ave", 3, dueno2);
        Mascota mascota3 = new Mascota("Rocky", "Gato", 4, dueno1);

        System.out.println(mascota1);
        System.out.println(mascota2);
        System.out.println(mascota3);
    }
}
