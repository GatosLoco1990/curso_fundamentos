import clases.Ubicacion;
import clases.Zombie;
import java.util.Scanner;
import java.util.Random;

public class Principal {
    public static void main(String[] args) throws Exception {
        mostrarMenu();
    }

    public static void mostrarMenu() {

        Scanner teclado = new Scanner(System.in);

        int n;
        int a = 0;
        int i = 3;
        int k = 3;
        String nada;
        int posicion, datoaño;
        String fecha, dia, mes, año;

        Zombie[] arr = new Zombie[100];
        arr[0] = new Zombie("Ricardo", 12, "05/12/2004", "A+");
        arr[1] = new Zombie("Laura", 56, "18/02/2004", "AB");
        arr[2] = new Zombie("Samuel", 46, "17/03/2005", "O+");

        Ubicacion[] ubi = new Ubicacion[100];
        ubi[0] = new Ubicacion("Cúcuta", 250, 500);
        ubi[1] = new Ubicacion("Medellín", 460, 1200);
        ubi[2] = new Ubicacion("Pamplona", 670, 4500);

        while (a == 0) {
            System.out.println("Ingrese un dígito del 1 al 12");
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
                    System.out.println("Ingrese fecha de nacimiento (en formato 'DD/MM/YYYY'): ");
                    String fenac = teclado.next();
                    System.out.println("Ingrese el tipo de sangre: ");
                    String sang = teclado.next();

                    arr[i] = new Zombie(nombre, salud, fenac, sang);
                    i++;
                    BorrarPantalla();

                    break;
                case 2:
                    for (int j = 0; j <= i - 1; j++) {
                        MostrarZombie(arr, j);
                    }
                    System.out.println("Digite cualquier cosa");
                    nada = teclado.next();
                    BorrarPantalla();

                    break;
                case 3:
                    for (int j = 3; j <= i - 1; j++) {
                        MostrarZombie(arr, j);
                    }
                    System.out.println("Digite cualquier cosa");
                    nada = teclado.next();
                    BorrarPantalla();

                    break;
                case 4:
                    for (int j = 0; j <= i - 1; j++) {
                        if (arr[j].getTipo_sang().equals("O+") || arr[j].getTipo_sang().equals("AB")) {
                            MostrarZombie(arr, j);
                        }
                    }

                    break;
                case 5:
                    for (int j = 0; j <= i - 1; j++) {
                        fecha = arr[j].getFecha_nac();
                        posicion = fecha.indexOf("/");
                        dia = fecha.substring(0, posicion);
                        fecha = fecha.substring(posicion + 1);
                        posicion = fecha.indexOf("/");
                        mes = fecha.substring(0, posicion);
                        fecha = fecha.substring(posicion + 1);
                        año = fecha;

                        datoaño = Integer.parseInt(año);
                        if (datoaño > 2000) {
                            MostrarZombie(arr, j);
                        }

                    }

                    break;
                case 6:
                    for (int j = 0; j <= i - 1; j++) {
                        arr[j].setSalud(arr[j].getSalud() / 2);
                    }
                    break;
                case 7:
                    System.out.println("Ingrese el nombre, distancia y cantidad de zombies de la ubicación: ");
                    System.out.println("Ingrese el nombre: ");
                    String nom = teclado.next();
                    System.out.println("Ingrese la distancia: ");
                    Float distancia = teclado.nextFloat();
                    System.out.println("Ingrese cantidad de zombies: ");
                    int cant = teclado.nextInt();

                    ubi[k] = new Ubicacion(nom, distancia, cant);
                    k++;
                    BorrarPantalla();
                    break;
                case 8:
                    for (int j = 0; j <= i - 1; j++) {
                        MostrarUbicaciones(ubi, j);
                    }
                    System.out.println("Digite cualquier cosa");
                    nada = teclado.next();
                    BorrarPantalla();
                    break;
                case 9:
                    UbicacionMasSegura(ubi, k);
                    System.out.println("Digite cualquier cosa");
                    nada = teclado.next();
                    BorrarPantalla();
                    break;
                case 10:
                    ubicacionesMasCercanas(ubi);
                    System.out.println("Digite cualquier cosa");
                    nada = teclado.next();
                    BorrarPantalla();
                    break;
                case 11:
                    aleatoria();
                    System.out.println("Digite cualquier cosa");
                    nada = teclado.next();
                    BorrarPantalla();
                    break;

                case 12:
                    System.out.println("Ingrese posicion: ");
                    String pos = teclado.next();
                    System.out.println("Ingrese nombre : ");
                    String nuevoNombre = teclado.next();
                    cambiarNombre(arr, Integer.valueOf(pos), nuevoNombre);
                    break;

            }
        }
        teclado.close();

    }

    public static void MostrarZombie(Zombie[] arr, int j) {
        System.out.println(" El nombre del zombie [" + j + "] es: " + arr[j].getNombre());
        System.out.println(" La salud del zombie [" + j + "] es: " + arr[j].getSalud());
        System.out
                .println(" La fecha de nacimiento del zombie [" + j + "] es: "
                        + arr[j].getFecha_nac());
        System.out.println(" El tipo de sangre del zombie [" + j + "] es: " + arr[j].getTipo_sang());
        System.out.println("");

    }

    public static void MostrarUbicaciones(Ubicacion[] ubi, int i) {

        System.out.println(" " + ubi[i].getNombre());
        System.out.println(" " + String.valueOf(ubi[i].getDistancia()));
        System.out.println(" " + String.valueOf(ubi[i].getCant()));
        System.out.println(" ");

    }

    public static void UbicacionMasSegura(Ubicacion[] ubi, int k) {

        int cantidadMenor = ubi[0].getCant();
        String ubicacion = ubi[0].getNombre();

        for (int i = 1; i <= k - 1; i++) {

            if (cantidadMenor > ubi[i].getCant()) {
                cantidadMenor = ubi[i].getCant();
                ubicacion = ubi[i].getNombre();
            }

        }

        System.out.println(
                " la mas segura es  " + ubicacion + " tiene solo " + String.valueOf(cantidadMenor) + " zombies ");
        System.out.println(" ");

    }

    public static void ubicacionesMasCercanas(Ubicacion[] ubicaciones) {

        int n = ubicaciones.length;
        int pos_menor;
        Ubicacion temp;

        for (int i = 1; i <= n - 1; i++) {
            pos_menor = i;
            for (int j = i + 1; j < n; j++) {
                if (ubicaciones[j].getDistancia() < ubicaciones[pos_menor].getDistancia()) {
                    pos_menor = j;
                }
            }

            temp = ubicaciones[i];
            ubicaciones[i] = ubicaciones[pos_menor];
            ubicaciones[pos_menor] = temp;

        }
    }

    public static void aleatoria() {
        String frases[] = { "sucios", "feos", "peligrosos", "infectados", "putrefactos" };

        Random random = new Random();
        int n = random.nextInt(4);
        System.out.println(frases[n]);
        System.out.println("");
    }

    public static void cambiarNombre(Zombie[] zombies, int posicion, String nuevoNombre) {
        zombies[posicion].setNombre(nuevoNombre);
    }

    public static void BorrarPantalla() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

}
