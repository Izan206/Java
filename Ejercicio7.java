import java.util.Scanner;
public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce un numero entero: ");
        if (sc.hasNextInt()){
            int numero=sc.nextInt();
            if (numero>0) {
                System.out.println("Es un numero positivo");
            } else if (numero==0){
                System.out.println("Tu numero es igual a 0");
            } else {
                System.out.println("Tu numero es negativo");
            }
        } else {
            System.out.println("No es un numero entero");
        }
    }
}
