package personaBasica;

public class Main {
    public static void main (String[] args){

        Persona persona1 = new Persona("Sofía", "Chile", 25);
        Persona persona2 = new Persona("Mateo", "México", 30);
        Persona persona3 = new Persona("Lucas", "España", 19);


        System.out.println(persona1);
        System.out.println(persona2);
        System.out.println(persona3);
    }
}
