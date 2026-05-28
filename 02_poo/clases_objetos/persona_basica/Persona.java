package persona_basica;

public class Persona {
    String nombre,pais;
    int edad;

    public Persona(String nombre, String pais, int edad) {
        this.nombre = nombre;
        this.pais = pais;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre: " + nombre +
                ", pais: " + pais +
                ", edad: " + edad + " años"+
                '}';
    }
}
