package AprobadoReprobado;

public class Main {
    public static void main(String[] args) {
        double nota = 3.9;

        //Validacion if-else aprobado o reprobado
        if (nota >= 4.0){
            System.out.println("Resultado: El estudiante aprobo con una nota " + nota);
        }else{
            System.out.println("Resultado: El estudiante reprobo con una nota " + nota);
        }
    }
}
