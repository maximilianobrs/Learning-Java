package clasificacionTemperatura;

public class Main {
    public static void main(String[] args) {
        int temperatura = 35;

        if (temperatura < 10) {
            System.out.println("Resultado: Temperatura fria");
        } else if (temperatura >= 10 && temperatura <= 20) {
            System.out.println("Resultado: Temperatura fresco");
        }else if (temperatura >= 21 && temperatura <= 25){
            System.out.println("Resultado: Temperatura calido");
        }else{
            System.out.println("Resultado: Temperatura caluroso");
        }
    }
}
