package sistema_autos;

/**
 * Clase que representa un Automovil
 * que contiene como atributos marca, modelo y velocidad maxima
 * como tambien un metodo endencer()
 */

public class Auto {
    String marca,modelo;
    double velocidadMaxima;

    public Auto(String marca, String modelo, double velocidadMaxima) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadMaxima = velocidadMaxima;
    }

    //Metodo para encender el vehiculo
    public void encender(){
        System.out.println("vehicular " + this.modelo +  " encendido.");
    }

    @Override
    public String toString() {
        return "Auto{" +
                "marca: " + marca +
                ", modelo: " + modelo +
                ", velocidadMaxima=" + velocidadMaxima +
                '}';
    }
}
