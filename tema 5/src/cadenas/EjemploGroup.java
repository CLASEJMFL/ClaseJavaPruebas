import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EjemploGroup {
    public static void main(String[] args) {
        String cadena = "\"=((4_geeks %&Academy$.$%$.$.\"";
        Pattern myPattern = Pattern.compile("\\w+");
        Matcher myMatcher = myPattern.matcher(cadena);
        while (myMatcher.find()) {
            System.out.println("Encontrado: "+myMatcher.group()+ ", desde la posicion: "+myMatcher.start()+" hasta: "+myMatcher.end());
        }
    }
}

// Consola:
// Encontrado: 4_geeks, desde la posicion: 3 hasta:10
// Encontrado: Academy, desde la pocion:13 hasta:20