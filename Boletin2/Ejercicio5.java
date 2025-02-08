import java.util.Scanner;
public class Ejercicio5 {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce un numero entero:");
        int x=sc.nextInt();
        System.out.println("Introduce otro:");
        int y=sc.nextInt();
        System.out.println("Otro:");
        int z=sc.nextInt();
        System.out.println("Otro:");
        int w=sc.nextInt();
        System.out.println("Otro:");
        int v=sc.nextInt();
        System.out.println("Otro:");
        int u=sc.nextInt();

        int operacion=(x+y)*(z-w)/v+u;
        System.out.println("Operacion: "+operacion);
    }
}
