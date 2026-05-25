package sistemaestudiantes;

public class SistemaEstudiantes {
    public static void main(String[] args) {
        
        EstudianteInstitucional estudiante1 = new EstudianteInstitucional("Alex", "Analista programador", 25, true,5.5);
        EstudianteInstitucional estudiante2 = new EstudianteInstitucional("Maria","Analista de sistemas",28,true,6.5);
        EstudianteInstitucional estudiante3 = new EstudianteInstitucional();
        
        System.out.println(estudiante1);
        System.out.println(estudiante2);
        System.out.println(estudiante3);
    }
}
