public class EjemploMatches2 {
       public static void main(String[] args) {
        String myString = "   %usuario1usuario2$%&";
        String myPattern1 = "^\\s+.";
        Boolean matchExists1 = myString.matches(myPattern1);
        String myPattern2 = "\\sss*";
        Boolean matchExists2 = myString.matches(myPattern2);
        

        System.out.println("Se a encontrado palabras: " + matchExists1);
        System.out.println("Se a encontrado palabras: " + matchExists2);
       }
}
// Consola:
// Se han encontrado palabras: false
// Se han encontrado palabras: true