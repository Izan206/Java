import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un año");
        int año = sc.nextInt();
        if ((año % 4 == 0 && año % 100 != 0) || (año % 4 == 0 && año % 100 == 0 && año % 400 == 0)) {
            System.out.println(año + " es bisiesto");
        } else {
            System.out.println(año + " no es bisiesto");
        }
    }
}
