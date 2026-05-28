package model;

/**
 * Clase que representa una mascota dentro del sistema de la clínica veterinaria
 * que contiene como atributos nombre, especie, edad y su dueño
 */

public class Mascota {
    //Atributos
    private String nombre,especie;
    private int edad;
    private Dueno dueno;

    //Constructor
    public Mascota(String nombre, String especie, int edad, Dueno dueno) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
        this.dueno = dueno;
    }

    //Metodos Get y Set

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Dueno getDueno() {
        return dueno;
    }

    public void setDueno(Dueno dueno) {
        this.dueno = dueno;
    }

    //Metodo toString

    @Override
    public String toString() {
        return "Mascota{" +
                " nombre: " + nombre +
                ", especie: " + especie +
                ", edad: " + edad + " años " +
                ", dueño: " + dueno + "}";
    }
}
