package Parsearstring;

import java.util.Scanner;

public class DatosEmpleados {
    public static void main() {
        var console = new Scanner(System.in);
        System.out.println("*REGISTRO DE EMPLEADOS*");
        System.out.print("Nombre de empleado: ");
        var nombre = console.nextLine();
        System.out.print("Edad: ");
        var edad = Integer.parseInt(console.nextLine());
        System.out.print("Sueldo: ");
        var sueldo = Float.parseFloat(console.nextLine());
        System.out.print("es empleado de confianza: ");
        var confianza = Boolean.parseBoolean(console.nextLine());

        System.out.println("DATOS INGRESADOS");
        System.out.println("nombre = " + nombre);
        System.out.println("edad = " + edad);
        System.out.println("sueldo = " + sueldo);
        System.out.println("confianza = " + confianza);

    }
}
