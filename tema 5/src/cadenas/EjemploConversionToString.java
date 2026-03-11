import java.util.InputMismatchException;
import java.util.Scanner;

public class EjemploConversionToString {
    public static void main(String[] args) {
        // Declaramos el objeto de scanner
        Scanner sc = new Scanner(System.in);

        int edad;

        // Nos aseguramos de que el usuario introduce un numero entero
        while (true) {
            try {
                System.out.print("Introduzca un numero entero: ");

                edad = sc.nextInt();
                break;
            } catch(InputMismatchException ex){
                System.out.print("Debe introducir un numero entero.\n");

                // Limpiamos el buffer
                sc.next();
            }
        }

        String cadenaEdad = "";

        // Variable numeria + ""
        String cadena = edad + cadenaEdad;
        System.out.println(cadena);

        // String.valueof(cariableNumerica)
        cadena = String.valueOf(edad);
        System.out.println(cadena);

        // Cerramos el flujo de entrada de datos
        sc.close();
    }
}