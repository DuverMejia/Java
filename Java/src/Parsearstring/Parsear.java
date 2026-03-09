package Parsearstring;

import java.util.Scanner;

public class Parsear {
    static void main() {
        var consola = new Scanner(System.in);
        System.out.print("Digite 1 numero: ");
        var numero1 = Integer.parseInt(consola.nextLine());
        System.out.print("Digite el 2 número: ");
        var numero2 = consola.nextLine();
        var resultado = numero1 + Integer.parseInt(numero2);
        System.out.println("El resultado es: "+ resultado);


    }
}
