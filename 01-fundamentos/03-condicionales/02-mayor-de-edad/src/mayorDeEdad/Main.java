package mayorDeEdad;

public class Main {
    public static void main(String[] args) {
        int edad = 200;

        //Validacion 1
        if (edad >= 18 && edad <= 100){
            System.out.println("Resultado: Es mayor de edad");
        }

        //Validacion 2
        if (edad > 100){
            System.out.println("Resultado: Por favor dinos dónde escondes la fuente de la juventud");
        }

        //Validacion 3
        if(edad >= 0 && edad <= 17) {
            System.out.println("Resultado: Es menor de edad");
        }

        //Validacion 4
        if (edad < 0 ){
            System.out.println("Resultado: Aun no nace");
        }
    }
}
