package celularesBasicos;

public class Main {
    public static void main(String[] args){

        Celular celular1 = new Celular("Nokia", "32MB", 60);
        Celular celular2 = new Celular("Motorola", "64MB", 80);


        System.out.println("===Información del Celular 1===");
        System.out.println(celular1.toString());
        celular1.llamar();
        celular1.cargarBateria();

        System.out.println("\n===Información del Celular 2===");
        System.out.println(celular2.toString());
        celular2.llamar();
        celular2.cargarBateria();
    }
}
