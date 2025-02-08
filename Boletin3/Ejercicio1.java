import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero");
        int numero = sc.nextInt();
        System.out.println("Su tabla de multiplicar es: ");
        /*for (int i = 0; i <= 10; i++) {

            System.out.println("2x" + i + "=" + numero * i);
        }*/

        int i=0;
        while (i<=10) {
            System.out.println("2x" + i + "=" + numero * i);
            i++;
            
        }
    }
}
