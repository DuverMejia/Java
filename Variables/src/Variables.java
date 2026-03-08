import java.util.Scanner;

public class Variables {
    static void main(String[] args) {
// Introduccir valores por consola
        Scanner consola = new Scanner(System.in); //in = input tambien se pudo declarar con var por la inferencia
        System.out.println("Escribe tu nombre: ");
        var nombre = consola.nextLine();
        System.out.println("nombre = " + nombre);
    }
}
