import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce un numero entero:");
        int a=sc.nextInt();
        System.out.println("Introduce otro:");
        int b=sc.nextInt();
        System.out.println("Otro:");
        int c=sc.nextInt();

        int op1=(a+b)*c;
        System.out.println("Operacion 1: "+op1);
        int op2=a+b*c;
        System.out.println("Operacion 2:"+op2);

    }
}
