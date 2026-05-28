package model;

/**
 * Clase que representa una direccion asociado a un dueño de una mascota
 * que contiene como atributos calle, numero, comuna, ciudad y region
 */

public class Direccion {
    //atributos
    private String calle,comuna,ciudad,region;
    private int numero;

    //constructor
    public Direccion(String calle, String comuna, String ciudad, String region, int numero) {
        this.calle = calle;
        this.comuna = comuna;
        this.ciudad = ciudad;
        this.region = region;
        this.numero = numero;
    }

    //metodos Get y Set
    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getComuna() {
        return comuna;
    }

    public void setComuna(String comuna) {
        this.comuna = comuna;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    //metodo toString
    @Override
    public String toString() {
        return "Direccion{" +
                "calle: " + calle +
                ", numero: " + numero +
                ", comuna: " + comuna +
                ", ciudad: " + ciudad +
                ", region: " + region +
                '}';
    }
}
