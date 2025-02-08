package Boletin2;

import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingresa el total de la cuenta: ");
        double cuenta=sc.nextDouble();
        System.out.println("Que % de propina quieres dejar?");
        double propina=sc.nextDouble();

        double propinaconvertida=(propina*cuenta)/100;
        System.out.println("Dejarás "+propinaconvertida+" $ en propina");
        double total=propinaconvertida+cuenta;
        System.out.println("Así que, en total te quedaria en "+total+" $");

    }
}
