package estudiantesBasicos;

public class Main {
    public static void main(String[] args){

        Estudiante estudiante1 = new Estudiante("Mateo Silva", "Ingeniería en Sistemas", 5.5);
        Estudiante estudiante2 = new Estudiante("Valeria Gómez", "Medicina", 6.2);
        Estudiante estudiante3 = new Estudiante("Lucas Martínez", "Arquitectura", 6.8);
        Estudiante estudiante4 = new Estudiante("Camila Rojas", "Derecho", 5.9);
        Estudiante estudiante5 = new Estudiante("Nicolás Fuentes", "Diseño Gráfico", 5.4);


        System.out.println("=== Actividad Académica ===");
        estudiante1.estudiar();
        estudiante4.estudiar();
        System.out.println("\n=== Pruebas en rendición ===");
        estudiante2.rendirPrueba();
        estudiante5.rendirPrueba();


        System.out.println("\n=== Registro de Alumnos ===");
        System.out.println(estudiante1);
        System.out.println(estudiante2);
        System.out.println(estudiante3);
        System.out.println(estudiante4);
        System.out.println(estudiante5);
    }
}
