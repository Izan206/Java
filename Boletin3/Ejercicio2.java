import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero entero: ");
        if (sc.hasNextInt()) {
            int numero = sc.nextInt();
            int suma = 0;
            for (int i = 0; i <= numero; i++) {
                suma += i;

            }
            System.out.println("El resultado es: " + suma);
        } else {
            System.out.println("No es un numero completo");
            return;
        }
    }
}
