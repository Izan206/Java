import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero entero:");
        int a = sc.nextInt();
        System.out.println("Introduce otro:");
        int b = sc.nextInt();
        System.out.println("Otro:");
        int c = sc.nextInt();

        int mayor = a;

        if (b > mayor) {
            mayor = b;
        }
        if (c > mayor) {
            mayor = c;
        }

        System.out.println(mayor + " es el mayor");
    }
}
