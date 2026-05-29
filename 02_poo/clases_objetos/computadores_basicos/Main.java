package computadores_basicos;

public class Main {
    public static void main(String[] args){

        Computador pc1 = new Computador("Dell", "16GB", "Intel i7");
        Computador pc2 = new Computador("HP", "8GB", "AMD Ryzen 5");
        Computador pc3 = new Computador("Apple", "18GB", "M3 Pro");


        System.out.println("\n====Información de los Equipos====");
        System.out.println(pc1);
        System.out.println(pc2);
        System.out.println(pc3);



        System.out.println("\n====Acciones de los Equipos====");
        pc1.encenderPc();
        pc1.abrirPrograma();
        System.out.println("\n===============================");
        pc3.encenderPc();
        pc3.abrirPrograma();
    }
}
