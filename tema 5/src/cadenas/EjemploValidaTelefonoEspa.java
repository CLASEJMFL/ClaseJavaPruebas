import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EjemploValidaTelefonoEspa {
    public static void main(String[] args) {
        // 1. Definimos la expresion regilar proporcionada
        // Nota: Usamos \\+ para el simbolo mas y \\s para el espacio en blanco
        String regex = "^\\+34\\s[679]\\d{8}$";

        // 2. Compilamos el patron
        Pattern patron = Pattern.compile(regex);

        // 3. Casos de prueba
        String[] telefonos = {
            "+34 600123456", // Valido
            "+34 912345678", // valido
            "+34 500123456", // invalido
            "+34 600123456", // invalido
            "+34 60073456", // invalido
            "+34 712345678" // valido
        };
        System.out.println("Validacion de telefonos (Formato: +34[6,7,9]XXXXXXXX");
        System.out.println("-------------------------------------------------------------------------------------");

        for (String t : telefonos) {
            Matcher matcher = patron.matcher(t);
            
            if (matcher.matches()){
                System.out.println(t +" ----> CORRECTO");
            } else {
                System.out.println(t+" ---> ERROR DE FORMATO");
            }
        }


    }
}
