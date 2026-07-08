package promedioCalificaciones;

public class Main {
    public static void main(String[] args) {
        double[] notas = {5.5,5.7,6.0,7.0,6.8};

        int cantidadNotas = 0;
        double totalNotas = 0;


        for (int n = 0; n< notas.length ; n++){
            cantidadNotas = n+1;
            totalNotas += notas[n];
        }

        double notaFinal = totalNotas / cantidadNotas;

        System.out.println("\nPromedio final: " + notaFinal);
    }
}
