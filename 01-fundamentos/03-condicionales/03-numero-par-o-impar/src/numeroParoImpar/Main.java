package numeroParoImpar;

public class Main {
    public static void main(String[] args) {
        int numero = 13;
        int resto = numero % 2;

        //Validacion 1
        if (resto == 0) {
            System.out.println("Resultado: el número " + numero + " es par");
        }

        //Validacion 2
        if(resto != 0 ){
            System.out.println("Resultado: el número "+ numero + " es impar");
        }
    }
}
