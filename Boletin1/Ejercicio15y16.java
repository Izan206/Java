import java.util.Scanner;

public class Ejercicio15y16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean esNumerico;
        System.out.println("Introduce un numero: ");
        int num1, num2;
        if (sc.hasNextInt()) {
            num1 = sc.nextInt();
            esNumerico = true;
        } else {
            System.out.println("No es un numero");
            esNumerico = false;
            return;
        }
        System.out.println("Introduce otro numero: ");
        if (sc.hasNextInt()) {
            num2 = sc.nextInt();
            esNumerico = true;
        } else {
            System.out.println("No es un numero");
            esNumerico = false;
            return;
        }

        if (esNumerico) {
            int suma = num1 + num2;
            System.out.println("Suma: " + suma);

            int resta = num1 - num2;
            System.out.println("Resta: " + resta);

            int multiplicacion = num1 * num2;
            System.out.println("Multiplicacion: " + multiplicacion);

            int division = num1 / num2;
            System.out.println("Division: " + division);

        }
    }
}
