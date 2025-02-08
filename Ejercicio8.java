import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        int num1 = sc.nextInt();
        System.out.println("Introduce otro: ");
        int num2 = sc.nextInt();
        sc.nextLine();
        System.out.println("Introduce una operacion (suma, resta, multiplicacion o division)");
        String operacion = sc.nextLine();

        if (operacion.equalsIgnoreCase("suma")) {
            int suma = num1 + num2;
            System.out.println("La suma da: " + suma);
        } else if (operacion.equalsIgnoreCase("resta")) {
            int resta = num1 - num2;
            System.out.println("La resta da: " + resta);
        } else if (operacion.equalsIgnoreCase("multiplicacion")) {
            int multiplicacion = num1 * num2;
            System.out.println("La multiplicacion da: " + multiplicacion);
        } else if (operacion.equalsIgnoreCase("division")) {
            if (num2 == 0) {
                System.out.println("No puedes dividir entre 0 un numero");
                return;
            } else {
                int division = num1 / num2;
                System.out.println("La division da: " + division);
            }

        } else {
            System.out.println("No has introducido ninguna operacion de las mencionadas");
        }
    }
}
