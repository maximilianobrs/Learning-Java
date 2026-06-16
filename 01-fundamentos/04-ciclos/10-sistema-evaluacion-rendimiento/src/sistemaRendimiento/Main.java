package sistemaRendimiento;

public class Main {
    public static void main(String[] args) {

        int tareasDia1 = 12;
        int tareasDia2 = 8;
        int tareasDia3 = 15;
        int tareasDia4 = 11;
        int tareasDia5 = 9;
        int tareasDia6 = 14;
        int tareasDia7 = 15;

        int metaDiaria = 10;
        int tarea = 0;


        int totalAcumulado = 0;
        int diasMetaSuperada = 0;
        int contador = 1;
        String rendimeinto = "";


        while(contador <= 7){

            switch (contador){
                case 1: totalAcumulado += tareasDia1;tarea = tareasDia1; break;
                case 2: totalAcumulado += tareasDia2;tarea = tareasDia2; break;
                case 3: totalAcumulado += tareasDia3;tarea = tareasDia3; break;
                case 4: totalAcumulado += tareasDia4;tarea = tareasDia4; break;
                case 5: totalAcumulado += tareasDia5;tarea = tareasDia5; break;
                case 6: totalAcumulado += tareasDia6;tarea = tareasDia6; break;
                case 7: totalAcumulado += tareasDia7;tarea = tareasDia7; break;
            }


            if (tarea > metaDiaria){
                diasMetaSuperada++;
            }

            contador++;
        }
        
        double promedioDiario = (double)totalAcumulado/7;

        if (promedioDiario < 8){
            rendimeinto = "Rendimiento insuficiente";
        }else if (promedioDiario >= 8 && promedioDiario <= 10){
            rendimeinto = "Rendimiento aceptable";
        }else {
            rendimeinto = "Rendimiento sobresaliente";
        }

        System.out.println("\n=== EVALUACION DE RENDIMIENTO ===\n");
        System.out.println("Meta diaria: " + metaDiaria);
        System.out.println("Total de tareas: " + totalAcumulado);
        System.out.println("Promedio diario: " + promedioDiario);
        System.out.println("Días que superaron la meta: " + diasMetaSuperada);
        System.out.println("Resultado final: " + rendimeinto);




    }
}
