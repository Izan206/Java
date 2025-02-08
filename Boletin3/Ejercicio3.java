import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        int numero = sc.nextInt();

        if (numero <= 1) {
            System.out.println(numero + " no es primo");
            return;
        }

        boolean esPrimo = true; 
        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                esPrimo = false; 
                break; 
            }
        }

        
        if (esPrimo) {
            System.out.println(numero + " es primo");
        } else {
            System.out.println(numero + " no es primo");
        }
    }
}
