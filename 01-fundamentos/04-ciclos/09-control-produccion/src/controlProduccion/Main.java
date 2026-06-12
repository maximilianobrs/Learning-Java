package controlProduccion;

public class Main {
    public static void main(String[] args) {

        int produccionDia1 = 150;
        int produccionDia2 = 220;
        int produccionDia3 = 210;
        int produccionDia4 = 170;
        int produccionDia5 = 180;
        int produccionDia6 = 180;
        int produccionDia7 = 200;

        int metaDiaria = 200;
        int produccionTotal = 0;
        int diasMetaCumplida = 0;
        int diasMetaNoCumplida = 0;
        int contador = 1;
        int produccionEvaluacion = 0;

        do {

            switch (contador){
                case 1:
                    produccionTotal += produccionDia1;
                    produccionEvaluacion = produccionDia1;
                    break;
                case 2:
                    produccionTotal += produccionDia2;
                    produccionEvaluacion = produccionDia2;
                    break;
                case 3:
                    produccionTotal += produccionDia3;
                    produccionEvaluacion = produccionDia3;
                    break;
                case 4:
                    produccionTotal += produccionDia4;
                    produccionEvaluacion = produccionDia4;
                    break;
                case 5:
                    produccionTotal += produccionDia5;
                    produccionEvaluacion = produccionDia5;
                    break;
                case 6:
                    produccionTotal += produccionDia6;
                    produccionEvaluacion = produccionDia6;
                    break;
                case 7:
                    produccionTotal += produccionDia7;
                    produccionEvaluacion = produccionDia7;
                    break;
            }

            if (produccionEvaluacion >= metaDiaria){
                diasMetaCumplida++;
            }else{
                diasMetaNoCumplida++;
            }

            contador++;
        }while (contador <= 7);

        System.out.println("\n=== PRODUCCION SEMANAL ===\n");
        System.out.println("Meta diaria: " + metaDiaria);
        System.out.println("\nProducción total: " + produccionTotal);
        System.out.println("\nDías que cumplieron la meta: " + diasMetaCumplida);
        System.out.println("\nDías que no cumplieron la meta: " + diasMetaNoCumplida);

    }
}
