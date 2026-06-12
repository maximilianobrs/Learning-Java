package analisisCalificaciones;

public class Main {
    public static void main(String[] args) {

        double nota1 = 5.5;
        double nota2 = 6.5;
        double nota3 = 3.9;
        double nota4 = 6.0;
        double nota5 = 7.0;

        int catidadNotas = 5;
        int contador = 1;
        int aprobadas = 0;

        double sumaTotal = 0;



        while (contador <= catidadNotas){

            double notaEvaluada = 0;

            if (contador == 1){
                notaEvaluada = nota1;
                sumaTotal += nota1;
            } else if (contador == 2) {
                notaEvaluada = nota2;
                sumaTotal += nota2;
            } else if (contador == 3) {
                notaEvaluada = nota3;
                sumaTotal += nota3;
            } else if (contador == 4) {
                notaEvaluada = nota4;
                sumaTotal += nota4;
            } else if (contador == 5) {
                notaEvaluada = nota5;
                sumaTotal += nota5;
            }

            if (notaEvaluada >= 4.0){
                aprobadas++;
            }

            contador++;
        }

        double promedioReal = sumaTotal/catidadNotas;
        double promedio = Math.round(promedioReal * 10.0) / 10.0;

        System.out.println("\n=== EVALUACION DE NOTAS ===\n");
        System.out.println("Cantidad de notas: " + catidadNotas);
        System.out.println("\nPromedio: " + promedio);
        System.out.println("Aprobada: " + aprobadas);

    }
}
