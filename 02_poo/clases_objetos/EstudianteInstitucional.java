package sistemaestudiantes;

public class EstudianteInstitucional {
    
    //Atributos
    private String nombre, carrera;
    private int edad;
    private boolean matriculado;
    private double promedio;

    //Constructor vacío
    public EstudianteInstitucional() {
        this.nombre = "Sin nombre";
        this.carrera = "Sin carrera";
        this.edad = 0;
        this.matriculado = false;
        this.promedio = 0;
    }
    
    //Contructor con los parametros
    public EstudianteInstitucional(String nombre, String carrera, int edad, boolean matriculado, double promedio) {
        this.nombre = nombre;
        this.carrera = carrera;
        this.edad = edad;
        this.matriculado = matriculado;
        this.promedio = promedio;
    }
    
    //Mestodos Get y Set
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isMatriculado() {
        return matriculado;
    }
    
    public void setMatriculado(boolean matricula) {
        this.matriculado = matricula;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }
    
    //Metodo toString
    @Override
    public String toString() {
        return    "========Datos del Estudiante======" + "\n"
                + "nombre: " + nombre + "\n"
                + "carrera: " + carrera + "\n"
                + "edad: " + edad + "\n"
                + "matricula: " + matriculado + "\n"
                + "promedio: " + promedio + "\n";
    }

}
