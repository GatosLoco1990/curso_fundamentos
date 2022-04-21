import clases.Zombie;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws Exception {
        mostrarMenu();
    }

    public static void mostrarMenu() {

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
                    System.out.println("Ingrese fecha de nacimiento: ");
                    String fenac = teclado.next();
                    System.out.println("Ingrese el tipo de sangre: ");
                    String sang = teclado.next();

                    arr[i] = new Zombie(nombre, salud, fenac, sang);
                    i++;
                    System.out.print("\033[H\033[2J");
                    System.out.flush();

                    break;
                case 2:
                    for (int j = 0; i - 1 <= i; j++) {
                        System.out.println("El nombre del zombie [" + j + "] es: " + arr[j].getNombre());
                        System.out.println("La salud del zombie [" + j + "] es: " + arr[j].getSalud());
                        System.out
                                .println("La fecha de nacimiento del zombie [" + j + "] es: " + arr[j].getFecha_nac());
                        System.out.println("El tipo de sangre del zombie [" + j + "] es: " + arr[j].getTipo_sang());
                        System.out.println("");
                    }
                    // System.out.println("Presione 'F' para continuar");

                    // System.out.print("\033[H\033[2J");
                    // System.out.flush();

                    break;

            }
        }
        teclado.close();

    }
}
