package mascotas_basicas;

/**
 * Clase que representa una Mascota
 * que contiene como atributos nombre, especie y edad
 * como tambien unos metodos de comer() y dormir()
 */

public class Mascota {
    String nombre,especie;
    int edad;


    public Mascota(String nombre, String especie, int edad) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
    }

    public void comer(){
        System.out.println(this.nombre + " come");
    }

    public void dormir(){
        System.out.println(this.nombre + " duerme");
    }

    @Override
    public String toString() {
        return "Mascota{" +
                "nombre: " + nombre +
                ", especie: " + especie +
                ", edad: " + edad +
                '}';
    }
}
