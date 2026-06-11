package evaluacionAcademica;

public class Main {
    public static void main(String[] args) {
        double nota1 = 5.5;
        double nota2 = 6.5;
        double nota3 = 6.5;
        double promedioReal =   (nota1 + nota2 + nota3) / 3;
        double promedio = Math.round(promedioReal * 10.0) / 10.0;
        String clasificacion;

        if (promedio < 4.0){
            clasificacion = "Reprobado";
        } else if (promedio >= 4.0 && promedio < 6.0) {
            clasificacion = "Aprobado";
        }else{
            clasificacion = "Destacado";
        }

        System.out.println("\n=== REGISTRO PROMEDIO DE NOTAS ESTUDIANTE ===\n");
        System.out.println("Nota 1: " + nota1);
        System.out.println("Nota 2: " + nota2);
        System.out.println("Nota 3: " + nota3);
        System.out.println("\nPromedio: " + promedio);
        System.out.println("Clasificacion: " + clasificacion);
    }
}
