package comparacionDosNumeros;

public class Main {
    public static void main(String[] args) {
        int numero1 = 23;
        int numero2 = 23;

        //Comprobando que numero es mayor o si son iguales
        if(numero1 > numero2){
            System.out.println("Resultado: El primer numero es mayor");
        }else if(numero1 < numero2){
            System.out.println("Resultado: El segundo numero es mayor");
        }else{
            System.out.println("Resultado: Ambos numeros son iguales");
        }
    }
}
