package libro;

import java.util.Scanner;

public class libro {
    static void main() {
        var consola = new Scanner(System.in);
        System.out.print("Proporciona el titulo de un libro:");
        var titulo = consola.nextLine();
        System.out.println("Proporcione el autor del libro");
        String autor = consola.nextLine();
        System.out.println("el titulo "+ titulo +" Fue escrito por "+autor);
    }
}
