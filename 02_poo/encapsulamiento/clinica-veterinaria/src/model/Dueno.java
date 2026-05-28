package model;

/**
 * Clase que representa un dueño asociado a una mascota dentro de la clinica veterinaria
 * que contiene como atributos nombre, dirección y teléfono
 */

public class Dueno {
    //Atributos
    private String nombre,telefono;
    private Direccion direccion;

    //Constructor
    public Dueno(String nombre,String telefono, Direccion direccion){
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    //Metodos Get y Set

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    //Metodo toString
    @Override
    public String toString() {
        return  "Dueño{" +
                " nombre: " + nombre +
                ", telefono: " + telefono +
                ", direccion: " + direccion +
                "}";
    }
}
