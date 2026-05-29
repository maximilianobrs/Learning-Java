package computadores_basicos;

/**
 * Clase que representa un Computador
 * que contiene como atributos marca, ram y procesador
 * como tambien unos metodos que ejecutan una accion de encenderPc() y abrirPrograma()
 */

public class Computador {
    String marca,ram,procesador;


    public Computador(String marca, String ram, String procesador) {
        this.marca = marca;
        this.ram = ram;
        this.procesador = procesador;
    }

    public void encenderPc(){
        System.out.println("Encendiendo " + this.marca);
    }

    public void abrirPrograma(){
        System.out.println("Abriendo programa en " + this.marca);
    }

    @Override
    public String toString() {
        return "Computador{" +
                "marca: " + marca + '\'' +
                ", ram: " + ram + '\'' +
                ", procesador: " + procesador + '\'' +
                '}';
    }
}
