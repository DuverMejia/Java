package Parsearstring;

import java.util.Scanner;

public class presentarse {
    public static void main() {
        Scanner consola = new Scanner(System.in);

        int edad;
        String nombre, bebida;
        boolean hijo;
        float precio;

        System.out.println("a continuación se solicitaran unos datos personales");

        System.out.print("Cual es su nombre: ");
        nombre = consola.nextLine();

        System.out.print("Cual es su edad: ");
        edad = Integer.parseInt(consola.nextLine());

        System.out.print("eres hijo unico? responda True/False: ");
        hijo = Boolean.parseBoolean(consola.nextLine());

        System.out.print("Cual es su bebida favorita: ");
        bebida = consola.nextLine();

        System.out.println("Cual es el precio de esa bebida?");
        precio = Float.parseFloat(consola.nextLine());

        System.out.println("Los datos obtenidos son: \n" + nombre + "\n"+ edad + "\n" + hijo + "\n" + bebida + "\n" + precio);
    }
}
