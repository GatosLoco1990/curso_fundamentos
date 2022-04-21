import clases.Zombie;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        int n;
        int a = 0;
        int i = 0;
        Zombie[] arr = new Zombie[100];

        while (a == 0) {
            System.out.println("Ingrese un dígito del 1 al 9");
            n = teclado.nextInt();

            switch (n) {
                case 0:
                    a = 1;
                    break;
                case 1:
                    System.out.println("Ingrese el nombre, salud, fecha de nacimiento y tipo de sangre del zombie: ");
                    System.out.println("Ingrese el nombre: ");
                    String nombre = teclado.next();
                    System.out.println("Ingrese la salud: ");
                    int salud = teclado.nextInt();
                    System.out.println("Ingrese el Tipo de sangre: ");
                    String nombre = teclado.next();
                    System.out.println("Ingrese el nombre: ");
                    String nombre = teclado.next();
                    arr[i] = new 

                    break;

            }
        }

        teclado.close();
    }
}
