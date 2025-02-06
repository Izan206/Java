public class Ejercicio14 {
    public static void main(String[] args) {
        double vdouble=2.5;

        System.out.println("Numero original: ");
        System.out.println(vdouble);
        
        System.out.println("Parte entera");
        int variableEntera=(int) vdouble;
        System.out.println(variableEntera);
        System.out.println("Parte decimal");
        double parteDecimal=vdouble-variableEntera;
        System.out.println(parteDecimal);

    }
}
