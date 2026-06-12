package estadisticasVentas;

public class Main {
    public static void main(String[] args) {
        int ventaDia1 = 50000;
        int ventaDia2 = 75000;
        int ventaDia3 = 50000;
        int ventaDia4 = 60000;
        int ventaDia5 = 80000;
        int ventaDia6 = 90000;
        int ventaDia7 = 45000;

        int totalSemanal = 0;

        int dia = 1;

        while (dia <= 7){

            switch (dia){
                case 1 : totalSemanal+= ventaDia1; break;
                case 2 : totalSemanal+= ventaDia2; break;
                case 3 : totalSemanal+= ventaDia3; break;
                case 4 : totalSemanal+= ventaDia4; break;
                case 5 : totalSemanal+= ventaDia5; break;
                case 6 : totalSemanal+= ventaDia6; break;
                case 7 : totalSemanal+= ventaDia7; break;

            }
            dia++;
        }
        System.out.println("\n=== TOTAL VENTA SEMANAL ===\n");
        System.out.println("Venta día 1: " + ventaDia1);
        System.out.println("Venta día 2: " + ventaDia2);
        System.out.println("Venta día 3: " + ventaDia3);
        System.out.println("Venta día 4: " + ventaDia4);
        System.out.println("Venta día 5: " + ventaDia5);
        System.out.println("Venta día 6: " + ventaDia6);
        System.out.println("Venta día 7: " + ventaDia7);
        System.out.println("\nTotal semanal: " + totalSemanal);
    }
}
