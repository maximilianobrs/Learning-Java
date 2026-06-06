package sistemaMatricula;

public class Main {
    public static void main() {

        //Variables para las notas
        double nota1 = 6.0;
        double nota2 = 5.5;
        double nota3 = 6.8;
        double nota4 = 5.7;

        // Suma del total
        double sumaTotal = nota1 + nota2 + nota3 + nota4;

        // Promedio final
        double promedioFinal = sumaTotal / 4;

        //resultados
        System.out.println("Nota 1: " + nota1);
        System.out.println("Nota 2: " + nota2);
        System.out.println("Nota 3: " + nota3);
        System.out.println("Nota 4: " + nota4);
        System.out.println("Promedio final: " + promedioFinal);

    }
}
