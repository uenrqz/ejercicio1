import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            mostrarMenu();
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    imprimirHolaMundo();
                    break;
                case 2:
                    realizarSuma(sc);
                    break;
                case 3:
                    Espar(sc);
                    break;
                case 4:

                    break;
                case 5:

                    break;
                case 6:
                    System.out.println("Saliendo del programa, paz");
                    break;
                default:
                    System.out.println("Opción no válida, por favor intente de nuevo.");
            }
        } while (opcion != 6);

        sc.close();
    }

    // Método para mostrar el menú
    private static void mostrarMenu() {
        System.out.println("Menú de opciones");
        System.out.println("1. Hola Mundo");
        System.out.println("2. Suma de Números");
        System.out.println("3. Verificar si un número es par");
        System.out.println("4. Numero Factorial");
        System.out.println("5. Tabla de multiplicar");
        System.out.println("6. Salir");

    }

    // Método para imprimir "Hola Mundo"
    private static void imprimirHolaMundo() {
        System.out.println("HOLA_MUNDO");
    }

    // Método para realizar la suma de dos números
    private static void realizarSuma(Scanner sc) {
        System.out.println("Ingrese el primer número");
        int a = sc.nextInt();
        System.out.println("Ingrese el segundo número");
        int b = sc.nextInt();
        int resultado = a + b;
        System.out.println("La suma es " + a + " + " + b + " = " + resultado);
    }
    //metodo para saber si un numero es par
    private static boolean EsNumPar(int num) {
        return num % 2 == 0;
    }
    // metodo para mostrar si es par o no
    public static void  Espar(Scanner sc) {
        System.out.println("Ingrese un numero");
        int num = sc.nextInt();
        if (EsNumPar(num)) {
            System.out.println("El numero es par");
        }
        else{
            System.out.println("El numero es impar");
        }

    }


}
