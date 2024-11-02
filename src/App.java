import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("************ EJERCICIO 1 ****************");
        Ejercicio1();
        System.out.println("\n");

        System.out.println("************ EJERCICIO 2 ****************");
        Ejercicio2();
        System.out.println("\n");

        System.out.println("************ EJERCICIO 3 ****************");
        Ejercicio3();
        System.out.println("\n");

        System.out.println("************ EJERCICIO 4 ****************");
        Ejercicio4();
        System.out.println("\n");

        System.out.println("************ EJERCICIO 5 ****************");
        Ejercicio5();
        System.out.println("\n");

        System.out.println("************ EJERCICIO 6 ****************");
        Ejercicio6();
        System.out.println("\n");

        System.out.println("************ EJERCICIO 7 ****************");
        Ejercicio7(scanner);
        System.out.println("\n");

        System.out.println("************ EJERCICIO 8 ****************");
        Ejercicio8(scanner);
        System.out.println("\n");

        System.out.println("************ EJERCICIO 9 ****************");
        Ejercicio9(scanner, scanner);
        System.out.println("\n");

        System.out.println("************ EJERCICIO 10 ****************");
        Ejercicio10(scanner);
        System.out.println("\n");

    }

    public static void Ejercicio1() {
        var calculoMatematico = 6 / 2 * (1 + 2);

        System.out.println("El resultado es: " + calculoMatematico);
        System.out.println(
                "Este resultado da 9 por que prioriza la division despues la suma porque esta en () y por ultimo la multiplicación...");
    }

    public static void Ejercicio2() {
        var precioKilo = 5.95 * 10;
        var producto = "Pernil iberic";

        System.out.printf("El precio de %s de un 1Kg es de %.2f%n", producto, precioKilo);
    }

    public static void Ejercicio3() {
        var pecesRojos = 284;
        var pecesAzulez = 163;

        var pecesTotales = pecesRojos + pecesAzulez;

        System.out.println("Hay en total " + pecesTotales + " peces");
    }

    public static void Ejercicio4() {
        var gastoCarmen = 23 - 12.75;

        System.out.println("Carmen se ha gastado " + gastoCarmen + "€");
    }

    public static void Ejercicio5() {
        var precio = 660;
        var descuento = 0.10;

        var precioConDescuento = precio - (precio * descuento);

        System.out.println("El precio que se pago por los computadores fue de: " + precioConDescuento);
    }

    public static void Ejercicio6() {
        var precioFinal = 34;
        var porcentajePrecioFinal = 0.85;

        var precioOriginal = precioFinal / porcentajePrecioFinal;

        System.out.println("El precio sin descuento es de: " + precioOriginal + "€");
    }

    public static void Ejercicio7(Scanner calculadora) {
        int[] num = new int[2];
        var suma = 0;

        for (int i = 0; i < num.length; i++) {
            System.out.println("Ingrese un mumero entero #" + (i + 1) + ": ");
            num[i] = calculadora.nextInt();

            suma += num[i];
        }
        System.out.println("La suma de los dos numeros es: " + suma);
    }

    public static void Ejercicio8(Scanner rectangulo) {

        System.out.print("Ingresa la medida de la base: ");
        var base = rectangulo.nextFloat();
        System.out.print("Ingresa la medida de la altura: ");
        var altura = rectangulo.nextFloat();

        var area = 2 * (base * altura);
        var perimetro = base * altura;

        System.out.printf("El calculo del area es: %.2f%n", area);
        System.out.printf("El calculo del perimetro es: %.2f", perimetro);
    }

    public static void Ejercicio9(Scanner temperatura, Scanner opciones) {
        System.out.print("Ingresa la temperatura en grados Celsius: ");
        var celsius = temperatura.nextFloat();

        var fahrenheit = celsius * 9 / 5 + 32;
        var kelvin = celsius + 273.15;

        System.out.println("Quieres ver la conversion en: " + "\n" +
                "1. grados Fahrenheit..." + "\n" +
                "2. grados Kelvin...");

        System.out.print("Imgresa una opcion: ");
        var opcion = opciones.nextInt();

        switch (opcion) {
            case 1:
                System.out.printf("Los grados en Fahrenheit es: %.2f%n", fahrenheit);
                break;
            case 2:
                System.out.printf("Los grados en kelvin es: %.2f%n", kelvin);
                break;

            default:
                System.out.println("Opcion invalida...");
                break;
        }
    }

    public static void Ejercicio10(Scanner mediaAritmetica) {

        int[] nums = new int[3];
        var suma = 0;

        for (int i = 0; i < nums.length; i++) {
            System.out.println("Ingresa numero entero #" + (i + 1) + ": ");
            nums[i] = mediaAritmetica.nextInt();

            suma += nums[i];
        }

        System.out.printf("La suma de los 3 numeros es: %d", suma);
    }
}
