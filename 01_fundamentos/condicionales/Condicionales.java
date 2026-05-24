
package condicionales;

public class Condicionales {

    public static void main(String[] args) {
        
        int edad = 27;
        double nota = 6.5;
        boolean estudiante = true;

        System.out.println("===== CONDICIONALES EN JAVA =====");

        // if - else
        if (edad >= 18) {

            System.out.println("Eres mayor de edad");

        } else {

            System.out.println("Eres menor de edad");
        }

        // else if
        if (nota >= 6.0) {

            System.out.println("Excelente nota");

        } else if (nota >= 4.0) {

            System.out.println("Aprobaste");

        } else {

            System.out.println("Reprobaste");
        }

        // condición con boolean
        if (estudiante) {

            System.out.println("El usuario es estudiante");
        }

        // switch
        int dia = 4;

        System.out.println("\n===== SWITCH =====");

        switch (dia) {

            case 1:
                System.out.println("Lunes");
                break;

            case 2:
                System.out.println("Martes");
                break;

            case 3:
                System.out.println("Miercoles");
                break;

            case 4:
                System.out.println("Jueves");
                break;

            case 5:
                System.out.println("Viernes");
                break;

            default:
                System.out.println("Fin de semana");
        }
    }
    
}
