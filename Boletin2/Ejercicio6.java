import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un numero entero: ");
        int numero = sc.nextInt();
        if (numero % 2 == 0) {
            System.out.println("Tu numero es par");
        } else {
            System.out.println("Tu numero es impar");
        }
    }
}
