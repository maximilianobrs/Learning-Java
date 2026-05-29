package celulares_basicos;

/**
 * Clase que representa un Celular
 * que contiene como atributos marca, almacenamiento y bateria
 * como tambien unos metodos que ejecutan una accion de llamar() y cargarBateria()
 */

public class Celular {
    String marca,almacenamiento;
    int bateria;


    public Celular(String marca, String almacenamiento, int bateria) {
        this.marca = marca;
        this.almacenamiento = almacenamiento;
        this.bateria = bateria;
    }

    public void llamar(){
        System.out.println("llamando desde " + this.marca);
    }

    public void cargarBateria(){
        System.out.println("cargando bateria de " +this.marca + " %" + this.bateria);
    }

    @Override
    public String toString() {
        return "Celular{" +
                "marca: " + marca + '\'' +
                ", almacenamiento: " + almacenamiento + '\'' +
                ", bateria: " + bateria +
                '}';
    }
}
