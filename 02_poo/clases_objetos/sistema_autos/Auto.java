package sistema_autos;

public class Auto {
    String marca,modelo;
    double velocidadMaxima;

    public Auto(String marca, String modelo, double velocidadMaxima) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadMaxima = velocidadMaxima;
    }

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
