import clases.Zombie;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        int n;
        int a = 0;

        while (a == 0) {
            System.out.println("Ingrese un dígito del 1 al 9");
            n = teclado.nextInt();

            switch (n) {
                case 0:
                    a = 1;
                    break;
                case 1:
                    break;

            }
        }

        teclado.close();
    }
}
