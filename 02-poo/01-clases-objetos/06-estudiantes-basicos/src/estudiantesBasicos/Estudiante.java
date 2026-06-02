package estudiantesBasicos;

/**
 * Clase que representa un Estudiante
 * que contiene como atributos nombre, carrera y promedio
 * como tambien unos metodos de estudiar() registro de la carrera que cursa y rendirPrueba() mensaje si esta rindiendo una prueba
 */

public class Estudiante {
    String nombre,carrea;
    double promedio;


    public Estudiante(String nombre, String carrea, double promedio) {
        this.nombre = nombre;
        this.carrea = carrea;
        this.promedio = promedio;
    }

    public void estudiar(){
        System.out.println(this.nombre + " está estudiando para la carrera de " + this.carrea);
    }

    public void rendirPrueba(){
        System.out.println(this.nombre + " está rindiendo una prueba");
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "nombre: " + nombre +
                ", carrea: " + carrea +
                ", promedio: " + promedio +
                '}';
    }
}
