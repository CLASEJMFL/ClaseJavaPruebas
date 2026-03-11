import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EjemploExp_Group {
    public static void main(String[] args) {
        Pattern myPattern = Pattern.compile("(\\d{2})-(\\d{2})-(\\d{4})(;(\\d{2})-(\\d{2})-(\\d{4}))*");
        Matcher myMatcher = myPattern.matcher("13-05-1969;28-09-2003");
        while (myMatcher.find()) {
            System.out.println("Encontrado: "+myMatcher.group()+ ", desde la posicion: " + myMatcher.start()+ " hasta: "+myMatcher.end());
            System.out.println("Encontrado: "+myMatcher.group(1)+ ", desde la posicion: " + myMatcher.start(1)+ " hasta: "+myMatcher.end(1));
            System.out.println("Encontrado: "+myMatcher.group(2)+ ", desde la posicion: " + myMatcher.start(2)+ " hasta: "+myMatcher.end(2));
            System.out.println("Encontrado: "+myMatcher.group(3)+ ", desde la posicion: " + myMatcher.start(3)+ " hasta: "+myMatcher.end(3));
        }
    }
}
