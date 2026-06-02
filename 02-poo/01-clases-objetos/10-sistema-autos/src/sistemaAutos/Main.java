package sistemaAutos;

public class Main {
    public static void main(String[] args){

        Auto auto1 = new Auto("Bugatti", "Chiron Super Sport", 440.0);
        Auto auto2 = new Auto("Nissan", "GT-R R35", 315.0);
        Auto auto3 = new Auto("Ford", "Mustang Shelby GT500", 290.0);
        Auto auto4 = new Auto("McLaren", "P1", 350.0);
        Auto auto5 = new Auto("Koenigsegg", "Jesko Absolut", 530.0);

        System.out.println("=== Encendiendo autos ===");
        auto1.encender();
        auto2.encender();


        System.out.println("\n-=== Fichas Técnicas ===");
        System.out.println(auto1);
        System.out.println(auto2);
        System.out.println(auto3);
        System.out.println(auto4);
        System.out.println(auto5);
    }
}
