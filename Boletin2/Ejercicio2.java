package Boletin2;

import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce en que año naciste");
        int fecha=sc.nextInt();
        System.out.println("introduce el año actual: ");
        int fechaActual=sc.nextInt();

        int edad=fechaActual-fecha;
        System.out.println("Tienes "+edad+" años");
    }
}
